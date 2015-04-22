package com.appspot.wsventanaeducativa.dao.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
    @Entity
public class OpinionVod implements java.io.Serializable{
	@Id
	private Long usuarioIdUsuario;
	private Long vodIdVod;
	private String opinion;
	private Long calificacion;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getUsuarioIdUsuario(){
		return this.usuarioIdUsuario;
	}

	public Long getVodIdVod(){
		return this.vodIdVod;
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


	public void setUsuarioIdUsuario(Long usuarioIdUsuario){
		this.usuarioIdUsuario = usuarioIdUsuario;
	}

	public void setVodIdVod(Long vodIdVod){
		this.vodIdVod = vodIdVod;
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