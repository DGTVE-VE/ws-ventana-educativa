package com.appspot.wsventanaeducativa.dao.dto;

public class SerieCategoria implements java.io.Serializable{
	private Long idSerie;
	private String categoria;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdSerie(){
		return this.idSerie;
	}

	public String getCategoria(){
		return this.categoria;
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

	public void setCategoria(String categoria){
		this.categoria = categoria;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}