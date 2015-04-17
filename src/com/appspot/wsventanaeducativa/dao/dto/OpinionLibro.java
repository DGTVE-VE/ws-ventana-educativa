package com.appspot.wsventanaeducativa.dao.dto;

public class OpinionLibro implements java.io.Serializable{
	private Long idLibro;
	private Long idUsuario;
	private String opinion;
	private Long calificacion;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdLibro(){
		return this.idLibro;
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


	public void setIdLibro(Long idLibro){
		this.idLibro = idLibro;
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