package com.appspot.wsventanaeducativa.endpoints;

import com.appspot.wsventanaeducativa.dao.DAOFactory;
import com.appspot.wsventanaeducativa.dao.InstitucionDAO;
import com.appspot.wsventanaeducativa.dao.PaginaDAO;
import com.appspot.wsventanaeducativa.dao.dto.Categoria;
import com.appspot.wsventanaeducativa.dao.dto.EMF;
import com.appspot.wsventanaeducativa.dao.dto.Institucion;
import com.appspot.wsventanaeducativa.dao.dto.Pagina;
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

@Api(name = "paginaendpoint", namespace = @ApiNamespace(ownerDomain = "appspot.com", ownerName = "appspot.com", packagePath = "wsventanaeducativa.dao.dto"))
public class PaginaEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listPagina")
	public CollectionResponse<Pagina> listPagina(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PaginaDAO dao = DAOFactory.getPaginaDAO();
		try {
			List<Pagina> paginas= dao.queryAll();
			return CollectionResponse.<Pagina> builder().setItems(paginas)
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
	@ApiMethod(name = "getPagina")
	public Pagina getPagina(@Named("id") Long id) {
		PaginaDAO dao = DAOFactory.getPaginaDAO();
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
	 * @param pagina the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertPagina")
	public Pagina insertPagina(Pagina pagina) {
		PaginaDAO dao = DAOFactory.getPaginaDAO();
		try {
			
			dao.insert(pagina);
			return pagina;
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
	 * @param pagina the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updatePagina")
	public Pagina updatePagina(Pagina pagina) {
		PaginaDAO dao = DAOFactory.getPaginaDAO();
		try {
			
			dao.insert(pagina);
			return pagina;
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
	@ApiMethod(name = "removePagina")
	public void removePagina(@Named("id") Long id) {
		PaginaDAO dao = DAOFactory.getPaginaDAO();
		try {
			dao.delete(id);			
		} catch (Exception e) {
			e.printStackTrace();			
		}	
	}

	private boolean containsPagina(Pagina pagina) {
		
		return false;
	}

}