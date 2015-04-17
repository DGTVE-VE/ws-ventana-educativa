package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.LibroConsumido;
import com.appspot.wsventanaeducativa.dao.LibroConsumidoDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class LibroConsumidoDAOImpl extends BaseDAO implements LibroConsumidoDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(LibroConsumido data){}

	public LibroConsumido load(final Long id) throws Exception{
		String sql = "SELECT * FROM libro_consumido WHERE id=?";
		return (LibroConsumido) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			LibroConsumido row  = new LibroConsumido();
				row.setIdLibroConsumido(rs.getLong("id_libro_consumido"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setPaginaInicio(rs.getLong("pagina_inicio"));
				row.setPaginaFin(rs.getLong("pagina_fin"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM libro_consumido WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final LibroConsumido data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE libro_consumido SET id_libro = ?, id_usuario = ?, tiempo = ?, ip = ?, pagina_inicio = ?, pagina_fin = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdLibro());
				ps.setLong(2, data.getIdUsuario());
				ps.setString(3, data.getTiempo());
				ps.setString(4, data.getIp());
				ps.setLong(5, data.getPaginaInicio());
				ps.setLong(6, data.getPaginaFin());
				ps.setString(7, data.getFechaCreacion());
				ps.setString(8, data.getFechaModificacion());
				ps.setLong(9, data.getIdLibroConsumido());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			LibroConsumido row  = new LibroConsumido();
				row.setIdLibroConsumido(rs.getLong("id_libro_consumido"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setPaginaInicio(rs.getLong("pagina_inicio"));
				row.setPaginaFin(rs.getLong("pagina_fin"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final LibroConsumido data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO libro_consumido ( id_libro, id_usuario, tiempo, ip, pagina_inicio, pagina_fin, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdLibro());
				ps.setLong(2, data.getIdUsuario());
				ps.setString(3, data.getTiempo());
				ps.setString(4, data.getIp());
				ps.setLong(5, data.getPaginaInicio());
				ps.setLong(6, data.getPaginaFin());
				ps.setString(7, data.getFechaCreacion());
				ps.setString(8, data.getFechaModificacion());
			}
		});
		data.setIdLibroConsumido(id);
		return id;
	}

	public List<LibroConsumido> queryAll()throws Exception{
		String sql = "SELECT * FROM libro_consumido";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LibroConsumido row = new LibroConsumido();
				row.setIdLibroConsumido(rs.getLong("id_libro_consumido"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setPaginaInicio(rs.getLong("pagina_inicio"));
				row.setPaginaFin(rs.getLong("pagina_fin"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LibroConsumido row = new LibroConsumido();
				row.setIdLibroConsumido(rs.getLong("id_libro_consumido"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setPaginaInicio(rs.getLong("pagina_inicio"));
				row.setPaginaFin(rs.getLong("pagina_fin"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<LibroConsumido> queryByIdLibroConsumido(Long idLibroConsumido)throws Exception{
		String sql = "SELECT * FROM libro_consumido WHERE id_libro_consumido='"+idLibroConsumido+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LibroConsumido row = new LibroConsumido();
				row.setIdLibroConsumido(rs.getLong("id_libro_consumido"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setPaginaInicio(rs.getLong("pagina_inicio"));
				row.setPaginaFin(rs.getLong("pagina_fin"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LibroConsumido> queryByIdLibro(Long idLibro)throws Exception{
		String sql = "SELECT * FROM libro_consumido WHERE id_libro='"+idLibro+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LibroConsumido row = new LibroConsumido();
				row.setIdLibroConsumido(rs.getLong("id_libro_consumido"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setPaginaInicio(rs.getLong("pagina_inicio"));
				row.setPaginaFin(rs.getLong("pagina_fin"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LibroConsumido> queryByIdUsuario(Long idUsuario)throws Exception{
		String sql = "SELECT * FROM libro_consumido WHERE id_usuario='"+idUsuario+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LibroConsumido row = new LibroConsumido();
				row.setIdLibroConsumido(rs.getLong("id_libro_consumido"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setPaginaInicio(rs.getLong("pagina_inicio"));
				row.setPaginaFin(rs.getLong("pagina_fin"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LibroConsumido> queryByTiempo(String tiempo)throws Exception{
		String sql = "SELECT * FROM libro_consumido WHERE tiempo='"+tiempo+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LibroConsumido row = new LibroConsumido();
				row.setIdLibroConsumido(rs.getLong("id_libro_consumido"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setPaginaInicio(rs.getLong("pagina_inicio"));
				row.setPaginaFin(rs.getLong("pagina_fin"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LibroConsumido> queryByIp(String ip)throws Exception{
		String sql = "SELECT * FROM libro_consumido WHERE ip='"+ip+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LibroConsumido row = new LibroConsumido();
				row.setIdLibroConsumido(rs.getLong("id_libro_consumido"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setPaginaInicio(rs.getLong("pagina_inicio"));
				row.setPaginaFin(rs.getLong("pagina_fin"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LibroConsumido> queryByPaginaInicio(Long paginaInicio)throws Exception{
		String sql = "SELECT * FROM libro_consumido WHERE pagina_inicio='"+paginaInicio+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LibroConsumido row = new LibroConsumido();
				row.setIdLibroConsumido(rs.getLong("id_libro_consumido"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setPaginaInicio(rs.getLong("pagina_inicio"));
				row.setPaginaFin(rs.getLong("pagina_fin"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LibroConsumido> queryByPaginaFin(Long paginaFin)throws Exception{
		String sql = "SELECT * FROM libro_consumido WHERE pagina_fin='"+paginaFin+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LibroConsumido row = new LibroConsumido();
				row.setIdLibroConsumido(rs.getLong("id_libro_consumido"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setPaginaInicio(rs.getLong("pagina_inicio"));
				row.setPaginaFin(rs.getLong("pagina_fin"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LibroConsumido> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM libro_consumido WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LibroConsumido row = new LibroConsumido();
				row.setIdLibroConsumido(rs.getLong("id_libro_consumido"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setPaginaInicio(rs.getLong("pagina_inicio"));
				row.setPaginaFin(rs.getLong("pagina_fin"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<LibroConsumido> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM libro_consumido WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				LibroConsumido row = new LibroConsumido();
				row.setIdLibroConsumido(rs.getLong("id_libro_consumido"));
				row.setIdLibro(rs.getLong("id_libro"));
				row.setIdUsuario(rs.getLong("id_usuario"));
				row.setTiempo(rs.getString("tiempo"));
				row.setIp(rs.getString("ip"));
				row.setPaginaInicio(rs.getLong("pagina_inicio"));
				row.setPaginaFin(rs.getLong("pagina_fin"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}