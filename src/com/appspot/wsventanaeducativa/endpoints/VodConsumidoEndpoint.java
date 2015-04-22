package com.appspot.wsventanaeducativa.endpoints;

import com.appspot.wsventanaeducativa.dao.DAOFactory;
import com.appspot.wsventanaeducativa.dao.LibroConsumidoDAO;
import com.appspot.wsventanaeducativa.dao.VodConsumidoDAO;
import com.appspot.wsventanaeducativa.dao.dto.EMF;
import com.appspot.wsventanaeducativa.dao.dto.LibroConsumido;
import com.appspot.wsventanaeducativa.dao.dto.VodConsumido;
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

@Api(name = "vodconsumidoendpoint", namespace = @ApiNamespace(ownerDomain = "appspot.com", ownerName = "appspot.com", packagePath = "wsventanaeducativa.dao.dto"))
public class VodConsumidoEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listVodConsumido")
	public CollectionResponse<VodConsumido> listVodConsumido(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		VodConsumidoDAO dao = DAOFactory.getVodConsumidoDAO();
		try {
			List<VodConsumido> vodConsumido= dao.queryAll();
			return CollectionResponse.<VodConsumido> builder().setItems(vodConsumido)
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
	@ApiMethod(name = "getVodConsumido")
	public VodConsumido getVodConsumido(@Named("id") Long id) {
		VodConsumidoDAO dao = DAOFactory.getVodConsumidoDAO();
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
	 * @param vodconsumido the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertVodConsumido")
	public VodConsumido insertVodConsumido(VodConsumido vodConsumido) {
		VodConsumidoDAO dao = DAOFactory.getVodConsumidoDAO();
		try {
			
			dao.insert(vodConsumido);
			return vodConsumido;
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
	 * @param vodconsumido the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateVodConsumido")
	public VodConsumido updateVodConsumido(VodConsumido vodConsumido) {
		VodConsumidoDAO dao = DAOFactory.getVodConsumidoDAO();
		try {
			
			dao.insert(vodConsumido);
			return vodConsumido;
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
	@ApiMethod(name = "removeVodConsumido")
	public void removeVodConsumido(@Named("id") Long id) {
		VodConsumidoDAO dao = DAOFactory.getVodConsumidoDAO();
		try {
			dao.delete(id);			
		} catch (Exception e) {
			e.printStackTrace();			
		}	
	}

	private boolean containsVodConsumido(VodConsumido vodConsumido) {
		
		return false;
	}

}
