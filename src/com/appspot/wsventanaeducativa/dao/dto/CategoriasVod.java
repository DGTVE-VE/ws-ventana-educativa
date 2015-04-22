package com.appspot.wsventanaeducativa.dao.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CategoriasVod implements java.io.Serializable{
	
	@Id
	private String categoriasCategoria;
	@Id
	private Long vodIdVod;
	private String fechaCreacion;
	private String fechaModificacion;

	public String getCategoriasCategoria(){
		return this.categoriasCategoria;
	}

	public Long getVodIdVod(){
		return this.vodIdVod;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setCategoriasCategoria(String categoriasCategoria){
		this.categoriasCategoria = categoriasCategoria;
	}

	public void setVodIdVod(Long vodIdVod){
		this.vodIdVod = vodIdVod;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}