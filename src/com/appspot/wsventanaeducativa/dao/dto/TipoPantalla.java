package com.appspot.wsventanaeducativa.dao.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

    @Entity
public class TipoPantalla implements java.io.Serializable{
	@Id
	private String tipoPantalla;
	private String descripcion;
	private String fechaCreacion;
	private String fechaModificacion;

	public String getTipoPantalla(){
		return this.tipoPantalla;
	}

	public String getDescripcion(){
		return this.descripcion;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setTipoPantalla(String tipoPantalla){
		this.tipoPantalla = tipoPantalla;
	}

	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}