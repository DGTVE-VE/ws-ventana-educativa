package com.appspot.wsventanaeducativa.endpoints;

import com.appspot.wsventanaeducativa.dao.DAOFactory;
import com.appspot.wsventanaeducativa.dao.InstitucionDAO;
import com.appspot.wsventanaeducativa.dao.TipoPantallaDAO;
import com.appspot.wsventanaeducativa.dao.dto.EMF;
import com.appspot.wsventanaeducativa.dao.dto.Institucion;
import com.appspot.wsventanaeducativa.dao.dto.TipoPantalla;
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

@Api(name = "tipopantallaendpoint", namespace = @ApiNamespace(ownerDomain = "appspot.com", ownerName = "appspot.com", packagePath = "wsventanaeducativa.dao.dto"))
public class TipoPantallaEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listTipoPantalla")
	public CollectionResponse<TipoPantalla> listTipoPantalla(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		TipoPantallaDAO dao = DAOFactory.getTipoPantallaDAO();
		try {
			List<TipoPantalla> tipoPantalla= dao.queryAll();
			return CollectionResponse.<TipoPantalla> builder().setItems(tipoPantalla)
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
	@ApiMethod(name = "getTipoPantalla")
	public TipoPantalla getTipoPantalla(@Named("id") String id) {
		TipoPantallaDAO dao = DAOFactory.getTipoPantallaDAO();
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
	 * @param tipopantalla the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertTipoPantalla")
	public TipoPantalla insertTipoPantalla(TipoPantalla tipoPantalla) {
		TipoPantallaDAO dao = DAOFactory.getTipoPantallaDAO();
		try {
			
			dao.insert(tipoPantalla);
			return tipoPantalla;
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
	 * @param tipopantalla the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateTipoPantalla")
	public TipoPantalla updateTipoPantalla(TipoPantalla tipoPantalla) {
		TipoPantallaDAO dao = DAOFactory.getTipoPantallaDAO();
		try {
			
			dao.insert(tipoPantalla);
			return tipoPantalla;
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
	@ApiMethod(name = "removeTipoPantalla")
	public void removeTipoPantalla(@Named("id") String id) {
		EntityManager mgr = getEntityManager();
		try {
			TipoPantalla tipopantalla = mgr.find(TipoPantalla.class, id);
			mgr.remove(tipopantalla);
		} finally {
			mgr.close();
		}
	}

	private boolean containsTipoPantalla(TipoPantalla tipopantalla) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			TipoPantalla item = mgr.find(TipoPantalla.class,
					tipopantalla.getTipoPantalla());
			if (item == null) {
				contains = false;
			}
		} finally {
			mgr.close();
		}
		return contains;
	}

	private static EntityManager getEntityManager() {
		return EMF.get().createEntityManager();
	}

}
