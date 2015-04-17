package com.appspot.wsventanaeducativa.dao.dto;

public class Serie implements java.io.Serializable{
	private Long idSerie;
	private Long idInstitucion;
	private String titulo;
	private String descripcion;
	private String thumbnail;
	private String tag;
	private Long temporada;
	private Long calificacion;
	private Long visible;
	private String youtubeListUrl;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdSerie(){
		return this.idSerie;
	}

	public Long getIdInstitucion(){
		return this.idInstitucion;
	}

	public String getTitulo(){
		return this.titulo;
	}

	public String getDescripcion(){
		return this.descripcion;
	}

	public String getThumbnail(){
		return this.thumbnail;
	}

	public String getTag(){
		return this.tag;
	}

	public Long getTemporada(){
		return this.temporada;
	}

	public Long getCalificacion(){
		return this.calificacion;
	}

	public Long getVisible(){
		return this.visible;
	}

	public String getYoutubeListUrl(){
		return this.youtubeListUrl;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setIdSerie(Long idSerie){
		this.idSerie = idSerie;
	}

	public void setIdInstitucion(Long idInstitucion){
		this.idInstitucion = idInstitucion;
	}

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}

	public void setTag(String tag){
		this.tag = tag;
	}

	public void setTemporada(Long temporada){
		this.temporada = temporada;
	}

	public void setCalificacion(Long calificacion){
		this.calificacion = calificacion;
	}

	public void setVisible(Long visible){
		this.visible = visible;
	}

	public void setYoutubeListUrl(String youtubeListUrl){
		this.youtubeListUrl = youtubeListUrl;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}