package com.appspot.wsventanaeducativa.dao.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Escuela implements java.io.Serializable{
	@Id
	private Long idEscuela;
	private String nombre;
	private String direccion;
	private String colonia;
	private String municipio;
	private String estado;
	private String codigoPostal;
	private String clave;
	private Long privada;
	private String nivel;
	private String institucion;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdEscuela(){
		return this.idEscuela;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getDireccion(){
		return this.direccion;
	}

	public String getColonia(){
		return this.colonia;
	}

	public String getMunicipio(){
		return this.municipio;
	}

	public String getEstado(){
		return this.estado;
	}

	public String getCodigoPostal(){
		return this.codigoPostal;
	}

	public String getClave(){
		return this.clave;
	}

	public Long getPrivada(){
		return this.privada;
	}

	public String getNivel(){
		return this.nivel;
	}

	public String getInstitucion(){
		return this.institucion;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setIdEscuela(Long idEscuela){
		this.idEscuela = idEscuela;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public void setColonia(String colonia){
		this.colonia = colonia;
	}

	public void setMunicipio(String municipio){
		this.municipio = municipio;
	}

	public void setEstado(String estado){
		this.estado = estado;
	}

	public void setCodigoPostal(String codigoPostal){
		this.codigoPostal = codigoPostal;
	}

	public void setClave(String clave){
		this.clave = clave;
	}

	public void setPrivada(Long privada){
		this.privada = privada;
	}

	public void setNivel(String nivel){
		this.nivel = nivel;
	}

	public void setInstitucion(String institucion){
		this.institucion = institucion;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}