package com.appspot.wsventanaeducativa.endpoints;

import com.appspot.wsventanaeducativa.dao.CategoriaDAO;
import com.appspot.wsventanaeducativa.dao.CategoriasVodDAO;
import com.appspot.wsventanaeducativa.dao.DAOFactory;
import com.appspot.wsventanaeducativa.dao.dto.Categoria;
import com.appspot.wsventanaeducativa.dao.dto.CategoriasVod;
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

@Api(name = "categoriasvodendpoint", namespace = @ApiNamespace(ownerDomain = "appspot.com", ownerName = "appspot.com", packagePath = "wsventanaeducativa.dao.dto"))
public class CategoriasVodEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listCategoriasVod")
	public CollectionResponse<CategoriasVod> listCategoriasVod(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		CategoriasVodDAO dao = DAOFactory.getCategoriasVodDAO();
		try {
			List<CategoriasVod> categoriasVod= dao.queryAll();
			return CollectionResponse.<CategoriasVod> builder().setItems(categoriasVod)
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
	@ApiMethod(name = "getCategoriasVod")
	public CategoriasVod getCategoriasVod(@Named("id") String id) {
		CategoriasVodDAO dao = DAOFactory.getCategoriasVodDAO();
		try {
			CategoriasVod categoriasVod= dao.load(id);
			return categoriasVod;
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
	 * @param categoriasvod the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertCategoriasVod")
	public CategoriasVod insertCategoriasVod(CategoriasVod categoriasvod) {
		CategoriasVodDAO dao = DAOFactory.getCategoriasVodDAO();
		try {
			dao.insert(categoriasvod);
			return categoriasvod;
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
	 * @param categoriasvod the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateCategoriasVod")
	public CategoriasVod updateCategoriasVod(CategoriasVod categoriasvod) {
		CategoriasVodDAO dao = DAOFactory.getCategoriasVodDAO();
		try {
			dao.update(categoriasvod);
			return categoriasvod;
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
	@ApiMethod(name = "removeCategoriasVod")
	public void removeCategoriasVod(@Named("id") String id) {
		CategoriasVodDAO dao = DAOFactory.getCategoriasVodDAO();
		try {
			dao.delete(id);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}	
	}

	private boolean containsCategoriasVod(CategoriasVod categoriasvod) {
		return false;
	}

	private static EntityManager getEntityManager() {
		return EMF.get().createEntityManager();
	}

}
