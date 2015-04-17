package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.LibroConsumido;
public interface LibroConsumidoDAO{
	LibroConsumido load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final LibroConsumido data) throws Exception;

	public long insert(final LibroConsumido data) throws Exception;


	public List<LibroConsumido> queryAll()throws Exception;



	public List<LibroConsumido> queryByIdLibroConsumido(Long idLibroConsumido)throws Exception;
	public List<LibroConsumido> queryByIdLibro(Long idLibro)throws Exception;
	public List<LibroConsumido> queryByIdUsuario(Long idUsuario)throws Exception;
	public List<LibroConsumido> queryByTiempo(String tiempo)throws Exception;
	public List<LibroConsumido> queryByIp(String ip)throws Exception;
	public List<LibroConsumido> queryByPaginaInicio(Long paginaInicio)throws Exception;
	public List<LibroConsumido> queryByPaginaFin(Long paginaFin)throws Exception;
	public List<LibroConsumido> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<LibroConsumido> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}