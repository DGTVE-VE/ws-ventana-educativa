package com.appspot.wsventanaeducativa.dao.dto;

public class VodConsumido implements java.io.Serializable{
	private Long idVodConsumido;
	private Long idVod;
	private Long idUsuario;
	private String tiempo;
	private String ip;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdVodConsumido(){
		return this.idVodConsumido;
	}

	public Long getIdVod(){
		return this.idVod;
	}

	public Long getIdUsuario(){
		return this.idUsuario;
	}

	public String getTiempo(){
		return this.tiempo;
	}

	public String getIp(){
		return this.ip;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setIdVodConsumido(Long idVodConsumido){
		this.idVodConsumido = idVodConsumido;
	}

	public void setIdVod(Long idVod){
		this.idVod = idVod;
	}

	public void setIdUsuario(Long idUsuario){
		this.idUsuario = idUsuario;
	}

	public void setTiempo(String tiempo){
		this.tiempo = tiempo;
	}

	public void setIp(String ip){
		this.ip = ip;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}