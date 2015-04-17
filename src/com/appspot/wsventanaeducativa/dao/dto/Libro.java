package com.appspot.wsventanaeducativa.dao.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Libro implements java.io.Serializable{
	@Id
	private Long idLibro;
	private String autor;
	private String colaboradore;
	private String propietario;
	private String titulo;
	private String subtitulo;
	private Long edicion;
	private String editorial;
	private String lugar;
	private java.util.Date fechaPublicacion;
	private String anioPublicacion;
	private Long pagina;
	private String serie;
	private Long numeroSerie;
	private Long volumen;
	private String descripcion;
	private String isbn10;
	private String isbn13;
	private String ean13;
	private String issn;
	private String idioma;
	private String tituloTraducido;
	private String url;
	private Long calificacion;
	private String tema;
	private String tag;
	private String thumbnail;
	private Long idInstitucion;
	private String fechaCreacion;
	private String fechaModificacion;
	private Long visible;

	public Long getIdLibro(){
		return this.idLibro;
	}

	public String getAutor(){
		return this.autor;
	}

	public String getColaboradore(){
		return this.colaboradore;
	}

	public String getPropietario(){
		return this.propietario;
	}

	public String getTitulo(){
		return this.titulo;
	}

	public String getSubtitulo(){
		return this.subtitulo;
	}

	public Long getEdicion(){
		return this.edicion;
	}

	public String getEditorial(){
		return this.editorial;
	}

	public String getLugar(){
		return this.lugar;
	}

	public java.util.Date getFechaPublicacion(){
		return this.fechaPublicacion;
	}

	public String getAnioPublicacion(){
		return this.anioPublicacion;
	}

	public Long getPagina(){
		return this.pagina;
	}

	public String getSerie(){
		return this.serie;
	}

	public Long getNumeroSerie(){
		return this.numeroSerie;
	}

	public Long getVolumen(){
		return this.volumen;
	}

	public String getDescripcion(){
		return this.descripcion;
	}

	public String getIsbn10(){
		return this.isbn10;
	}

	public String getIsbn13(){
		return this.isbn13;
	}

	public String getEan13(){
		return this.ean13;
	}

	public String getIssn(){
		return this.issn;
	}

	public String getIdioma(){
		return this.idioma;
	}

	public String getTituloTraducido(){
		return this.tituloTraducido;
	}

	public String getUrl(){
		return this.url;
	}

	public Long getCalificacion(){
		return this.calificacion;
	}

	public String getTema(){
		return this.tema;
	}

	public String getTag(){
		return this.tag;
	}

	public String getThumbnail(){
		return this.thumbnail;
	}

	public Long getIdInstitucion(){
		return this.idInstitucion;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}

	public Long getVisible(){
		return this.visible;
	}


	public void setIdLibro(Long idLibro){
		this.idLibro = idLibro;
	}

	public void setAutor(String autor){
		this.autor = autor;
	}

	public void setColaboradore(String colaboradore){
		this.colaboradore = colaboradore;
	}

	public void setPropietario(String propietario){
		this.propietario = propietario;
	}

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public void setSubtitulo(String subtitulo){
		this.subtitulo = subtitulo;
	}

	public void setEdicion(Long edicion){
		this.edicion = edicion;
	}

	public void setEditorial(String editorial){
		this.editorial = editorial;
	}

	public void setLugar(String lugar){
		this.lugar = lugar;
	}

	public void setFechaPublicacion(java.util.Date fechaPublicacion){
		this.fechaPublicacion = fechaPublicacion;
	}

	public void setAnioPublicacion(String anioPublicacion){
		this.anioPublicacion = anioPublicacion;
	}

	public void setPagina(Long pagina){
		this.pagina = pagina;
	}

	public void setSerie(String serie){
		this.serie = serie;
	}

	public void setNumeroSerie(Long numeroSerie){
		this.numeroSerie = numeroSerie;
	}

	public void setVolumen(Long volumen){
		this.volumen = volumen;
	}

	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	public void setIsbn10(String isbn10){
		this.isbn10 = isbn10;
	}

	public void setIsbn13(String isbn13){
		this.isbn13 = isbn13;
	}

	public void setEan13(String ean13){
		this.ean13 = ean13;
	}

	public void setIssn(String issn){
		this.issn = issn;
	}

	public void setIdioma(String idioma){
		this.idioma = idioma;
	}

	public void setTituloTraducido(String tituloTraducido){
		this.tituloTraducido = tituloTraducido;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public void setCalificacion(Long calificacion){
		this.calificacion = calificacion;
	}

	public void setTema(String tema){
		this.tema = tema;
	}

	public void setTag(String tag){
		this.tag = tag;
	}

	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}

	public void setIdInstitucion(Long idInstitucion){
		this.idInstitucion = idInstitucion;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

	public void setVisible(Long visible){
		this.visible = visible;
	}

}