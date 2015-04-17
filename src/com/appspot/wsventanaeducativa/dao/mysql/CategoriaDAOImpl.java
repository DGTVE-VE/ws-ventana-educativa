package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.Categoria;
import com.appspot.wsventanaeducativa.dao.CategoriaDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class CategoriaDAOImpl extends BaseDAO implements CategoriaDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(Categoria data){}

	public Categoria load(final String id) throws Exception{
		String sql = "SELECT * FROM categorias WHERE id=?";
		return (Categoria) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Categoria row  = new Categoria();
				row.setCategoria(rs.getString("categoria"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setCategoriaPadre(rs.getString("categoria_padre"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final String id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM categorias WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, id);
			}
		});
	}

	public int update(final Categoria data) throws Exception{
		//cache.clear(data.getCategoria());
		String sql = "UPDATE categorias SET descripcion = ?, categoria_padre = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getDescripcion());
				ps.setString(2, data.getCategoriaPadre());
				ps.setString(3, data.getFechaCreacion());
				ps.setString(4, data.getFechaModificacion());
				ps.setString(5, data.getCategoria());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Categoria row  = new Categoria();
				row.setCategoria(rs.getString("categoria"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setCategoriaPadre(rs.getString("categoria_padre"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final Categoria data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO categorias (categoria, descripcion, categoria_padre, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getCategoria());
				ps.setString(2, data.getDescripcion());
				ps.setString(3, data.getCategoriaPadre());
				ps.setString(4, data.getFechaCreacion());
				ps.setString(5, data.getFechaModificacion());
			}
		});
		
		return id;
	}

	@SuppressWarnings("unchecked")
	public List<Categoria> queryAll()throws Exception{
		String sql = "SELECT * FROM categorias";
		return (List<Categoria>) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Categoria row = new Categoria();
				row.setCategoria(rs.getString("categoria"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setCategoriaPadre(rs.getString("categoria_padre"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Categoria row = new Categoria();
				row.setCategoria(rs.getString("categoria"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setCategoriaPadre(rs.getString("categoria_padre"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<Categoria> queryByCategoria(String categoria)throws Exception{
		String sql = "SELECT * FROM categorias WHERE categoria='"+categoria+"'";
		return (List<Categoria>) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Categoria row = new Categoria();
				row.setCategoria(rs.getString("categoria"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setCategoriaPadre(rs.getString("categoria_padre"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Categoria> queryByDescripcion(String descripcion)throws Exception{
		String sql = "SELECT * FROM categorias WHERE descripcion='"+descripcion+"'";
		return (List<Categoria>) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Categoria row = new Categoria();
				row.setCategoria(rs.getString("categoria"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setCategoriaPadre(rs.getString("categoria_padre"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Categoria> queryByCategoriaPadre(String categoriaPadre)throws Exception{
		String sql = "SELECT * FROM categorias WHERE categoria_padre='"+categoriaPadre+"'";
		return (List<Categoria>) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Categoria row = new Categoria();
				row.setCategoria(rs.getString("categoria"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setCategoriaPadre(rs.getString("categoria_padre"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Categoria> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM categorias WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List<Categoria>) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Categoria row = new Categoria();
				row.setCategoria(rs.getString("categoria"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setCategoriaPadre(rs.getString("categoria_padre"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Categoria> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM categorias WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List<Categoria>) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Categoria row = new Categoria();
				row.setCategoria(rs.getString("categoria"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setCategoriaPadre(rs.getString("categoria_padre"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}