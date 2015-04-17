package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.VodConsumido;
public interface VodConsumidoDAO{
	VodConsumido load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final VodConsumido data) throws Exception;

	public long insert(final VodConsumido data) throws Exception;


	public List<VodConsumido> queryAll()throws Exception;



	public List<VodConsumido> queryByIdVodConsumido(Long idVodConsumido)throws Exception;
	public List<VodConsumido> queryByIdVod(Long idVod)throws Exception;
	public List<VodConsumido> queryByIdUsuario(Long idUsuario)throws Exception;
	public List<VodConsumido> queryByTiempo(String tiempo)throws Exception;
	public List<VodConsumido> queryByIp(String ip)throws Exception;
	public List<VodConsumido> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<VodConsumido> queryByFechaModificacion(String fechaModificacion)throws Exception;

	}