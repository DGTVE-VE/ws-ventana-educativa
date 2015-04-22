package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.VodDAO;
import com.appspot.wsventanaeducativa.dao.dto.Vod;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class VodDAOImpl extends BaseDAO implements VodDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(Vod data){}

	public Vod load(final Long id) throws Exception{
		String sql = "SELECT * FROM vod WHERE id=?";
		return (Vod) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Vod row  = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM vod WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final Vod data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE vod SET id_institucion = ?, autor = ?, productor = ?, derecho_autor = ?, serie = ?, titulo = ?, subserie = ?, subtitulo = ?, titulo_traducido = ?, clave_identificacion = ?, numero_obra = ?, numero_serie = ?, formato = ?, nnnov = ?, creditos = ?, lugar_produccion = ?, temas = ?, sinopsis = ?, duracion = ?, anio_produccion = ?, idioma = ?, versiones = ?, sistema_grabacion = ?, color = ?, sonido = ?, disponibilidad = ?, observaciones = ?, disponible_hasta = ?, episodio = ?, temporada = ?, calificacion = ?, tags = ?, id_serie = ?, url = ?, thumbnail = ?, visible = ?, youtube_list_id = ?, youtube_id = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdInstitucion());
				ps.setString(2, data.getAutor());
				ps.setString(3, data.getProductor());
				ps.setString(4, data.getDerechoAutor());
				ps.setString(5, data.getSerie());
				ps.setString(6, data.getTitulo());
				ps.setString(7, data.getSubserie());
				ps.setString(8, data.getSubtitulo());
				ps.setString(9, data.getTituloTraducido());
				ps.setString(10, data.getClaveIdentificacion());
				ps.setLong(11, data.getNumeroObra());
				ps.setLong(12, data.getNumeroSerie());
				ps.setString(13, data.getFormato());
				ps.setString(14, data.getNnnov());
				ps.setString(15, data.getCredito());
				ps.setString(16, data.getLugarProduccion());
				ps.setString(17, data.getTema());
				ps.setString(18, data.getSinopsi());
				ps.setString(19, data.getDuracion());
				ps.setString(20, data.getAnioProduccion());
				ps.setString(21, data.getIdioma());
				ps.setString(22, data.getVersione());
				ps.setString(23, data.getSistemaGrabacion());
				ps.setString(24, data.getColor());
				ps.setString(25, data.getSonido());
				ps.setString(26, data.getDisponibilidad());
				ps.setString(27, data.getObservacione());
				ps.setTimestamp(28, new java.sql.Timestamp(data.getDisponibleHasta().getTime()));
				ps.setLong(29, data.getEpisodio());
				ps.setLong(30, data.getTemporada());
				ps.setLong(31, data.getCalificacion());
				ps.setString(32, data.getTag());
				ps.setLong(33, data.getIdSerie());
				ps.setString(34, data.getUrl());
				ps.setString(35, data.getThumbnail());
				ps.setLong(36, data.getVisible());
				ps.setString(37, data.getYoutubeListId());
				ps.setString(38, data.getYoutubeId());
				ps.setString(39, data.getFechaCreacion());
				ps.setString(40, data.getFechaModificacion());
				ps.setLong(41, data.getIdVod());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Vod row  = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final Vod data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO vod ( id_institucion, autor, productor, derecho_autor, serie, titulo, subserie, subtitulo, titulo_traducido, clave_identificacion, numero_obra, numero_serie, formato, nnnov, creditos, lugar_produccion, temas, sinopsis, duracion, anio_produccion, idioma, versiones, sistema_grabacion, color, sonido, disponibilidad, observaciones, disponible_hasta, episodio, temporada, calificacion, tags, id_serie, url, thumbnail, visible, youtube_list_id, youtube_id, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdInstitucion());
				ps.setString(2, data.getAutor());
				ps.setString(3, data.getProductor());
				ps.setString(4, data.getDerechoAutor());
				ps.setString(5, data.getSerie());
				ps.setString(6, data.getTitulo());
				ps.setString(7, data.getSubserie());
				ps.setString(8, data.getSubtitulo());
				ps.setString(9, data.getTituloTraducido());
				ps.setString(10, data.getClaveIdentificacion());
				ps.setLong(11, data.getNumeroObra());
				ps.setLong(12, data.getNumeroSerie());
				ps.setString(13, data.getFormato());
				ps.setString(14, data.getNnnov());
				ps.setString(15, data.getCredito());
				ps.setString(16, data.getLugarProduccion());
				ps.setString(17, data.getTema());
				ps.setString(18, data.getSinopsi());
				ps.setString(19, data.getDuracion());
				ps.setString(20, data.getAnioProduccion());
				ps.setString(21, data.getIdioma());
				ps.setString(22, data.getVersione());
				ps.setString(23, data.getSistemaGrabacion());
				ps.setString(24, data.getColor());
				ps.setString(25, data.getSonido());
				ps.setString(26, data.getDisponibilidad());
				ps.setString(27, data.getObservacione());
				ps.setTimestamp(28, new java.sql.Timestamp(data.getDisponibleHasta().getTime()));
				ps.setLong(29, data.getEpisodio());
				ps.setLong(30, data.getTemporada());
				ps.setLong(31, data.getCalificacion());
				ps.setString(32, data.getTag());
				ps.setLong(33, data.getIdSerie());
				ps.setString(34, data.getUrl());
				ps.setString(35, data.getThumbnail());
				ps.setLong(36, data.getVisible());
				ps.setString(37, data.getYoutubeListId());
				ps.setString(38, data.getYoutubeId());
				ps.setString(39, data.getFechaCreacion());
				ps.setString(40, data.getFechaModificacion());
			}
		});
		data.setIdVod(id);
		return id;
	}

	public List<Vod> queryAll()throws Exception{
		String sql = "SELECT * FROM vod";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<Vod> queryByIdVod(Long idVod)throws Exception{
		String sql = "SELECT * FROM vod WHERE id_vod='"+idVod+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByIdInstitucion(Long idInstitucion)throws Exception{
		String sql = "SELECT * FROM vod WHERE id_institucion='"+idInstitucion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByAutor(String autor)throws Exception{
		String sql = "SELECT * FROM vod WHERE autor='"+autor+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByProductor(String productor)throws Exception{
		String sql = "SELECT * FROM vod WHERE productor='"+productor+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByDerechoAutor(String derechoAutor)throws Exception{
		String sql = "SELECT * FROM vod WHERE derecho_autor='"+derechoAutor+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryBySerie(String serie)throws Exception{
		String sql = "SELECT * FROM vod WHERE serie='"+serie+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByTitulo(String titulo)throws Exception{
		String sql = "SELECT * FROM vod WHERE titulo='"+titulo+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryBySubserie(String subserie)throws Exception{
		String sql = "SELECT * FROM vod WHERE subserie='"+subserie+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryBySubtitulo(String subtitulo)throws Exception{
		String sql = "SELECT * FROM vod WHERE subtitulo='"+subtitulo+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByTituloTraducido(String tituloTraducido)throws Exception{
		String sql = "SELECT * FROM vod WHERE titulo_traducido='"+tituloTraducido+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByClaveIdentificacion(String claveIdentificacion)throws Exception{
		String sql = "SELECT * FROM vod WHERE clave_identificacion='"+claveIdentificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByNumeroObra(Long numeroObra)throws Exception{
		String sql = "SELECT * FROM vod WHERE numero_obra='"+numeroObra+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByNumeroSerie(Long numeroSerie)throws Exception{
		String sql = "SELECT * FROM vod WHERE numero_serie='"+numeroSerie+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByFormato(String formato)throws Exception{
		String sql = "SELECT * FROM vod WHERE formato='"+formato+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByNnnov(String nnnov)throws Exception{
		String sql = "SELECT * FROM vod WHERE nnnov='"+nnnov+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByCredito(String credito)throws Exception{
		String sql = "SELECT * FROM vod WHERE creditos='"+credito+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByLugarProduccion(String lugarProduccion)throws Exception{
		String sql = "SELECT * FROM vod WHERE lugar_produccion='"+lugarProduccion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByTema(String tema)throws Exception{
		String sql = "SELECT * FROM vod WHERE temas='"+tema+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryBySinopsi(String sinopsi)throws Exception{
		String sql = "SELECT * FROM vod WHERE sinopsis='"+sinopsi+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByDuracion(String duracion)throws Exception{
		String sql = "SELECT * FROM vod WHERE duracion='"+duracion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByAnioProduccion(String anioProduccion)throws Exception{
		String sql = "SELECT * FROM vod WHERE anio_produccion='"+anioProduccion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByIdioma(String idioma)throws Exception{
		String sql = "SELECT * FROM vod WHERE idioma='"+idioma+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByVersione(String versione)throws Exception{
		String sql = "SELECT * FROM vod WHERE versiones='"+versione+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryBySistemaGrabacion(String sistemaGrabacion)throws Exception{
		String sql = "SELECT * FROM vod WHERE sistema_grabacion='"+sistemaGrabacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByColor(String color)throws Exception{
		String sql = "SELECT * FROM vod WHERE color='"+color+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryBySonido(String sonido)throws Exception{
		String sql = "SELECT * FROM vod WHERE sonido='"+sonido+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByDisponibilidad(String disponibilidad)throws Exception{
		String sql = "SELECT * FROM vod WHERE disponibilidad='"+disponibilidad+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByObservacione(String observacione)throws Exception{
		String sql = "SELECT * FROM vod WHERE observaciones='"+observacione+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByDisponibleHasta(Date disponibleHasta)throws Exception{
		String sql = "SELECT * FROM vod WHERE disponible_hasta='"+disponibleHasta+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByEpisodio(Long episodio)throws Exception{
		String sql = "SELECT * FROM vod WHERE episodio='"+episodio+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByTemporada(Long temporada)throws Exception{
		String sql = "SELECT * FROM vod WHERE temporada='"+temporada+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByCalificacion(Long calificacion)throws Exception{
		String sql = "SELECT * FROM vod WHERE calificacion='"+calificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByTag(String tag)throws Exception{
		String sql = "SELECT * FROM vod WHERE tags='"+tag+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByIdSerie(Long idSerie)throws Exception{
		String sql = "SELECT * FROM vod WHERE id_serie='"+idSerie+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByUrl(String url)throws Exception{
		String sql = "SELECT * FROM vod WHERE url='"+url+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByThumbnail(String thumbnail)throws Exception{
		String sql = "SELECT * FROM vod WHERE thumbnail='"+thumbnail+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByVisible(Long visible)throws Exception{
		String sql = "SELECT * FROM vod WHERE visible='"+visible+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByYoutubeListId(String youtubeListId)throws Exception{
		String sql = "SELECT * FROM vod WHERE youtube_list_id='"+youtubeListId+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByYoutubeId(String youtubeId)throws Exception{
		String sql = "SELECT * FROM vod WHERE youtube_id='"+youtubeId+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM vod WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Vod> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM vod WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Vod row = new Vod();
				row.setIdVod(rs.getLong("id_vod"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setAutor(rs.getString("autor"));
				row.setProductor(rs.getString("productor"));
				row.setDerechoAutor(rs.getString("derecho_autor"));
				row.setSerie(rs.getString("serie"));
				row.setTitulo(rs.getString("titulo"));
				row.setSubserie(rs.getString("subserie"));
				row.setSubtitulo(rs.getString("subtitulo"));
				row.setTituloTraducido(rs.getString("titulo_traducido"));
				row.setClaveIdentificacion(rs.getString("clave_identificacion"));
				row.setNumeroObra(rs.getLong("numero_obra"));
				row.setNumeroSerie(rs.getLong("numero_serie"));
				row.setFormato(rs.getString("formato"));
				row.setNnnov(rs.getString("nnnov"));
				row.setCredito(rs.getString("creditos"));
				row.setLugarProduccion(rs.getString("lugar_produccion"));
				row.setTema(rs.getString("temas"));
				row.setSinopsi(rs.getString("sinopsis"));
				row.setDuracion(rs.getString("duracion"));
				row.setAnioProduccion(rs.getString("anio_produccion"));
				row.setIdioma(rs.getString("idioma"));
				row.setVersione(rs.getString("versiones"));
				row.setSistemaGrabacion(rs.getString("sistema_grabacion"));
				row.setColor(rs.getString("color"));
				row.setSonido(rs.getString("sonido"));
				row.setDisponibilidad(rs.getString("disponibilidad"));
				row.setObservacione(rs.getString("observaciones"));
				row.setDisponibleHasta(new Date(rs.getTimestamp("disponible_hasta").getTime()));
				row.setEpisodio(rs.getLong("episodio"));
				row.setTemporada(rs.getLong("temporada"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setTag(rs.getString("tags"));
				row.setIdSerie(rs.getLong("id_serie"));
				row.setUrl(rs.getString("url"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListId(rs.getString("youtube_list_id"));
				row.setYoutubeId(rs.getString("youtube_id"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}