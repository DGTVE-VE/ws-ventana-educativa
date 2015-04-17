package com.appspot.wsventanaeducativa.dao.dto;

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

@Api(name = "libroendpoint", namespace = @ApiNamespace(ownerDomain = "appspot.com", ownerName = "appspot.com", packagePath = "wsventanaeducativa.dao.dto"))
public class LibroEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listLibro")
	public CollectionResponse<Libro> listLibro(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<Libro> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from Libro as Libro");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<Libro>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Libro obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Libro> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getLibro")
	public Libro getLibro(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		Libro libro = null;
		try {
			libro = mgr.find(Libro.class, id);
		} finally {
			mgr.close();
		}
		return libro;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param libro the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertLibro")
	public Libro insertLibro(Libro libro) {
		EntityManager mgr = getEntityManager();
		try {
			if (containsLibro(libro)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(libro);
		} finally {
			mgr.close();
		}
		return libro;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param libro the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateLibro")
	public Libro updateLibro(Libro libro) {
		EntityManager mgr = getEntityManager();
		try {
			if (!containsLibro(libro)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(libro);
		} finally {
			mgr.close();
		}
		return libro;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeLibro")
	public void removeLibro(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			Libro libro = mgr.find(Libro.class, id);
			mgr.remove(libro);
		} finally {
			mgr.close();
		}
	}

	private boolean containsLibro(Libro libro) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			Libro item = mgr.find(Libro.class, libro.getIdLibro());
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
