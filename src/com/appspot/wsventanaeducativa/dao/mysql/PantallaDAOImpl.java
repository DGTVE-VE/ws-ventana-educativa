package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.Pantalla;
import com.appspot.wsventanaeducativa.dao.PantallaDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class PantallaDAOImpl extends BaseDAO implements PantallaDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(Pantalla data){}

	public Pantalla load(final Long id) throws Exception{
		String sql = "SELECT * FROM pantalla WHERE id=?";
		return (Pantalla) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Pantalla row  = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM pantalla WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final Pantalla data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE pantalla SET id_pantalla_padre = ?, nombre = ?, descripcion = ?, alto = ?, ancho = ?, thumbnail = ?, posicion = ?, colspan = ?, rowspan = ?, filas = ?, columnas = ?, tipo_ventana = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdPantallaPadre());
				ps.setString(2, data.getNombre());
				ps.setString(3, data.getDescripcion());
				ps.setLong(4, data.getAlto());
				ps.setLong(5, data.getAncho());
				ps.setString(6, data.getThumbnail());
				ps.setLong(7, data.getPosicion());
				ps.setLong(8, data.getColspan());
				ps.setLong(9, data.getRowspan());
				ps.setLong(10, data.getFila());
				ps.setLong(11, data.getColumna());
				ps.setString(12, data.getTipoVentana());
				ps.setString(13, data.getFechaCreacion());
				ps.setString(14, data.getFechaModificacion());
				ps.setLong(15, data.getIdPantalla());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Pantalla row  = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final Pantalla data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO pantalla ( id_pantalla_padre, nombre, descripcion, alto, ancho, thumbnail, posicion, colspan, rowspan, filas, columnas, tipo_ventana, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdPantallaPadre());
				ps.setString(2, data.getNombre());
				ps.setString(3, data.getDescripcion());
				ps.setLong(4, data.getAlto());
				ps.setLong(5, data.getAncho());
				ps.setString(6, data.getThumbnail());
				ps.setLong(7, data.getPosicion());
				ps.setLong(8, data.getColspan());
				ps.setLong(9, data.getRowspan());
				ps.setLong(10, data.getFila());
				ps.setLong(11, data.getColumna());
				ps.setString(12, data.getTipoVentana());
				ps.setString(13, data.getFechaCreacion());
				ps.setString(14, data.getFechaModificacion());
			}
		});
		data.setIdPantalla(id);
		return id;
	}

	public List<Pantalla> queryAll()throws Exception{
		String sql = "SELECT * FROM pantalla";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<Pantalla> queryByIdPantalla(Long idPantalla)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE id_pantalla='"+idPantalla+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pantalla> queryByIdPantallaPadre(Long idPantallaPadre)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE id_pantalla_padre='"+idPantallaPadre+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pantalla> queryByNombre(String nombre)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE nombre='"+nombre+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pantalla> queryByDescripcion(String descripcion)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE descripcion='"+descripcion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pantalla> queryByAlto(Long alto)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE alto='"+alto+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pantalla> queryByAncho(Long ancho)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE ancho='"+ancho+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pantalla> queryByThumbnail(String thumbnail)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE thumbnail='"+thumbnail+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pantalla> queryByPosicion(Long posicion)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE posicion='"+posicion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pantalla> queryByColspan(Long colspan)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE colspan='"+colspan+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pantalla> queryByRowspan(Long rowspan)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE rowspan='"+rowspan+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pantalla> queryByFila(Long fila)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE filas='"+fila+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pantalla> queryByColumna(Long columna)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE columnas='"+columna+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pantalla> queryByTipoVentana(String tipoVentana)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE tipo_ventana='"+tipoVentana+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pantalla> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Pantalla> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM pantalla WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Pantalla row = new Pantalla();
				row.setIdPantalla(rs.getLong("id_pantalla"));
				row.setIdPantallaPadre(rs.getLong("id_pantalla_padre"));
				row.setNombre(rs.getString("nombre"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setAlto(rs.getLong("alto"));
				row.setAncho(rs.getLong("ancho"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setPosicion(rs.getLong("posicion"));
				row.setColspan(rs.getLong("colspan"));
				row.setRowspan(rs.getLong("rowspan"));
				row.setFila(rs.getLong("filas"));
				row.setColumna(rs.getLong("columnas"));
				row.setTipoVentana(rs.getString("tipo_ventana"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}