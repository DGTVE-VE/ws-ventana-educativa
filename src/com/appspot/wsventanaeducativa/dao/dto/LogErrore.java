package com.appspot.wsventanaeducativa.dao.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LogErrore implements java.io.Serializable{
	@Id
	private Long idLogError;
	private String log;
	private String tipoError;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdLogError(){
		return this.idLogError;
	}

	public String getLog(){
		return this.log;
	}

	public String getTipoError(){
		return this.tipoError;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setIdLogError(Long idLogError){
		this.idLogError = idLogError;
	}

	public void setLog(String log){
		this.log = log;
	}

	public void setTipoError(String tipoError){
		this.tipoError = tipoError;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}