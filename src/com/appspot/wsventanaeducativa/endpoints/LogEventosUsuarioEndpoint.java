package com.appspot.wsventanaeducativa.endpoints;

import com.appspot.wsventanaeducativa.dao.DAOFactory;
import com.appspot.wsventanaeducativa.dao.InstitucionDAO;
import com.appspot.wsventanaeducativa.dao.LogEventosUsuarioDAO;
import com.appspot.wsventanaeducativa.dao.dto.Categoria;
import com.appspot.wsventanaeducativa.dao.dto.EMF;
import com.appspot.wsventanaeducativa.dao.dto.Institucion;
import com.appspot.wsventanaeducativa.dao.dto.LogEventosUsuario;
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

@Api(name = "logeventosusuarioendpoint", namespace = @ApiNamespace(ownerDomain = "appspot.com", ownerName = "appspot.com", packagePath = "wsventanaeducativa.dao.dto"))
public class LogEventosUsuarioEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listLogEventosUsuario")
	public CollectionResponse<LogEventosUsuario> listLogEventosUsuario(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		LogEventosUsuarioDAO dao = DAOFactory.getLogEventosUsuarioDAO();
		try {
			List<LogEventosUsuario> logEventosUsuario= dao.queryAll();
			return CollectionResponse.<LogEventosUsuario> builder().setItems(logEventosUsuario)
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
	@ApiMethod(name = "getLogEventosUsuario")
	public LogEventosUsuario getLogEventosUsuario(@Named("id") Long id) {
		LogEventosUsuarioDAO dao = DAOFactory.getLogEventosUsuarioDAO();
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
	 * @param logeventosusuario the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertLogEventosUsuario")
	public LogEventosUsuario insertLogEventosUsuario(LogEventosUsuario logEventosUsuario) {
		LogEventosUsuarioDAO dao = DAOFactory.getLogEventosUsuarioDAO();
		try {
			
			dao.insert(logEventosUsuario);
			return logEventosUsuario;
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
	 * @param logeventosusuario the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateLogEventosUsuario")
	public LogEventosUsuario updateLogEventosUsuario(LogEventosUsuario logEventosUsuario) {
		LogEventosUsuarioDAO dao = DAOFactory.getLogEventosUsuarioDAO();
		try {
			
			dao.insert(logEventosUsuario);
			return logEventosUsuario;
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
	@ApiMethod(name = "removeLogEventosUsuario")
	public void removeLogEventosUsuario(@Named("id") Long id) {
		LogEventosUsuarioDAO dao = DAOFactory.getLogEventosUsuarioDAO();
		try {
			dao.delete(id);			
		} catch (Exception e) {
			e.printStackTrace();			
		}	
	}

	private boolean containsLogEventosUsuario(LogEventosUsuario logEventosUsuario) {
		
		return false;
	}

}
