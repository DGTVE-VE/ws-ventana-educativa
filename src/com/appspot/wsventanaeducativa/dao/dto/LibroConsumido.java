package com.appspot.wsventanaeducativa.dao.dto;

public class LibroConsumido implements java.io.Serializable{
	private Long idLibroConsumido;
	private Long idLibro;
	private Long idUsuario;
	private String tiempo;
	private String ip;
	private Long paginaInicio;
	private Long paginaFin;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdLibroConsumido(){
		return this.idLibroConsumido;
	}

	public Long getIdLibro(){
		return this.idLibro;
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

	public Long getPaginaInicio(){
		return this.paginaInicio;
	}

	public Long getPaginaFin(){
		return this.paginaFin;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setIdLibroConsumido(Long idLibroConsumido){
		this.idLibroConsumido = idLibroConsumido;
	}

	public void setIdLibro(Long idLibro){
		this.idLibro = idLibro;
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

	public void setPaginaInicio(Long paginaInicio){
		this.paginaInicio = paginaInicio;
	}

	public void setPaginaFin(Long paginaFin){
		this.paginaFin = paginaFin;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}