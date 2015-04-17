package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.TipoPantalla;
import com.appspot.wsventanaeducativa.dao.TipoPantallaDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class TipoPantallaDAOImpl extends BaseDAO implements TipoPantallaDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(TipoPantalla data){}

	public TipoPantalla load(final String id) throws Exception{
		String sql = "SELECT * FROM tipo_pantalla WHERE id=?";
		return (TipoPantalla) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			TipoPantalla row  = new TipoPantalla();
				row.setTipoPantalla(rs.getString("tipo_pantalla"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final String id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM tipo_pantalla WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, id);
			}
		});
	}

	public int update(final TipoPantalla data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE tipo_pantalla SET descripcion = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getDescripcion());
				ps.setString(2, data.getFechaCreacion());
				ps.setString(3, data.getFechaModificacion());
				ps.setString(4, data.getTipoPantalla());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			TipoPantalla row  = new TipoPantalla();
				row.setTipoPantalla(rs.getString("tipo_pantalla"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final TipoPantalla data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO tipo_pantalla (tipo_pantalla, descripcion, fecha_creacion, fecha_modificacion) VALUES (?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getTipoPantalla());
				ps.setString(2, data.getDescripcion());
				ps.setString(3, data.getFechaCreacion());
				ps.setString(4, data.getFechaModificacion());
			}
		});
		
		return id;
	}

	public List<TipoPantalla> queryAll()throws Exception{
		String sql = "SELECT * FROM tipo_pantalla";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				TipoPantalla row = new TipoPantalla();
				row.setTipoPantalla(rs.getString("tipo_pantalla"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				TipoPantalla row = new TipoPantalla();
				row.setTipoPantalla(rs.getString("tipo_pantalla"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<TipoPantalla> queryByTipoPantalla(String tipoPantalla)throws Exception{
		String sql = "SELECT * FROM tipo_pantalla WHERE tipo_pantalla='"+tipoPantalla+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				TipoPantalla row = new TipoPantalla();
				row.setTipoPantalla(rs.getString("tipo_pantalla"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<TipoPantalla> queryByDescripcion(String descripcion)throws Exception{
		String sql = "SELECT * FROM tipo_pantalla WHERE descripcion='"+descripcion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				TipoPantalla row = new TipoPantalla();
				row.setTipoPantalla(rs.getString("tipo_pantalla"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<TipoPantalla> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM tipo_pantalla WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				TipoPantalla row = new TipoPantalla();
				row.setTipoPantalla(rs.getString("tipo_pantalla"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<TipoPantalla> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM tipo_pantalla WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				TipoPantalla row = new TipoPantalla();
				row.setTipoPantalla(rs.getString("tipo_pantalla"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}