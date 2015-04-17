package com.appspot.wsventanaeducativa.dao.dto;

public class PaginaContenido implements java.io.Serializable{
	private Long idContenido;
	private Long idPag;
	private Long idLibro;
	private Long x;
	private Long y;
	private String url;
	private String tipoContenido;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdContenido(){
		return this.idContenido;
	}

	public Long getIdPag(){
		return this.idPag;
	}

	public Long getIdLibro(){
		return this.idLibro;
	}

	public Long getX(){
		return this.x;
	}

	public Long getY(){
		return this.y;
	}

	public String getUrl(){
		return this.url;
	}

	public String getTipoContenido(){
		return this.tipoContenido;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setIdContenido(Long idContenido){
		this.idContenido = idContenido;
	}

	public void setIdPag(Long idPag){
		this.idPag = idPag;
	}

	public void setIdLibro(Long idLibro){
		this.idLibro = idLibro;
	}

	public void setX(Long x){
		this.x = x;
	}

	public void setY(Long y){
		this.y = y;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public void setTipoContenido(String tipoContenido){
		this.tipoContenido = tipoContenido;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}