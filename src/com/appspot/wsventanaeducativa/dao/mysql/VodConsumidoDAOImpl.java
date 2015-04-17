package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.VodConsumido;
import com.appspot.wsventanaeducativa.dao.VodConsumidoDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class VodConsumidoDAOImpl extends BaseDAO implements VodConsumidoDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(VodConsumido data){}

	public VodConsumido load(final Long id) throws Exception{
		String sql = "SELECT * FROM vod_consumido WHERE id=?";
		return (VodConsumido) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			VodConsumido row  = new VodConsumido();
				row.setIdVodConsumido(rs.getLong("id_vod_consumido"));
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM vod_consumido WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final VodConsumido data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE vod_consumido SET id_vod = ?, id_usuario = ?, tiempo = ?, ip = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdVod());
				ps.setLong(2, data.getIdUsuario());
				ps.setString(3, data.getTiempo());
				ps.setString(4, data.getIp());
				ps.setString(5, data.getFechaCreacion());
				ps.setString(6, data.getFechaModificacion());
				ps.setLong(7, data.getIdVodConsumido());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			VodConsumido row  = new VodConsumido();
				row.setIdVodConsumido(rs.getLong("id_vod_consumido"));
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final VodConsumido data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO vod_consumido ( id_vod, id_usuario, tiempo, ip, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdVod());
				ps.setLong(2, data.getIdUsuario());
				ps.setString(3, data.getTiempo());
				ps.setString(4, data.getIp());
				ps.setString(5, data.getFechaCreacion());
				ps.setString(6, data.getFechaModificacion());
			}
		});
		data.setIdVodConsumido(id);
		return id;
	}

	public List<VodConsumido> queryAll()throws Exception{
		String sql = "SELECT * FROM vod_consumido";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				VodConsumido row = new VodConsumido();
				row.setIdVodConsumido(rs.getLong("id_vod_consumido"));
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				VodConsumido row = new VodConsumido();
				row.setIdVodConsumido(rs.getLong("id_vod_consumido"));
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<VodConsumido> queryByIdVodConsumido(Long idVodConsumido)throws Exception{
		String sql = "SELECT * FROM vod_consumido WHERE id_vod_consumido='"+idVodConsumido+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				VodConsumido row = new VodConsumido();
				row.setIdVodConsumido(rs.getLong("id_vod_consumido"));
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<VodConsumido> queryByIdVod(Long idVod)throws Exception{
		String sql = "SELECT * FROM vod_consumido WHERE id_vod='"+idVod+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				VodConsumido row = new VodConsumido();
				row.setIdVodConsumido(rs.getLong("id_vod_consumido"));
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<VodConsumido> queryByIdUsuario(Long idUsuario)throws Exception{
		String sql = "SELECT * FROM vod_consumido WHERE id_usuario='"+idUsuario+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				VodConsumido row = new VodConsumido();
				row.setIdVodConsumido(rs.getLong("id_vod_consumido"));
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<VodConsumido> queryByTiempo(String tiempo)throws Exception{
		String sql = "SELECT * FROM vod_consumido WHERE tiempo='"+tiempo+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				VodConsumido row = new VodConsumido();
				row.setIdVodConsumido(rs.getLong("id_vod_consumido"));
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<VodConsumido> queryByIp(String ip)throws Exception{
		String sql = "SELECT * FROM vod_consumido WHERE ip='"+ip+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				VodConsumido row = new VodConsumido();
				row.setIdVodConsumido(rs.getLong("id_vod_consumido"));
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<VodConsumido> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM vod_consumido WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				VodConsumido row = new VodConsumido();
				row.setIdVodConsumido(rs.getLong("id_vod_consumido"));
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<VodConsumido> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM vod_consumido WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				VodConsumido row = new VodConsumido();
				row.setIdVodConsumido(rs.getLong("id_vod_consumido"));
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}