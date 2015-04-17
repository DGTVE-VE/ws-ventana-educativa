package com.appspot.wsventanaeducativa.dao.dto;

public class Institucion implements java.io.Serializable{
	private Long idInstitucion;
	private String nombre;
	private String contacto;
	private String telefono;
	private String correo;
	private String abreviatura;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdInstitucion(){
		return this.idInstitucion;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getContacto(){
		return this.contacto;
	}

	public String getTelefono(){
		return this.telefono;
	}

	public String getCorreo(){
		return this.correo;
	}

	public String getAbreviatura(){
		return this.abreviatura;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setIdInstitucion(Long idInstitucion){
		this.idInstitucion = idInstitucion;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setContacto(String contacto){
		this.contacto = contacto;
	}

	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	public void setCorreo(String correo){
		this.correo = correo;
	}

	public void setAbreviatura(String abreviatura){
		this.abreviatura = abreviatura;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}