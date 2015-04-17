package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.Escuela;
import com.appspot.wsventanaeducativa.dao.EscuelaDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class EscuelaDAOImpl extends BaseDAO implements EscuelaDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(Escuela data){}

	public Escuela load(final Long id) throws Exception{
		String sql = "SELECT * FROM escuela WHERE id=?";
		return (Escuela) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Escuela row  = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM escuela WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final Escuela data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE escuela SET nombre = ?, direccion = ?, colonia = ?, municipio = ?, estado = ?, codigo_postal = ?, clave = ?, privada = ?, nivel = ?, institucion = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getNombre());
				ps.setString(2, data.getDireccion());
				ps.setString(3, data.getColonia());
				ps.setString(4, data.getMunicipio());
				ps.setString(5, data.getEstado());
				ps.setString(6, data.getCodigoPostal());
				ps.setString(7, data.getClave());
				ps.setLong(8, data.getPrivada());
				ps.setString(9, data.getNivel());
				ps.setString(10, data.getInstitucion());
				ps.setString(11, data.getFechaCreacion());
				ps.setString(12, data.getFechaModificacion());
				ps.setLong(13, data.getIdEscuela());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Escuela row  = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final Escuela data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO escuela ( nombre, direccion, colonia, municipio, estado, codigo_postal, clave, privada, nivel, institucion, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getNombre());
				ps.setString(2, data.getDireccion());
				ps.setString(3, data.getColonia());
				ps.setString(4, data.getMunicipio());
				ps.setString(5, data.getEstado());
				ps.setString(6, data.getCodigoPostal());
				ps.setString(7, data.getClave());
				ps.setLong(8, data.getPrivada());
				ps.setString(9, data.getNivel());
				ps.setString(10, data.getInstitucion());
				ps.setString(11, data.getFechaCreacion());
				ps.setString(12, data.getFechaModificacion());
			}
		});
		data.setIdEscuela(id);
		return id;
	}

	public List<Escuela> queryAll()throws Exception{
		String sql = "SELECT * FROM escuela";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<Escuela> queryByIdEscuela(Long idEscuela)throws Exception{
		String sql = "SELECT * FROM escuela WHERE id_escuela='"+idEscuela+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Escuela> queryByNombre(String nombre)throws Exception{
		String sql = "SELECT * FROM escuela WHERE nombre='"+nombre+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Escuela> queryByDireccion(String direccion)throws Exception{
		String sql = "SELECT * FROM escuela WHERE direccion='"+direccion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Escuela> queryByColonia(String colonia)throws Exception{
		String sql = "SELECT * FROM escuela WHERE colonia='"+colonia+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Escuela> queryByMunicipio(String municipio)throws Exception{
		String sql = "SELECT * FROM escuela WHERE municipio='"+municipio+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Escuela> queryByEstado(String estado)throws Exception{
		String sql = "SELECT * FROM escuela WHERE estado='"+estado+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Escuela> queryByCodigoPostal(String codigoPostal)throws Exception{
		String sql = "SELECT * FROM escuela WHERE codigo_postal='"+codigoPostal+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Escuela> queryByClave(String clave)throws Exception{
		String sql = "SELECT * FROM escuela WHERE clave='"+clave+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Escuela> queryByPrivada(Long privada)throws Exception{
		String sql = "SELECT * FROM escuela WHERE privada='"+privada+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Escuela> queryByNivel(String nivel)throws Exception{
		String sql = "SELECT * FROM escuela WHERE nivel='"+nivel+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Escuela> queryByInstitucion(String institucion)throws Exception{
		String sql = "SELECT * FROM escuela WHERE institucion='"+institucion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Escuela> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM escuela WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Escuela> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM escuela WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Escuela row = new Escuela();
				row.setIdEscuela(rs.getLong("id_escuela"));
				row.setNombre(rs.getString("nombre"));
				row.setDireccion(rs.getString("direccion"));
				row.setColonia(rs.getString("colonia"));
				row.setMunicipio(rs.getString("municipio"));
				row.setEstado(rs.getString("estado"));
				row.setCodigoPostal(rs.getString("codigo_postal"));
				row.setClave(rs.getString("clave"));
				row.setPrivada(rs.getLong("privada"));
				row.setNivel(rs.getString("nivel"));
				row.setInstitucion(rs.getString("institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}