package com.appspot.wsventanaeducativa.dao.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

    @Entity
public class UsuarioEscuela implements java.io.Serializable{
	@Id
	private Long idUsuario;
	private Long idEscuela;
	private java.util.Date inicio;
	private java.util.Date fin;
	private Long cursaActualmente;
	private String titulo;
	private String fechaCreacionl;
	private String fechaModificacion;

	public Long getIdUsuario(){
		return this.idUsuario;
	}

	public Long getIdEscuela(){
		return this.idEscuela;
	}

	public java.util.Date getInicio(){
		return this.inicio;
	}

	public java.util.Date getFin(){
		return this.fin;
	}

	public Long getCursaActualmente(){
		return this.cursaActualmente;
	}

	public String getTitulo(){
		return this.titulo;
	}

	public String getFechaCreacionl(){
		return this.fechaCreacionl;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setIdUsuario(Long idUsuario){
		this.idUsuario = idUsuario;
	}

	public void setIdEscuela(Long idEscuela){
		this.idEscuela = idEscuela;
	}

	public void setInicio(java.util.Date inicio){
		this.inicio = inicio;
	}

	public void setFin(java.util.Date fin){
		this.fin = fin;
	}

	public void setCursaActualmente(Long cursaActualmente){
		this.cursaActualmente = cursaActualmente;
	}

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public void setFechaCreacionl(String fechaCreacionl){
		this.fechaCreacionl = fechaCreacionl;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}