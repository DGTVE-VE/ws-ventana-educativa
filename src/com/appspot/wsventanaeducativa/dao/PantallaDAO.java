package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.Pantalla;
public interface PantallaDAO{
	Pantalla load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final Pantalla data) throws Exception;

	public long insert(final Pantalla data) throws Exception;


	public List<Pantalla> queryAll()throws Exception;



	public List<Pantalla> queryByIdPantalla(Long idPantalla)throws Exception;
	public List<Pantalla> queryByIdPantallaPadre(Long idPantallaPadre)throws Exception;
	public List<Pantalla> queryByNombre(String nombre)throws Exception;
	public List<Pantalla> queryByDescripcion(String descripcion)throws Exception;
	public List<Pantalla> queryByAlto(Long alto)throws Exception;
	public List<Pantalla> queryByAncho(Long ancho)throws Exception;
	public List<Pantalla> queryByThumbnail(String thumbnail)throws Exception;
	public List<Pantalla> queryByPosicion(Long posicion)throws Exception;
	public List<Pantalla> queryByColspan(Long colspan)throws Exception;
	public List<Pantalla> queryByRowspan(Long rowspan)throws Exception;
	public List<Pantalla> queryByFila(Long fila)throws Exception;
	public List<Pantalla> queryByColumna(Long columna)throws Exception;
	public List<Pantalla> queryByTipoVentana(String tipoVentana)throws Exception;
	public List<Pantalla> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<Pantalla> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}