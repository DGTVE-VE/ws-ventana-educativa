package com.appspot.wsventanaeducativa.dao.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
    @Entity
public class Pagina implements java.io.Serializable{
	@Id
	private Long idPag;
	private Long idLibro;
	private String url;
	private String numeroInterno;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdPag(){
		return this.idPag;
	}

	public Long getIdLibro(){
		return this.idLibro;
	}

	public String getUrl(){
		return this.url;
	}

	public String getNumeroInterno(){
		return this.numeroInterno;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setIdPag(Long idPag){
		this.idPag = idPag;
	}

	public void setIdLibro(Long idLibro){
		this.idLibro = idLibro;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public void setNumeroInterno(String numeroInterno){
		this.numeroInterno = numeroInterno;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}