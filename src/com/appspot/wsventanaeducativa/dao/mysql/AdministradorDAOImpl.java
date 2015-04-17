package com.appspot.wsventanaeducativa.dao.mysql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.Administrador;
import com.appspot.wsventanaeducativa.dao.AdministradorDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class AdministradorDAOImpl extends BaseDAO implements AdministradorDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(Administrador data){}

	public Administrador load(final Long id) throws Exception{
		String sql = "SELECT * FROM administrador WHERE id=?";
		return (Administrador) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Administrador row  = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM administrador WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final Administrador data) throws Exception{
		//cache.clear(data.getIdAdministrador());
		String sql = "UPDATE administrador SET nombre = ?, correo = ?, telefono = ?, cargo = ?, dependencia = ?, password = ?, id_institucion = ?, superadministrador = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getNombre());
				ps.setString(2, data.getCorreo());
				ps.setString(3, data.getTelefono());
				ps.setString(4, data.getCargo());
				ps.setString(5, data.getDependencia());
				ps.setString(6, data.getPassword());
				ps.setLong(7, data.getIdInstitucion());
				ps.setLong(8, data.getSuperadministrador());
				ps.setString(9, data.getFechaCreacion());
				ps.setString(10, data.getFechaModificacion());
				ps.setLong(11, data.getIdAdministrador());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Administrador row  = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final Administrador data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO administrador ( nombre, correo, telefono, cargo, dependencia, password, id_institucion, superadministrador, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getNombre());
				ps.setString(2, data.getCorreo());
				ps.setString(3, data.getTelefono());
				ps.setString(4, data.getCargo());
				ps.setString(5, data.getDependencia());
				ps.setString(6, data.getPassword());
				ps.setLong(7, data.getIdInstitucion());
				ps.setLong(8, data.getSuperadministrador());
				ps.setString(9, data.getFechaCreacion());
				ps.setString(10, data.getFechaModificacion());
			}
		});
		data.setIdAdministrador(id);
		return id;
	}

	public List<Administrador> queryAll()throws Exception{
		String sql = "SELECT * FROM administrador";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Administrador row = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Administrador row = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<Administrador> queryByIdAdministrador(Long idAdministrador)throws Exception{
		String sql = "SELECT * FROM administrador WHERE id_administrador='"+idAdministrador+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Administrador row = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Administrador> queryByNombre(String nombre)throws Exception{
		String sql = "SELECT * FROM administrador WHERE nombre='"+nombre+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Administrador row = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Administrador> queryByCorreo(String correo)throws Exception{
		String sql = "SELECT * FROM administrador WHERE correo='"+correo+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Administrador row = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Administrador> queryByTelefono(String telefono)throws Exception{
		String sql = "SELECT * FROM administrador WHERE telefono='"+telefono+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Administrador row = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Administrador> queryByCargo(String cargo)throws Exception{
		String sql = "SELECT * FROM administrador WHERE cargo='"+cargo+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Administrador row = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Administrador> queryByDependencia(String dependencia)throws Exception{
		String sql = "SELECT * FROM administrador WHERE dependencia='"+dependencia+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Administrador row = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Administrador> queryByPassword(String password)throws Exception{
		String sql = "SELECT * FROM administrador WHERE password='"+password+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Administrador row = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Administrador> queryByIdInstitucion(Long idInstitucion)throws Exception{
		String sql = "SELECT * FROM administrador WHERE id_institucion='"+idInstitucion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Administrador row = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Administrador> queryBySuperadministrador(Long superadministrador)throws Exception{
		String sql = "SELECT * FROM administrador WHERE superadministrador='"+superadministrador+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Administrador row = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Administrador> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM administrador WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Administrador row = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Administrador> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM administrador WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Administrador row = new Administrador();
				row.setIdAdministrador(rs.getLong("id_administrador"));
				row.setNombre(rs.getString("nombre"));
				row.setCorreo(rs.getString("correo"));
				row.setTelefono(rs.getString("telefono"));
				row.setCargo(rs.getString("cargo"));
				row.setDependencia(rs.getString("dependencia"));
				row.setPassword(rs.getString("password"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setSuperadministrador(rs.getLong("superadministrador"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}