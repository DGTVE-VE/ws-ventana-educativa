package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.Libro;
import com.appspot.wsventanaeducativa.dao.LibroDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class LibroDAOImpl extends BaseDAO implements LibroDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(Libro data){}

	public Libro load(final Long id) throws Exception{
		String sql = "SELECT * FROM libro WHERE id=?";
		return (Libro) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Libro row  = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM libro WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final Libro data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE libro SET autor = ?, colaboradores = ?, propietario = ?, titulo = ?, subtitulo = ?, edicion = ?, editorial = ?, lugar = ?, fecha_publicacion = ?, anio_publicacion = ?, paginas = ?, serie = ?, numero_serie = ?, volumen = ?, descripcion = ?, isbn_10 = ?, isbn_13 = ?, ean_13 = ?, issn = ?, idioma = ?, titulo_traducido = ?, url = ?, calificacion = ?, temas = ?, tags = ?, thumbnail = ?, id_institucion = ?, fecha_creacion = ?, fecha_modificacion = ?, visible = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getAutor());
				ps.setString(2, data.getColaboradore());
				ps.setString(3, data.getPropietario());
				ps.setString(4, data.getTitulo());
				ps.setString(5, data.getSubtitulo());
				ps.setLong(6, data.getEdicion());
				ps.setString(7, data.getEditorial());
				ps.setString(8, data.getLugar());
				ps.setTimestamp(9, new java.sql.Timestamp(data.getFechaPublicacion().getTime()));
				ps.setString(10, data.getAnioPublicacion());
				ps.setLong(11, data.getPagina());
				ps.setString(12, data.getSerie());
				ps.setLong(13, data.getNumeroSerie());
				ps.setLong(14, data.getVolumen());
				ps.setString(15, data.getDescripcion());
				ps.setString(16, data.getIsbn10());
				ps.setString(17, data.getIsbn13());
				ps.setString(18, data.getEan13());
				ps.setString(19, data.getIssn());
				ps.setString(20, data.getIdioma());
				ps.setString(21, data.getTituloTraducido());
				ps.setString(22, data.getUrl());
				ps.setLong(23, data.getCalificacion());
				ps.setString(24, data.getTema());
				ps.setString(25, data.getTag());
				ps.setString(26, data.getThumbnail());
				ps.setLong(27, data.getIdInstitucion());
				ps.setString(28, data.getFechaCreacion());
				ps.setString(29, data.getFechaModificacion());
				ps.setLong(30, data.getVisible());
				ps.setLong(31, data.getIdLibro());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Libro row  = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	};
	}

	public long insert(final Libro data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO libro ( autor, colaboradores, propietario, titulo, subtitulo, edicion, editorial, lugar, fecha_publicacion, anio_publicacion, paginas, serie, numero_serie, volumen, descripcion, isbn_10, isbn_13, ean_13, issn, idioma, titulo_traducido, url, calificacion, temas, tags, thumbnail, id_institucion, fecha_creacion, fecha_modificacion, visible) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setString(1, data.getAutor());
				ps.setString(2, data.getColaboradore());
				ps.setString(3, data.getPropietario());
				ps.setString(4, data.getTitulo());
				ps.setString(5, data.getSubtitulo());
				ps.setLong(6, data.getEdicion());
				ps.setString(7, data.getEditorial());
				ps.setString(8, data.getLugar());
				ps.setTimestamp(9, new java.sql.Timestamp(data.getFechaPublicacion().getTime()));
				ps.setString(10, data.getAnioPublicacion());
				ps.setLong(11, data.getPagina());
				ps.setString(12, data.getSerie());
				ps.setLong(13, data.getNumeroSerie());
				ps.setLong(14, data.getVolumen());
				ps.setString(15, data.getDescripcion());
				ps.setString(16, data.getIsbn10());
				ps.setString(17, data.getIsbn13());
				ps.setString(18, data.getEan13());
				ps.setString(19, data.getIssn());
				ps.setString(20, data.getIdioma());
				ps.setString(21, data.getTituloTraducido());
				ps.setString(22, data.getUrl());
				ps.setLong(23, data.getCalificacion());
				ps.setString(24, data.getTema());
				ps.setString(25, data.getTag());
				ps.setString(26, data.getThumbnail());
				ps.setLong(27, data.getIdInstitucion());
				ps.setString(28, data.getFechaCreacion());
				ps.setString(29, data.getFechaModificacion());
				ps.setLong(30, data.getVisible());
			}
		});
		data.setIdLibro(id);
		return id;
	}

	public List<Libro> queryAll()throws Exception{
		String sql = "SELECT * FROM libro";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	};
	}

	public List<Libro> queryByIdLibro(Long idLibro)throws Exception{
		String sql = "SELECT * FROM libro WHERE id_libro='"+idLibro+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByAutor(String autor)throws Exception{
		String sql = "SELECT * FROM libro WHERE autor='"+autor+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByColaboradore(String colaboradore)throws Exception{
		String sql = "SELECT * FROM libro WHERE colaboradores='"+colaboradore+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByPropietario(String propietario)throws Exception{
		String sql = "SELECT * FROM libro WHERE propietario='"+propietario+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByTitulo(String titulo)throws Exception{
		String sql = "SELECT * FROM libro WHERE titulo='"+titulo+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryBySubtitulo(String subtitulo)throws Exception{
		String sql = "SELECT * FROM libro WHERE subtitulo='"+subtitulo+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByEdicion(Long edicion)throws Exception{
		String sql = "SELECT * FROM libro WHERE edicion='"+edicion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByEditorial(String editorial)throws Exception{
		String sql = "SELECT * FROM libro WHERE editorial='"+editorial+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByLugar(String lugar)throws Exception{
		String sql = "SELECT * FROM libro WHERE lugar='"+lugar+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByFechaPublicacion(Date fechaPublicacion)throws Exception{
		String sql = "SELECT * FROM libro WHERE fecha_publicacion='"+fechaPublicacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByAnioPublicacion(String anioPublicacion)throws Exception{
		String sql = "SELECT * FROM libro WHERE anio_publicacion='"+anioPublicacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByPagina(Long pagina)throws Exception{
		String sql = "SELECT * FROM libro WHERE paginas='"+pagina+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryBySerie(String serie)throws Exception{
		String sql = "SELECT * FROM libro WHERE serie='"+serie+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByNumeroSerie(Long numeroSerie)throws Exception{
		String sql = "SELECT * FROM libro WHERE numero_serie='"+numeroSerie+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByVolumen(Long volumen)throws Exception{
		String sql = "SELECT * FROM libro WHERE volumen='"+volumen+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByDescripcion(String descripcion)throws Exception{
		String sql = "SELECT * FROM libro WHERE descripcion='"+descripcion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByIsbn10(String isbn10)throws Exception{
		String sql = "SELECT * FROM libro WHERE isbn_10='"+isbn10+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByIsbn13(String isbn13)throws Exception{
		String sql = "SELECT * FROM libro WHERE isbn_13='"+isbn13+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByEan13(String ean13)throws Exception{
		String sql = "SELECT * FROM libro WHERE ean_13='"+ean13+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByIssn(String issn)throws Exception{
		String sql = "SELECT * FROM libro WHERE issn='"+issn+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByIdioma(String idioma)throws Exception{
		String sql = "SELECT * FROM libro WHERE idioma='"+idioma+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByTituloTraducido(String tituloTraducido)throws Exception{
		String sql = "SELECT * FROM libro WHERE titulo_traducido='"+tituloTraducido+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByUrl(String url)throws Exception{
		String sql = "SELECT * FROM libro WHERE url='"+url+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByCalificacion(Long calificacion)throws Exception{
		String sql = "SELECT * FROM libro WHERE calificacion='"+calificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByTema(String tema)throws Exception{
		String sql = "SELECT * FROM libro WHERE temas='"+tema+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByTag(String tag)throws Exception{
		String sql = "SELECT * FROM libro WHERE tags='"+tag+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByThumbnail(String thumbnail)throws Exception{
		String sql = "SELECT * FROM libro WHERE thumbnail='"+thumbnail+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByIdInstitucion(Long idInstitucion)throws Exception{
		String sql = "SELECT * FROM libro WHERE id_institucion='"+idInstitucion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM libro WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM libro WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}
	public List<Libro> queryByVisible(Long visible)throws Exception{
		String sql = "SELECT * FROM libro WHERE visible='"+visible+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Libro row = new Libro();
				row.setIdLibro(rs.getLong("id_libro"));
				row.setAutor(rs.getString("autor"));
				row.setColaboradore(rs.getString("colaboradores"));
				row.setPropietario(rs.getString("propietario"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setEdicion(rs.getLong("edicion"));
				row.setEditorial(rs.getString("editorial"));
				row.setLugar(rs.getString("lugar"));
				row.setFechaPublicacion(new Date(rs.getTimestamp("fecha_publicacion").getTime()));
				row.setAnioPublicacion(rs.getString("anio_publicacion"));
				row.setPagina(rs.getLong("paginas"));
				row.setSerie(rs.getString("serie"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setVolumen(rs.getLong("volumen"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setIsbn10(rs.getString("isbn_10"));
				row.setIsbn13(rs.getString("isbn_13"));
				row.setEan13(rs.getString("ean_13"));
				row.setIssn(rs.getString("issn"));
				row.setIdioma(rs.getString("idioma"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setUrl(rs.getString("url"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTema(rs.getString("temas"));
				row.setTag(rs.getString("tags"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				row.setVisible(rs.getLong("visible"));
				return row;
			}
	});
	}

	}