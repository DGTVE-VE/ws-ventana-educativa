package com.appspot.wsventanaeducativa.dao.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LogEventosAdministrador implements java.io.Serializable{
	@Id
	private Long idLogEventosAdministrador;
	private Long idAdministrador;
	private String log;
	private String tipoEvento;
	private String direccionIp;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdLogEventosAdministrador(){
		return this.idLogEventosAdministrador;
	}

	public Long getIdAdministrador(){
		return this.idAdministrador;
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


	public void setIdLogEventosAdministrador(Long idLogEventosAdministrador){
		this.idLogEventosAdministrador = idLogEventosAdministrador;
	}

	public void setIdAdministrador(Long idAdministrador){
		this.idAdministrador = idAdministrador;
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