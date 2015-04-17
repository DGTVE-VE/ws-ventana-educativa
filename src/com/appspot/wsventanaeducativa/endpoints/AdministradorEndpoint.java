package com.appspot.wsventanaeducativa.endpoints;

import com.appspot.wsventanaeducativa.dao.dto.Administrador;
import com.appspot.wsventanaeducativa.dao.dto.EMF;
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

@Api(	name = "administradorendpoint", 
		namespace = @ApiNamespace(	ownerDomain = "appspot.com", 
									ownerName = "appspot.com", 
									packagePath = "wsventanaeducativa.dao.dto"))
public class AdministradorEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listAdministrador")
	public CollectionResponse<Administrador> listAdministrador(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<Administrador> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr
					.createQuery("select from Administrador as Administrador");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<Administrador>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Administrador obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Administrador> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getAdministrador")
	public Administrador getAdministrador(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		Administrador administrador = null;
		try {
			administrador = mgr.find(Administrador.class, id);
		} finally {
			mgr.close();
		}
		return administrador;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param administrador the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertAdministrador")
	public Administrador insertAdministrador(Administrador administrador) {
		EntityManager mgr = getEntityManager();
		try {
			if (containsAdministrador(administrador)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(administrador);
		} finally {
			mgr.close();
		}
		return administrador;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param administrador the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateAdministrador")
	public Administrador updateAdministrador(Administrador administrador) {
		EntityManager mgr = getEntityManager();
		try {
			if (!containsAdministrador(administrador)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(administrador);
		} finally {
			mgr.close();
		}
		return administrador;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeAdministrador")
	public void removeAdministrador(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			Administrador administrador = mgr.find(Administrador.class, id);
			mgr.remove(administrador);
		} finally {
			mgr.close();
		}
	}

	private boolean containsAdministrador(Administrador administrador) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			Administrador item = mgr.find(Administrador.class,
					administrador.getIdAdministrador());
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
