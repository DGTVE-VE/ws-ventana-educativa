package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.Institucion;
import com.appspot.wsventanaeducativa.dao.InstitucionDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class InstitucionDAOImpl extends BaseDAO implements InstitucionDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(Institucion data){}

	public Institucion load(final Long id) throws Exception{
		String sql = "SELECT * FROM institucion WHERE id=?";
		return (Institucion) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Institucion row  = new Institucion();
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setNombre(rs.getString("nombre"));
				row.setContacto(rs.getString("contacto"));
				row.setTelefono(rs.getString("telefono"));
				row.setCorreo(rs.getString("correo"));
				row.setAbreviatura(rs.getString("abreviatura"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM institucion WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final Institucion data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE institucion SET nombre = ?, contacto = ?, telefono = ?, correo = ?, abreviatura = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getNombre());
				ps.setString(2, data.getContacto());
				ps.setString(3, data.getTelefono());
				ps.setString(4, data.getCorreo());
				ps.setString(5, data.getAbreviatura());
				ps.setString(6, data.getFechaCreacion());
				ps.setString(7, data.getFechaModificacion());
				ps.setLong(8, data.getIdInstitucion());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Institucion row  = new Institucion();
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setNombre(rs.getString("nombre"));
				row.setContacto(rs.getString("contacto"));
				row.setTelefono(rs.getString("telefono"));
				row.setCorreo(rs.getString("correo"));
				row.setAbreviatura(rs.getString("abreviatura"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final Institucion data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO institucion ( nombre, contacto, telefono, correo, abreviatura, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getNombre());
				ps.setString(2, data.getContacto());
				ps.setString(3, data.getTelefono());
				ps.setString(4, data.getCorreo());
				ps.setString(5, data.getAbreviatura());
				ps.setString(6, data.getFechaCreacion());
				ps.setString(7, data.getFechaModificacion());
			}
		});
		data.setIdInstitucion(id);
		return id;
	}

	public List<Institucion> queryAll()throws Exception{
		String sql = "SELECT * FROM institucion";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Institucion row = new Institucion();
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setNombre(rs.getString("nombre"));
				row.setContacto(rs.getString("contacto"));
				row.setTelefono(rs.getString("telefono"));
				row.setCorreo(rs.getString("correo"));
				row.setAbreviatura(rs.getString("abreviatura"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Institucion row = new Institucion();
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setNombre(rs.getString("nombre"));
				row.setContacto(rs.getString("contacto"));
				row.setTelefono(rs.getString("telefono"));
				row.setCorreo(rs.getString("correo"));
				row.setAbreviatura(rs.getString("abreviatura"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<Institucion> queryByIdInstitucion(Long idInstitucion)throws Exception{
		String sql = "SELECT * FROM institucion WHERE id_institucion='"+idInstitucion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Institucion row = new Institucion();
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setNombre(rs.getString("nombre"));
				row.setContacto(rs.getString("contacto"));
				row.setTelefono(rs.getString("telefono"));
				row.setCorreo(rs.getString("correo"));
				row.setAbreviatura(rs.getString("abreviatura"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Institucion> queryByNombre(String nombre)throws Exception{
		String sql = "SELECT * FROM institucion WHERE nombre='"+nombre+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Institucion row = new Institucion();
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setNombre(rs.getString("nombre"));
				row.setContacto(rs.getString("contacto"));
				row.setTelefono(rs.getString("telefono"));
				row.setCorreo(rs.getString("correo"));
				row.setAbreviatura(rs.getString("abreviatura"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Institucion> queryByContacto(String contacto)throws Exception{
		String sql = "SELECT * FROM institucion WHERE contacto='"+contacto+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Institucion row = new Institucion();
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setNombre(rs.getString("nombre"));
				row.setContacto(rs.getString("contacto"));
				row.setTelefono(rs.getString("telefono"));
				row.setCorreo(rs.getString("correo"));
				row.setAbreviatura(rs.getString("abreviatura"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Institucion> queryByTelefono(String telefono)throws Exception{
		String sql = "SELECT * FROM institucion WHERE telefono='"+telefono+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Institucion row = new Institucion();
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setNombre(rs.getString("nombre"));
				row.setContacto(rs.getString("contacto"));
				row.setTelefono(rs.getString("telefono"));
				row.setCorreo(rs.getString("correo"));
				row.setAbreviatura(rs.getString("abreviatura"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Institucion> queryByCorreo(String correo)throws Exception{
		String sql = "SELECT * FROM institucion WHERE correo='"+correo+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Institucion row = new Institucion();
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setNombre(rs.getString("nombre"));
				row.setContacto(rs.getString("contacto"));
				row.setTelefono(rs.getString("telefono"));
				row.setCorreo(rs.getString("correo"));
				row.setAbreviatura(rs.getString("abreviatura"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Institucion> queryByAbreviatura(String abreviatura)throws Exception{
		String sql = "SELECT * FROM institucion WHERE abreviatura='"+abreviatura+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Institucion row = new Institucion();
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setNombre(rs.getString("nombre"));
				row.setContacto(rs.getString("contacto"));
				row.setTelefono(rs.getString("telefono"));
				row.setCorreo(rs.getString("correo"));
				row.setAbreviatura(rs.getString("abreviatura"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Institucion> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM institucion WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Institucion row = new Institucion();
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setNombre(rs.getString("nombre"));
				row.setContacto(rs.getString("contacto"));
				row.setTelefono(rs.getString("telefono"));
				row.setCorreo(rs.getString("correo"));
				row.setAbreviatura(rs.getString("abreviatura"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Institucion> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM institucion WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Institucion row = new Institucion();
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setNombre(rs.getString("nombre"));
				row.setContacto(rs.getString("contacto"));
				row.setTelefono(rs.getString("telefono"));
				row.setCorreo(rs.getString("correo"));
				row.setAbreviatura(rs.getString("abreviatura"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}