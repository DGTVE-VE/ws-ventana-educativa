package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.Pagina;
public interface PaginaDAO{
	Pagina load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final Pagina data) throws Exception;

	public long insert(final Pagina data) throws Exception;


	public List<Pagina> queryAll()throws Exception;



	public List<Pagina> queryByIdPag(Long idPag)throws Exception;
	public List<Pagina> queryByIdLibro(Long idLibro)throws Exception;
	public List<Pagina> queryByUrl(String url)throws Exception;
	public List<Pagina> queryByNumeroInterno(String numeroInterno)throws Exception;
	public List<Pagina> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<Pagina> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}