package com.appspot.wsventanaeducativa.dao;

import java.util.List;
import java.util.Date;
import com.appspot.wsventanaeducativa.dao.dto.Libro;
public interface LibroDAO{
	Libro load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final Libro data) throws Exception;

	public long insert(final Libro data) throws Exception;


	public List<Libro> queryAll()throws Exception;



	public List<Libro> queryByIdLibro(Long idLibro)throws Exception;
	public List<Libro> queryByAutor(String autor)throws Exception;
	public List<Libro> queryByColaboradore(String colaboradore)throws Exception;
	public List<Libro> queryByPropietario(String propietario)throws Exception;
	public List<Libro> queryByTitulo(String titulo)throws Exception;
	public List<Libro> queryBySubtitulo(String subtitulo)throws Exception;
	public List<Libro> queryByEdicion(Long edicion)throws Exception;
	public List<Libro> queryByEditorial(String editorial)throws Exception;
	public List<Libro> queryByLugar(String lugar)throws Exception;
	public List<Libro> queryByFechaPublicacion(Date fechaPublicacion)throws Exception;
	public List<Libro> queryByAnioPublicacion(String anioPublicacion)throws Exception;
	public List<Libro> queryByPagina(Long pagina)throws Exception;
	public List<Libro> queryBySerie(String serie)throws Exception;
	public List<Libro> queryByNumeroSerie(Long numeroSerie)throws Exception;
	public List<Libro> queryByVolumen(Long volumen)throws Exception;
	public List<Libro> queryByDescripcion(String descripcion)throws Exception;
	public List<Libro> queryByIsbn10(String isbn10)throws Exception;
	public List<Libro> queryByIsbn13(String isbn13)throws Exception;
	public List<Libro> queryByEan13(String ean13)throws Exception;
	public List<Libro> queryByIssn(String issn)throws Exception;
	public List<Libro> queryByIdioma(String idioma)throws Exception;
	public List<Libro> queryByTituloTraducido(String tituloTraducido)throws Exception;
	public List<Libro> queryByUrl(String url)throws Exception;
	public List<Libro> queryByCalificacion(Long calificacion)throws Exception;
	public List<Libro> queryByTema(String tema)throws Exception;
	public List<Libro> queryByTag(String tag)throws Exception;
	public List<Libro> queryByThumbnail(String thumbnail)throws Exception;
	public List<Libro> queryByIdInstitucion(Long idInstitucion)throws Exception;
	public List<Libro> queryByFechaCreacion(String fechaCreacion)throws Exception;
	public List<Libro> queryByFechaModificacion(String fechaModificacion)throws Exception;
	public List<Libro> queryByVisible(Long visible)throws Exception;

	}