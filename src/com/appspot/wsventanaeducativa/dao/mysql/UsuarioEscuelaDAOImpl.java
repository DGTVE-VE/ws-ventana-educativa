package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.UsuarioEscuela;
import com.appspot.wsventanaeducativa.dao.UsuarioEscuelaDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class UsuarioEscuelaDAOImpl extends BaseDAO implements UsuarioEscuelaDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(UsuarioEscuela data){}

	public UsuarioEscuela load(final Long id) throws Exception{
		String sql = "SELECT * FROM usuario_escuela WHERE id=?";
		return (UsuarioEscuela) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			UsuarioEscuela row  = new UsuarioEscuela();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setInicio(new Date(rs.getTimestamp("inicio").getTime()));
				row.setFin(new Date(rs.getTimestamp("fin").getTime()));
				row.setCursaActualmente(rs.getLong("cursa_actualmente"));
				row.setTitulo(rs.getString("titulo"));
				row.setFechaCreacionl(rs.getString("fecha_creacionl"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM usuario_escuela WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final UsuarioEscuela data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE usuario_escuela SET id_escuela = ?, inicio = ?, fin = ?, cursa_actualmente = ?, titulo = ?, fecha_creacionl = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdEscuela());
				ps.setTimestamp(2, new java.sql.Timestamp(data.getInicio().getTime()));
				ps.setTimestamp(3, new java.sql.Timestamp(data.getFin().getTime()));
				ps.setLong(4, data.getCursaActualmente());
				ps.setString(5, data.getTitulo());
				ps.setString(6, data.getFechaCreacionl());
				ps.setString(7, data.getFechaModificacion());
				ps.setLong(8, data.getIdUsuario());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			UsuarioEscuela row  = new UsuarioEscuela();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setInicio(new Date(rs.getTimestamp("inicio").getTime()));
				row.setFin(new Date(rs.getTimestamp("fin").getTime()));
				row.setCursaActualmente(rs.getLong("cursa_actualmente"));
				row.setTitulo(rs.getString("titulo"));
				row.setFechaCreacionl(rs.getString("fecha_creacionl"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final UsuarioEscuela data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO usuario_escuela ( id_escuela, inicio, fin, cursa_actualmente, titulo, fecha_creacionl, fecha_modificacion) VALUES (?, ?, ?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdEscuela());
				ps.setTimestamp(2, new java.sql.Timestamp(data.getInicio().getTime()));
				ps.setTimestamp(3, new java.sql.Timestamp(data.getFin().getTime()));
				ps.setLong(4, data.getCursaActualmente());
				ps.setString(5, data.getTitulo());
				ps.setString(6, data.getFechaCreacionl());
				ps.setString(7, data.getFechaModificacion());
			}
		});
		data.setIdUsuario(id);
		return id;
	}

	public List<UsuarioEscuela> queryAll()throws Exception{
		String sql = "SELECT * FROM usuario_escuela";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				UsuarioEscuela row = new UsuarioEscuela();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setInicio(new Date(rs.getTimestamp("inicio").getTime()));
				row.setFin(new Date(rs.getTimestamp("fin").getTime()));
				row.setCursaActualmente(rs.getLong("cursa_actualmente"));
				row.setTitulo(rs.getString("titulo"));
				row.setFechaCreacionl(rs.getString("fecha_creacionl"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				UsuarioEscuela row = new UsuarioEscuela();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setInicio(new Date(rs.getTimestamp("inicio").getTime()));
				row.setFin(new Date(rs.getTimestamp("fin").getTime()));
				row.setCursaActualmente(rs.getLong("cursa_actualmente"));
				row.setTitulo(rs.getString("titulo"));
				row.setFechaCreacionl(rs.getString("fecha_creacionl"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<UsuarioEscuela> queryByIdUsuario(Long idUsuario)throws Exception{
		String sql = "SELECT * FROM usuario_escuela WHERE id_usuario='"+idUsuario+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				UsuarioEscuela row = new UsuarioEscuela();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setInicio(new Date(rs.getTimestamp("inicio").getTime()));
				row.setFin(new Date(rs.getTimestamp("fin").getTime()));
				row.setCursaActualmente(rs.getLong("cursa_actualmente"));
				row.setTitulo(rs.getString("titulo"));
				row.setFechaCreacionl(rs.getString("fecha_creacionl"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<UsuarioEscuela> queryByIdEscuela(Long idEscuela)throws Exception{
		String sql = "SELECT * FROM usuario_escuela WHERE id_escuela='"+idEscuela+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				UsuarioEscuela row = new UsuarioEscuela();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setInicio(new Date(rs.getTimestamp("inicio").getTime()));
				row.setFin(new Date(rs.getTimestamp("fin").getTime()));
				row.setCursaActualmente(rs.getLong("cursa_actualmente"));
				row.setTitulo(rs.getString("titulo"));
				row.setFechaCreacionl(rs.getString("fecha_creacionl"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<UsuarioEscuela> queryByInicio(Date inicio)throws Exception{
		String sql = "SELECT * FROM usuario_escuela WHERE inicio='"+inicio+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				UsuarioEscuela row = new UsuarioEscuela();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setInicio(new Date(rs.getTimestamp("inicio").getTime()));
				row.setFin(new Date(rs.getTimestamp("fin").getTime()));
				row.setCursaActualmente(rs.getLong("cursa_actualmente"));
				row.setTitulo(rs.getString("titulo"));
				row.setFechaCreacionl(rs.getString("fecha_creacionl"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<UsuarioEscuela> queryByFin(Date fin)throws Exception{
		String sql = "SELECT * FROM usuario_escuela WHERE fin='"+fin+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				UsuarioEscuela row = new UsuarioEscuela();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setInicio(new Date(rs.getTimestamp("inicio").getTime()));
				row.setFin(new Date(rs.getTimestamp("fin").getTime()));
				row.setCursaActualmente(rs.getLong("cursa_actualmente"));
				row.setTitulo(rs.getString("titulo"));
				row.setFechaCreacionl(rs.getString("fecha_creacionl"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<UsuarioEscuela> queryByCursaActualmente(Long cursaActualmente)throws Exception{
		String sql = "SELECT * FROM usuario_escuela WHERE cursa_actualmente='"+cursaActualmente+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				UsuarioEscuela row = new UsuarioEscuela();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setInicio(new Date(rs.getTimestamp("inicio").getTime()));
				row.setFin(new Date(rs.getTimestamp("fin").getTime()));
				row.setCursaActualmente(rs.getLong("cursa_actualmente"));
				row.setTitulo(rs.getString("titulo"));
				row.setFechaCreacionl(rs.getString("fecha_creacionl"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<UsuarioEscuela> queryByTitulo(String titulo)throws Exception{
		String sql = "SELECT * FROM usuario_escuela WHERE titulo='"+titulo+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				UsuarioEscuela row = new UsuarioEscuela();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setInicio(new Date(rs.getTimestamp("inicio").getTime()));
				row.setFin(new Date(rs.getTimestamp("fin").getTime()));
				row.setCursaActualmente(rs.getLong("cursa_actualmente"));
				row.setTitulo(rs.getString("titulo"));
				row.setFechaCreacionl(rs.getString("fecha_creacionl"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<UsuarioEscuela> queryByFechaCreacionl(String fechaCreacionl)throws Exception{
		String sql = "SELECT * FROM usuario_escuela WHERE fecha_creacionl='"+fechaCreacionl+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				UsuarioEscuela row = new UsuarioEscuela();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setInicio(new Date(rs.getTimestamp("inicio").getTime()));
				row.setFin(new Date(rs.getTimestamp("fin").getTime()));
				row.setCursaActualmente(rs.getLong("cursa_actualmente"));
				row.setTitulo(rs.getString("titulo"));
				row.setFechaCreacionl(rs.getString("fecha_creacionl"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<UsuarioEscuela> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM usuario_escuela WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				UsuarioEscuela row = new UsuarioEscuela();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setInicio(new Date(rs.getTimestamp("inicio").getTime()));
				row.setFin(new Date(rs.getTimestamp("fin").getTime()));
				row.setCursaActualmente(rs.getLong("cursa_actualmente"));
				row.setTitulo(rs.getString("titulo"));
				row.setFechaCreacionl(rs.getString("fecha_creacionl"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}