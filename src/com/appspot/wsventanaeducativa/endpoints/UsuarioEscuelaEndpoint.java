package com.appspot.wsventanaeducativa.endpoints;

import com.appspot.wsventanaeducativa.dao.DAOFactory;
import com.appspot.wsventanaeducativa.dao.LibroConsumidoDAO;
import com.appspot.wsventanaeducativa.dao.UsuarioEscuelaDAO;
import com.appspot.wsventanaeducativa.dao.dto.EMF;
import com.appspot.wsventanaeducativa.dao.dto.LibroConsumido;
import com.appspot.wsventanaeducativa.dao.dto.UsuarioEscuela;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JPACursorHelper;

import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Api(name = "usuarioescuelaendpoint", namespace = @ApiNamespace(ownerDomain = "appspot.com", ownerName = "appspot.com", packagePath = "wsventanaeducativa.dao.dto"))
public class UsuarioEscuelaEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listUsuarioEscuela")
	public CollectionResponse<UsuarioEscuela> listUsuarioEscuela(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		UsuarioEscuelaDAO dao = DAOFactory.getUsuarioEscuelaDAO();
		try {
			List<UsuarioEscuela> usuarioEscuela= dao.queryAll();
			return CollectionResponse.<UsuarioEscuela> builder().setItems(usuarioEscuela)
					.setNextPageToken(cursorString).build();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
	}
	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getUsuarioEscuela")
	public UsuarioEscuela getUsuarioEscuela(@Named("id") Long id) {
		UsuarioEscuelaDAO dao = DAOFactory.getUsuarioEscuelaDAO();
		try {
			return dao.load(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param usuarioescuela the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertUsuarioEscuela")
	public UsuarioEscuela insertUsuarioEscuela(UsuarioEscuela usuarioEscuela) {
		UsuarioEscuelaDAO dao = DAOFactory.getUsuarioEscuelaDAO();
		try {
			
			dao.insert(usuarioEscuela);
			return usuarioEscuela;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}


	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param usuarioescuela the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateUsuarioEscuela")
	public UsuarioEscuela updateUsuarioEscuela(UsuarioEscuela usuarioEscuela) {
		UsuarioEscuelaDAO dao = DAOFactory.getUsuarioEscuelaDAO();
		try {
			
			dao.insert(usuarioEscuela);
			return usuarioEscuela;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}


	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeUsuarioEscuela")
	public void removeUsuarioEscuela(@Named("id") Long id) {
		UsuarioEscuelaDAO dao = DAOFactory.getUsuarioEscuelaDAO();
		try {
			dao.delete(id);			
		} catch (Exception e) {
			e.printStackTrace();			
		}	
	}

	private boolean containsUsuarioEscuela(UsuarioEscuela usuarioEscuela) {
		
		return false;
	}

}
