package com.appspot.wsventanaeducativa.dao.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

import com.appspot.wsventanaeducativa.dao.dto.Serie;
import com.appspot.wsventanaeducativa.dao.SerieDAO;
import com.appspot.wsventanaeducativa.dao.sql.BaseDAO;
import com.appspot.wsventanaeducativa.dao.sql.DAOCache;
import com.appspot.wsventanaeducativa.dao.sql.PreparedStatementSetter;
import com.appspot.wsventanaeducativa.dao.sql.ResultSetExtractor;

public  class SerieDAOImpl extends BaseDAO implements SerieDAO{
	public static final DAOCache cache = new DAOCache();

	public DAOCache getCache() {
		return cache;
	}

	protected void clearCacheOnInsert(Serie data){}

	public Serie load(final Long id) throws Exception{
		String sql = "SELECT * FROM serie WHERE id=?";
		return (Serie) getRow(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		}, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Serie row  = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	public int delete(final Long id) throws Exception{
		//cache.clear(id);
		String sql = "DELETE FROM serie WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, id);
			}
		});
	}

	public int update(final Serie data) throws Exception{
		//cache.clear(data.getId());
		String sql = "UPDATE serie SET id_institucion = ?, titulo = ?, descripcion = ?, thumbnail = ?, tags = ?, temporadas = ?, calificacion = ?, visible = ?, youtube_list_url = ?, fecha_creacion = ?, fecha_modificacion = ? WHERE id=?";
		return executeUpdate(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdInstitucion());
				ps.setString(2, data.getTitulo());
				ps.setString(3, data.getDescripcion());
				ps.setString(4, data.getThumbnail());
				ps.setString(5, data.getTag());
				ps.setLong(6, data.getTemporada());
				ps.setLong(7, data.getCalificacion());
				ps.setLong(8, data.getVisible());
				ps.setString(9, data.getYoutubeListUrl());
				ps.setString(10, data.getFechaCreacion());
				ps.setString(11, data.getFechaModificacion());
				ps.setLong(12, data.getIdSerie());
			}
	});
	}

	public ResultSetExtractor getDefaultExtractor() throws Exception{
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
			Serie row  = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public long insert(final Serie data) throws Exception{
		clearCacheOnInsert(data);
		String sql = "INSERT INTO serie ( id_institucion, titulo, descripcion, thumbnail, tags, temporadas, calificacion, visible, youtube_list_url, fecha_creacion, fecha_modificacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
		long id = executeInsert(sql, new PreparedStatementSetter() {
			public void prepare(PreparedStatement ps) throws SQLException {
				ps.setLong(1, data.getIdInstitucion());
				ps.setString(2, data.getTitulo());
				ps.setString(3, data.getDescripcion());
				ps.setString(4, data.getThumbnail());
				ps.setString(5, data.getTag());
				ps.setLong(6, data.getTemporada());
				ps.setLong(7, data.getCalificacion());
				ps.setLong(8, data.getVisible());
				ps.setString(9, data.getYoutubeListUrl());
				ps.setString(10, data.getFechaCreacion());
				ps.setString(11, data.getFechaModificacion());
			}
		});
		data.setIdSerie(id);
		return id;
	}

	public List<Serie> queryAll()throws Exception{
		String sql = "SELECT * FROM serie";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Serie row = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	 public ResultSetExtractor getListResultSetExtractor(){
		return new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Serie row = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	};
	}

	public List<Serie> queryByIdSerie(Long idSerie)throws Exception{
		String sql = "SELECT * FROM serie WHERE id_serie='"+idSerie+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Serie row = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Serie> queryByIdInstitucion(Long idInstitucion)throws Exception{
		String sql = "SELECT * FROM serie WHERE id_institucion='"+idInstitucion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Serie row = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Serie> queryByTitulo(String titulo)throws Exception{
		String sql = "SELECT * FROM serie WHERE titulo='"+titulo+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Serie row = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Serie> queryByDescripcion(String descripcion)throws Exception{
		String sql = "SELECT * FROM serie WHERE descripcion='"+descripcion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Serie row = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Serie> queryByThumbnail(String thumbnail)throws Exception{
		String sql = "SELECT * FROM serie WHERE thumbnail='"+thumbnail+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Serie row = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Serie> queryByTag(String tag)throws Exception{
		String sql = "SELECT * FROM serie WHERE tags='"+tag+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Serie row = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Serie> queryByTemporada(Long temporada)throws Exception{
		String sql = "SELECT * FROM serie WHERE temporadas='"+temporada+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Serie row = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Serie> queryByCalificacion(Long calificacion)throws Exception{
		String sql = "SELECT * FROM serie WHERE calificacion='"+calificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Serie row = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Serie> queryByVisible(Long visible)throws Exception{
		String sql = "SELECT * FROM serie WHERE visible='"+visible+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Serie row = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Serie> queryByYoutubeListUrl(String youtubeListUrl)throws Exception{
		String sql = "SELECT * FROM serie WHERE youtube_list_url='"+youtubeListUrl+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Serie row = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Serie> queryByFechaCreacion(String fechaCreacion)throws Exception{
		String sql = "SELECT * FROM serie WHERE fecha_creacion='"+fechaCreacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Serie row = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}
	public List<Serie> queryByFechaModificacion(String fechaModificacion)throws Exception{
		String sql = "SELECT * FROM serie WHERE fecha_modificacion='"+fechaModificacion+"'";
		return (List) getList(sql, new ResultSetExtractor() {
			public Object extract(ResultSet rs) throws SQLException {
				Serie row = new Serie();
				row.setIdSerie(rs.getLong("id_serie"));
				row.setIdInstitucion(rs.getLong("id_institucion"));
				row.setTitulo(rs.getString("titulo"));
				row.setDescripcion(rs.getString("descripcion"));
				row.setThumbnail(rs.getString("thumbnail"));
				row.setTag(rs.getString("tags"));
				row.setTemporada(rs.getLong("temporadas"));
				row.setCalificacion(rs.getLong("calificacion"));
				row.setVisible(rs.getLong("visible"));
				row.setYoutubeListUrl(rs.getString("youtube_list_url"));
				row.setFechaCreacion(rs.getString("fecha_creacion"));
				row.setFechaModificacion(rs.getString("fecha_modificacion"));
				return row;
			}
	});
	}

	}