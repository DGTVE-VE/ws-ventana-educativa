package com.appspot.wsventanaeducativa.endpoints;

import com.appspot.wsventanaeducativa.dao.CategoriaDAO;
import com.appspot.wsventanaeducativa.dao.CategoriasVodDAO;
import com.appspot.wsventanaeducativa.dao.DAOFactory;
import com.appspot.wsventanaeducativa.dao.EscuelaDAO;
import com.appspot.wsventanaeducativa.dao.UsuarioDAO;
import com.appspot.wsventanaeducativa.dao.dto.Categoria;
import com.appspot.wsventanaeducativa.dao.dto.CategoriasVod;
import com.appspot.wsventanaeducativa.dao.dto.EMF;
import com.appspot.wsventanaeducativa.dao.dto.Escuela;
import com.appspot.wsventanaeducativa.dao.dto.Usuario;
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

@Api(name = "usuarioendpoint", namespace = @ApiNamespace(ownerDomain = "appspot.com", ownerName = "appspot.com", packagePath = "wsventanaeducativa.dao.dto"))
public class UsuarioEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listUsuario")
	public CollectionResponse<Usuario> listUsuario(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		UsuarioDAO dao = DAOFactory.getUsuarioDAO();
		try {
			List<Usuario> usuario= dao.queryAll();
			return CollectionResponse.<Usuario> builder().setItems(usuario)
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
	@ApiMethod(name = "getUsuario")
	public Usuario getUsuario(@Named("id") Long id) {
		UsuarioDAO dao = DAOFactory.getUsuarioDAO();
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
	 * @param usuario the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertUsuario")
	public Usuario insertUsuario(Usuario usuario) {
		UsuarioDAO dao = DAOFactory.getUsuarioDAO();
		try {
			
			dao.insert(usuario);
			return usuario;
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
	 * @param usuario the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateUsuario")
	public Usuario updateUsuario(Usuario usuario) {
		UsuarioDAO dao = DAOFactory.getUsuarioDAO();
		try {
			
			dao.insert(usuario);
			return usuario;
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
	@ApiMethod(name = "removeUsuario")
	public void removeUsuario(@Named("id") Long id) {
		UsuarioDAO dao = DAOFactory.getUsuarioDAO();
		try {
			dao.delete(id);			
		} catch (Exception e) {
			e.printStackTrace();			
		}	
	}

	private boolean containsUsuario(Usuario usuario) {
		return false;
	}

}
