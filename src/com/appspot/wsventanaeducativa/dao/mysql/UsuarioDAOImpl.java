package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.Usuario;
import com.appspot.wsventanaeducativa.dao.UsuarioDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class UsuarioDAOImpl extends BaseDAO implements UsuarioDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(Usuario data){}

	public Usuario load(final Long id) throws Exception{
		String sql = "SELECT * FROM usuario WHERE id=?";
		return (Usuario) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Usuario row  = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM usuario WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final Usuario data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE usuario SET nombre = ?, sexo = ?, nacimiento = ?, nacionalidad = ?, pais = ?, region = ?, ciudad = ?, correo = ?, facebook = ?, google = ?, live = ?, twitter = ?, avatar = ?, background = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getNombre());
				ps.setString(2, data.getSexo());
				ps.setTimestamp(3, new java.sql.Timestamp(data.getNacimiento().getTime()));
				ps.setString(4, data.getNacionalidad());
				ps.setString(5, data.getPai());
				ps.setString(6, data.getRegion());
				ps.setString(7, data.getCiudad());
				ps.setString(8, data.getCorreo());
				ps.setString(9, data.getFacebook());
				ps.setString(10, data.getGoogle());
				ps.setString(11, data.getLive());
				ps.setString(12, data.getTwitter());
				ps.setString(13, data.getAvatar());
				ps.setString(14, data.getBackground());
				ps.setString(15, data.getFechaCreacion());
				ps.setString(16, data.getFechaModificacion());
				ps.setLong(17, data.getIdUsuario());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Usuario row  = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final Usuario data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO usuario ( nombre, sexo, nacimiento, nacionalidad, pais, region, ciudad, correo, facebook, google, live, twitter, avatar, background, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getNombre());
				ps.setString(2, data.getSexo());
				ps.setTimestamp(3, new java.sql.Timestamp(data.getNacimiento().getTime()));
				ps.setString(4, data.getNacionalidad());
				ps.setString(5, data.getPai());
				ps.setString(6, data.getRegion());
				ps.setString(7, data.getCiudad());
				ps.setString(8, data.getCorreo());
				ps.setString(9, data.getFacebook());
				ps.setString(10, data.getGoogle());
				ps.setString(11, data.getLive());
				ps.setString(12, data.getTwitter());
				ps.setString(13, data.getAvatar());
				ps.setString(14, data.getBackground());
				ps.setString(15, data.getFechaCreacion());
				ps.setString(16, data.getFechaModificacion());
			}
		});
		data.setIdUsuario(id);
		return id;
	}

	public List<Usuario> queryAll()throws Exception{
		String sql = "SELECT * FROM usuario";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<Usuario> queryByIdUsuario(Long idUsuario)throws Exception{
		String sql = "SELECT * FROM usuario WHERE id_usuario='"+idUsuario+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByNombre(String nombre)throws Exception{
		String sql = "SELECT * FROM usuario WHERE nombre='"+nombre+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryBySexo(String sexo)throws Exception{
		String sql = "SELECT * FROM usuario WHERE sexo='"+sexo+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByNacimiento(Date nacimiento)throws Exception{
		String sql = "SELECT * FROM usuario WHERE nacimiento='"+nacimiento+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByNacionalidad(String nacionalidad)throws Exception{
		String sql = "SELECT * FROM usuario WHERE nacionalidad='"+nacionalidad+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByPai(String pai)throws Exception{
		String sql = "SELECT * FROM usuario WHERE pais='"+pai+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByRegion(String region)throws Exception{
		String sql = "SELECT * FROM usuario WHERE region='"+region+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByCiudad(String ciudad)throws Exception{
		String sql = "SELECT * FROM usuario WHERE ciudad='"+ciudad+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByCorreo(String correo)throws Exception{
		String sql = "SELECT * FROM usuario WHERE correo='"+correo+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByFacebook(String facebook)throws Exception{
		String sql = "SELECT * FROM usuario WHERE facebook='"+facebook+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByGoogle(String google)throws Exception{
		String sql = "SELECT * FROM usuario WHERE google='"+google+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByLive(String live)throws Exception{
		String sql = "SELECT * FROM usuario WHERE live='"+live+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByTwitter(String twitter)throws Exception{
		String sql = "SELECT * FROM usuario WHERE twitter='"+twitter+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByAvatar(String avatar)throws Exception{
		String sql = "SELECT * FROM usuario WHERE avatar='"+avatar+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByBackground(String background)throws Exception{
		String sql = "SELECT * FROM usuario WHERE background='"+background+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM usuario WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Usuario> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM usuario WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Usuario row = new Usuario();
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setNombre(rs.getString("nombre"));
				row.setSexo(rs.getString("sexo"));
				row.setNacimiento(new Date(rs.getTimestamp("nacimiento").getTime()));
				row.setNacionalidad(rs.getString("nacionalidad"));
				row.setPai(rs.getString("pais"));
				row.setRegion(rs.getString("region"));
				row.setCiudad(rs.getString("ciudad"));
				row.setCorreo(rs.getString("correo"));
				row.setFacebook(rs.getString("facebook"));
				row.setGoogle(rs.getString("google"));
				row.setLive(rs.getString("live"));
				row.setTwitter(rs.getString("twitter"));
				row.setAvatar(rs.getString("avatar"));
				row.setBackground(rs.getString("background"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}