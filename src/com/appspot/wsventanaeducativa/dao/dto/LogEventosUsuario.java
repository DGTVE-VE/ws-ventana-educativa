package com.appspot.wsventanaeducativa.dao.dto;

public class LogEventosUsuario implements java.io.Serializable{
	private Long idLogEventosUsuario;
	private Long idUsuario;
	private String log;
	private String tipoEvento;
	private String direccionIp;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdLogEventosUsuario(){
		return this.idLogEventosUsuario;
	}

	public Long getIdUsuario(){
		return this.idUsuario;
	}

	public String getLog(){
		return this.log;
	}

	public String getTipoEvento(){
		return this.tipoEvento;
	}

	public String getDireccionIp(){
		return this.direccionIp;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setIdLogEventosUsuario(Long idLogEventosUsuario){
		this.idLogEventosUsuario = idLogEventosUsuario;
	}

	public void setIdUsuario(Long idUsuario){
		this.idUsuario = idUsuario;
	}

	public void setLog(String log){
		this.log = log;
	}

	public void setTipoEvento(String tipoEvento){
		this.tipoEvento = tipoEvento;
	}

	public void setDireccionIp(String direccionIp){
		this.direccionIp = direccionIp;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}