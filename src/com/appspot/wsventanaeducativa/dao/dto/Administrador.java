package com.appspot.wsventanaeducativa.dao.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Administrador implements java.io.Serializable{
	@Id
	private Long idAdministrador;
	private String nombre;
	private String correo;
	private String telefono;
	private String cargo;
	private String dependencia;
	private String password;
	private Long idInstitucion;
	private Long superadministrador;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdAdministrador(){
		return this.idAdministrador;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getCorreo(){
		return this.correo;
	}

	public String getTelefono(){
		return this.telefono;
	}

	public String getCargo(){
		return this.cargo;
	}

	public String getDependencia(){
		return this.dependencia;
	}

	public String getPassword(){
		return this.password;
	}

	public Long getIdInstitucion(){
		return this.idInstitucion;
	}

	public Long getSuperadministrador(){
		return this.superadministrador;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setIdAdministrador(Long idAdministrador){
		this.idAdministrador = idAdministrador;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setCorreo(String correo){
		this.correo = correo;
	}

	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	public void setCargo(String cargo){
		this.cargo = cargo;
	}

	public void setDependencia(String dependencia){
		this.dependencia = dependencia;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public void setIdInstitucion(Long idInstitucion){
		this.idInstitucion = idInstitucion;
	}

	public void setSuperadministrador(Long superadministrador){
		this.superadministrador = superadministrador;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}