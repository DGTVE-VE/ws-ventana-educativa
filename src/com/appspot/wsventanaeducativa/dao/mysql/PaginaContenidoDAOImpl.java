package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.PaginaContenido;
import com.appspot.wsventanaeducativa.dao.PaginaContenidoDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class PaginaContenidoDAOImpl extends BaseDAO implements PaginaContenidoDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(PaginaContenido data){}

	public PaginaContenido load(final Long id) throws Exception{
		String sql = "SELECT * FROM pagina_contenido WHERE id=?";
		return (PaginaContenido) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			PaginaContenido row  = new PaginaContenido();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setX(rs.getLong("x"));
				row.setY(rs.getLong("y"));
				row.setUrl(rs.getString("url"));
				row.setTipoContenido(rs.getString("tipo_contenido"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM pagina_contenido WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final PaginaContenido data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE pagina_contenido SET id_pag = ?, id_libro = ?, x = ?, y = ?, url = ?, tipo_contenido = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdPag());
				ps.setLong(2, data.getIdLibro());
				ps.setLong(3, data.getX());
				ps.setLong(4, data.getY());
				ps.setString(5, data.getUrl());
				ps.setString(6, data.getTipoContenido());
				ps.setString(7, data.getFechaCreacion());
				ps.setString(8, data.getFechaModificacion());
				ps.setLong(9, data.getIdContenido());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			PaginaContenido row  = new PaginaContenido();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setX(rs.getLong("x"));
				row.setY(rs.getLong("y"));
				row.setUrl(rs.getString("url"));
				row.setTipoContenido(rs.getString("tipo_contenido"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final PaginaContenido data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO pagina_contenido ( id_pag, id_libro, x, y, url, tipo_contenido, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdPag());
				ps.setLong(2, data.getIdLibro());
				ps.setLong(3, data.getX());
				ps.setLong(4, data.getY());
				ps.setString(5, data.getUrl());
				ps.setString(6, data.getTipoContenido());
				ps.setString(7, data.getFechaCreacion());
				ps.setString(8, data.getFechaModificacion());
			}
		});
		data.setIdContenido(id);
		return id;
	}

	public List<PaginaContenido> queryAll()throws Exception{
		String sql = "SELECT * FROM pagina_contenido";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				PaginaContenido row = new PaginaContenido();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setX(rs.getLong("x"));
				row.setY(rs.getLong("y"));
				row.setUrl(rs.getString("url"));
				row.setTipoContenido(rs.getString("tipo_contenido"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				PaginaContenido row = new PaginaContenido();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setX(rs.getLong("x"));
				row.setY(rs.getLong("y"));
				row.setUrl(rs.getString("url"));
				row.setTipoContenido(rs.getString("tipo_contenido"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<PaginaContenido> queryByIdContenido(Long idContenido)throws Exception{
		String sql = "SELECT * FROM pagina_contenido WHERE id_contenido='"+idContenido+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				PaginaContenido row = new PaginaContenido();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setX(rs.getLong("x"));
				row.setY(rs.getLong("y"));
				row.setUrl(rs.getString("url"));
				row.setTipoContenido(rs.getString("tipo_contenido"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<PaginaContenido> queryByIdPag(Long idPag)throws Exception{
		String sql = "SELECT * FROM pagina_contenido WHERE id_pag='"+idPag+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				PaginaContenido row = new PaginaContenido();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setX(rs.getLong("x"));
				row.setY(rs.getLong("y"));
				row.setUrl(rs.getString("url"));
				row.setTipoContenido(rs.getString("tipo_contenido"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<PaginaContenido> queryByIdLibro(Long idLibro)throws Exception{
		String sql = "SELECT * FROM pagina_contenido WHERE id_libro='"+idLibro+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				PaginaContenido row = new PaginaContenido();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setX(rs.getLong("x"));
				row.setY(rs.getLong("y"));
				row.setUrl(rs.getString("url"));
				row.setTipoContenido(rs.getString("tipo_contenido"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<PaginaContenido> queryByX(Long x)throws Exception{
		String sql = "SELECT * FROM pagina_contenido WHERE x='"+x+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				PaginaContenido row = new PaginaContenido();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setX(rs.getLong("x"));
				row.setY(rs.getLong("y"));
				row.setUrl(rs.getString("url"));
				row.setTipoContenido(rs.getString("tipo_contenido"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<PaginaContenido> queryByY(Long y)throws Exception{
		String sql = "SELECT * FROM pagina_contenido WHERE y='"+y+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				PaginaContenido row = new PaginaContenido();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setX(rs.getLong("x"));
				row.setY(rs.getLong("y"));
				row.setUrl(rs.getString("url"));
				row.setTipoContenido(rs.getString("tipo_contenido"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<PaginaContenido> queryByUrl(String url)throws Exception{
		String sql = "SELECT * FROM pagina_contenido WHERE url='"+url+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				PaginaContenido row = new PaginaContenido();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setX(rs.getLong("x"));
				row.setY(rs.getLong("y"));
				row.setUrl(rs.getString("url"));
				row.setTipoContenido(rs.getString("tipo_contenido"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<PaginaContenido> queryByTipoContenido(String tipoContenido)throws Exception{
		String sql = "SELECT * FROM pagina_contenido WHERE tipo_contenido='"+tipoContenido+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				PaginaContenido row = new PaginaContenido();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setX(rs.getLong("x"));
				row.setY(rs.getLong("y"));
				row.setUrl(rs.getString("url"));
				row.setTipoContenido(rs.getString("tipo_contenido"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<PaginaContenido> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM pagina_contenido WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				PaginaContenido row = new PaginaContenido();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setX(rs.getLong("x"));
				row.setY(rs.getLong("y"));
				row.setUrl(rs.getString("url"));
				row.setTipoContenido(rs.getString("tipo_contenido"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<PaginaContenido> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM pagina_contenido WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				PaginaContenido row = new PaginaContenido();
				row.setIdContenido(rs.getLong("id_contenido"));
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setX(rs.getLong("x"));
				row.setY(rs.getLong("y"));
				row.setUrl(rs.getString("url"));
				row.setTipoContenido(rs.getString("tipo_contenido"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}