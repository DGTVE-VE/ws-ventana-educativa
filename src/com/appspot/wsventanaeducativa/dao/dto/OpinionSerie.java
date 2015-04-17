package com.appspot.wsventanaeducativa.dao.dto;

public class OpinionSerie implements java.io.Serializable{
	private Long idContenido;
	private Long idUsuario;
	private String opinion;
	private Long calificacion;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdContenido(){
		return this.idContenido;
	}

	public Long getIdUsuario(){
		return this.idUsuario;
	}

	public String getOpinion(){
		return this.opinion;
	}

	public Long getCalificacion(){
		return this.calificacion;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setIdContenido(Long idContenido){
		this.idContenido = idContenido;
	}

	public void setIdUsuario(Long idUsuario){
		this.idUsuario = idUsuario;
	}

	public void setOpinion(String opinion){
		this.opinion = opinion;
	}

	public void setCalificacion(Long calificacion){
		this.calificacion = calificacion;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}