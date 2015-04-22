package com.appspot.wsventanaeducativa.dao.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

    @Entity
public class Pantalla implements java.io.Serializable{
	@Id
	private Long idPantalla;
	private Long idPantallaPadre;
	private String nombre;
	private String descripcion;
	private Long alto;
	private Long ancho;
	private String thumbnail;
	private Long posicion;
	private Long colspan;
	private Long rowspan;
	private Long fila;
	private Long columna;
	private String tipoVentana;
	private String fechaCreacion;
	private String fechaModificacion;

	public Long getIdPantalla(){
		return this.idPantalla;
	}

	public Long getIdPantallaPadre(){
		return this.idPantallaPadre;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getDescripcion(){
		return this.descripcion;
	}

	public Long getAlto(){
		return this.alto;
	}

	public Long getAncho(){
		return this.ancho;
	}

	public String getThumbnail(){
		return this.thumbnail;
	}

	public Long getPosicion(){
		return this.posicion;
	}

	public Long getColspan(){
		return this.colspan;
	}

	public Long getRowspan(){
		return this.rowspan;
	}

	public Long getFila(){
		return this.fila;
	}

	public Long getColumna(){
		return this.columna;
	}

	public String getTipoVentana(){
		return this.tipoVentana;
	}

	public String getFechaCreacion(){
		return this.fechaCreacion;
	}

	public String getFechaModificacion(){
		return this.fechaModificacion;
	}


	public void setIdPantalla(Long idPantalla){
		this.idPantalla = idPantalla;
	}

	public void setIdPantallaPadre(Long idPantallaPadre){
		this.idPantallaPadre = idPantallaPadre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	public void setAlto(Long alto){
		this.alto = alto;
	}

	public void setAncho(Long ancho){
		this.ancho = ancho;
	}

	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}

	public void setPosicion(Long posicion){
		this.posicion = posicion;
	}

	public void setColspan(Long colspan){
		this.colspan = colspan;
	}

	public void setRowspan(Long rowspan){
		this.rowspan = rowspan;
	}

	public void setFila(Long fila){
		this.fila = fila;
	}

	public void setColumna(Long columna){
		this.columna = columna;
	}

	public void setTipoVentana(String tipoVentana){
		this.tipoVentana = tipoVentana;
	}

	public void setFechaCreacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}

}