package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.PaginaContenido;
public interface PaginaContenidoDAO{
	PaginaContenido load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final PaginaContenido data) throws Exception;

	public long insert(final PaginaContenido data) throws Exception;


	public List<PaginaContenido> queryAll()throws Exception;



	public List<PaginaContenido> queryByIdContenido(Long idContenido)throws Exception;
	public List<PaginaContenido> queryByIdPag(Long idPag)throws Exception;
	public List<PaginaContenido> queryByIdLibro(Long idLibro)throws Exception;
	public List<PaginaContenido> queryByX(Long x)throws Exception;
	public List<PaginaContenido> queryByY(Long y)throws Exception;
	public List<PaginaContenido> queryByUrl(String url)throws Exception;
	public List<PaginaContenido> queryByTipoContenido(String tipoContenido)throws Exception;
	public List<PaginaContenido> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<PaginaContenido> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}