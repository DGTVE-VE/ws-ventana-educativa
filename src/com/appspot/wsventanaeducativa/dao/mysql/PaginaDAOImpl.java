package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.Pagina;
import com.appspot.wsventanaeducativa.dao.PaginaDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class PaginaDAOImpl extends BaseDAO implements PaginaDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(Pagina data){}

	public Pagina load(final Long id) throws Exception{
		String sql = "SELECT * FROM pagina WHERE id=?";
		return (Pagina) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Pagina row  = new Pagina();
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setUrl(rs.getString("url"));
				row.setNumeroInterno(rs.getString("numero_interno"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM pagina WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final Pagina data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE pagina SET id_libro = ?, url = ?, numero_interno = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdLibro());
				ps.setString(2, data.getUrl());
				ps.setString(3, data.getNumeroInterno());
				ps.setString(4, data.getFechaCreacion());
				ps.setString(5, data.getFechaModificacion());
				ps.setLong(6, data.getIdPag());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Pagina row  = new Pagina();
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setUrl(rs.getString("url"));
				row.setNumeroInterno(rs.getString("numero_interno"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final Pagina data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO pagina ( id_libro, url, numero_interno, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdLibro());
				ps.setString(2, data.getUrl());
				ps.setString(3, data.getNumeroInterno());
				ps.setString(4, data.getFechaCreacion());
				ps.setString(5, data.getFechaModificacion());
			}
		});
		data.setIdPag(id);
		return id;
	}

	public List<Pagina> queryAll()throws Exception{
		String sql = "SELECT * FROM pagina";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pagina row = new Pagina();
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setUrl(rs.getString("url"));
				row.setNumeroInterno(rs.getString("numero_interno"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pagina row = new Pagina();
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setUrl(rs.getString("url"));
				row.setNumeroInterno(rs.getString("numero_interno"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<Pagina> queryByIdPag(Long idPag)throws Exception{
		String sql = "SELECT * FROM pagina WHERE id_pag='"+idPag+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pagina row = new Pagina();
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setUrl(rs.getString("url"));
				row.setNumeroInterno(rs.getString("numero_interno"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pagina> queryByIdLibro(Long idLibro)throws Exception{
		String sql = "SELECT * FROM pagina WHERE id_libro='"+idLibro+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pagina row = new Pagina();
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setUrl(rs.getString("url"));
				row.setNumeroInterno(rs.getString("numero_interno"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pagina> queryByUrl(String url)throws Exception{
		String sql = "SELECT * FROM pagina WHERE url='"+url+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pagina row = new Pagina();
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setUrl(rs.getString("url"));
				row.setNumeroInterno(rs.getString("numero_interno"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pagina> queryByNumeroInterno(String numeroInterno)throws Exception{
		String sql = "SELECT * FROM pagina WHERE numero_interno='"+numeroInterno+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pagina row = new Pagina();
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setUrl(rs.getString("url"));
				row.setNumeroInterno(rs.getString("numero_interno"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pagina> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM pagina WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pagina row = new Pagina();
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setUrl(rs.getString("url"));
				row.setNumeroInterno(rs.getString("numero_interno"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pagina> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM pagina WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pagina row = new Pagina();
				row.setIdPag(rs.getLong("id_pag"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setUrl(rs.getString("url"));
				row.setNumeroInterno(rs.getString("numero_interno"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}