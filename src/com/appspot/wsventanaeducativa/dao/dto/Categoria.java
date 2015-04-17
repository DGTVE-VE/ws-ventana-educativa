package com.appspot.wsventanaeducativa.dao.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categoria implements java.io.Serializable{
	
	@Id
	private String categoria;
	private String descripcion;
	private String categoriaPadre;
	private String fechaCreacion;
	private String fechaModificacion;

	public String getCategoria(){
		return this.categoria;
	}

	public String getDescripcion(){
		return this.descripcion;
	}

	public String getCategoriaPadre(){
		return this.categoriaPadre;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setCategoria(String categoria){
		this.categoria = categoria;
	}

	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	public void setCategoriaPadre(String categoriaPadre){
		this.categoriaPadre = categoriaPadre;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}