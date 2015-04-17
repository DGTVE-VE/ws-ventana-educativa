package com.appspot.wsventanaeducativa.dao.dto;

public class Usuario implements java.io.Serializable{
	private Long idUsuario;
	private String nombre;
	private String sexo;
	private java.util.Date nacimiento;
	private String nacionalidad;
	private String pai;
	private String region;
	private String ciudad;
	private String correo;
	private String facebook;
	private String google;
	private String live;
	private String twitter;
	private String avatar;
	private String background;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdUsuario(){
		return this.idUsuario;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getSexo(){
		return this.sexo;
	}

	public java.util.Date getNacimiento(){
		return this.nacimiento;
	}

	public String getNacionalidad(){
		return this.nacionalidad;
	}

	public String getPai(){
		return this.pai;
	}

	public String getRegion(){
		return this.region;
	}

	public String getCiudad(){
		return this.ciudad;
	}

	public String getCorreo(){
		return this.correo;
	}

	public String getFacebook(){
		return this.facebook;
	}

	public String getGoogle(){
		return this.google;
	}

	public String getLive(){
		return this.live;
	}

	public String getTwitter(){
		return this.twitter;
	}

	public String getAvatar(){
		return this.avatar;
	}

	public String getBackground(){
		return this.background;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setIdUsuario(Long idUsuario){
		this.idUsuario = idUsuario;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setSexo(String sexo){
		this.sexo = sexo;
	}

	public void setNacimiento(java.util.Date nacimiento){
		this.nacimiento = nacimiento;
	}

	public void setNacionalidad(String nacionalidad){
		this.nacionalidad = nacionalidad;
	}

	public void setPai(String pai){
		this.pai = pai;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public void setCiudad(String ciudad){
		this.ciudad = ciudad;
	}

	public void setCorreo(String correo){
		this.correo = correo;
	}

	public void setFacebook(String facebook){
		this.facebook = facebook;
	}

	public void setGoogle(String google){
		this.google = google;
	}

	public void setLive(String live){
		this.live = live;
	}

	public void setTwitter(String twitter){
		this.twitter = twitter;
	}

	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	public void setBackground(String background){
		this.background = background;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}