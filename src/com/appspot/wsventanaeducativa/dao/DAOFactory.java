package com.appspot.wsventanaeducativa.dao;

import com.appspot.wsventanaeducativa.dao.mysql.*;

import com.appspot.wsventanaeducativa.dao.sql.DAOProxy;

public class DAOFactory{
	public static AdministradorDAO getAdministradorDAO(){
		AdministradorDAOImpl dao =  new AdministradorDAOImpl();
		Class[] interfacesArray = new Class[] { AdministradorDAO.class };
		return (AdministradorDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static CategoriaDAO getCategoriaDAO(){
		return new CategoriaDAOImpl();
//		CategoriaDAOImpl dao =  new CategoriaDAOImpl();
//		Class[] interfacesArray = new Class[] { CategoriaDAO.class };
//		return (CategoriaDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static CategoriasVodDAO getCategoriasVodDAO(){
		CategoriasVodDAOImpl dao =  new CategoriasVodDAOImpl();
		Class[] interfacesArray = new Class[] { CategoriasVodDAO.class };
		return (CategoriasVodDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static EscuelaDAO getEscuelaDAO(){
		EscuelaDAOImpl dao =  new EscuelaDAOImpl();
		Class[] interfacesArray = new Class[] { EscuelaDAO.class };
		return (EscuelaDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static InstitucionDAO getInstitucionDAO(){
		InstitucionDAOImpl dao =  new InstitucionDAOImpl();
		Class[] interfacesArray = new Class[] { InstitucionDAO.class };
		return (InstitucionDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static LibroDAO getLibroDAO(){
		LibroDAOImpl dao =  new LibroDAOImpl();
		Class[] interfacesArray = new Class[] { LibroDAO.class };
		return (LibroDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static LibroConsumidoDAO getLibroConsumidoDAO(){
		LibroConsumidoDAOImpl dao =  new LibroConsumidoDAOImpl();
		Class[] interfacesArray = new Class[] { LibroConsumidoDAO.class };
		return (LibroConsumidoDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static LogErroreDAO getLogErroreDAO(){
		LogErroreDAOImpl dao =  new LogErroreDAOImpl();
		Class[] interfacesArray = new Class[] { LogErroreDAO.class };
		return (LogErroreDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static LogEventosAdministradorDAO getLogEventosAdministradorDAO(){
		LogEventosAdministradorDAOImpl dao =  new LogEventosAdministradorDAOImpl();
		Class[] interfacesArray = new Class[] { LogEventosAdministradorDAO.class };
		return (LogEventosAdministradorDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static LogEventosUsuarioDAO getLogEventosUsuarioDAO(){
		LogEventosUsuarioDAOImpl dao =  new LogEventosUsuarioDAOImpl();
		Class[] interfacesArray = new Class[] { LogEventosUsuarioDAO.class };
		return (LogEventosUsuarioDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static OpinionLibroDAO getOpinionLibroDAO(){
		OpinionLibroDAOImpl dao =  new OpinionLibroDAOImpl();
		Class[] interfacesArray = new Class[] { OpinionLibroDAO.class };
		return (OpinionLibroDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static OpinionSerieDAO getOpinionSerieDAO(){
		OpinionSerieDAOImpl dao =  new OpinionSerieDAOImpl();
		Class[] interfacesArray = new Class[] { OpinionSerieDAO.class };
		return (OpinionSerieDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static OpinionVodDAO getOpinionVodDAO(){
		OpinionVodDAOImpl dao =  new OpinionVodDAOImpl();
		Class[] interfacesArray = new Class[] { OpinionVodDAO.class };
		return (OpinionVodDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static PaginaDAO getPaginaDAO(){
		PaginaDAOImpl dao =  new PaginaDAOImpl();
		Class[] interfacesArray = new Class[] { PaginaDAO.class };
		return (PaginaDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static PaginaContenidoDAO getPaginaContenidoDAO(){
		PaginaContenidoDAOImpl dao =  new PaginaContenidoDAOImpl();
		Class[] interfacesArray = new Class[] { PaginaContenidoDAO.class };
		return (PaginaContenidoDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static PantallaDAO getPantallaDAO(){
		PantallaDAOImpl dao =  new PantallaDAOImpl();
		Class[] interfacesArray = new Class[] { PantallaDAO.class };
		return (PantallaDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static SerieDAO getSerieDAO(){
		SerieDAOImpl dao =  new SerieDAOImpl();
		Class[] interfacesArray = new Class[] { SerieDAO.class };
		return (SerieDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static SerieCategoriaDAO getSerieCategoriaDAO(){
		SerieCategoriaDAOImpl dao =  new SerieCategoriaDAOImpl();
		Class[] interfacesArray = new Class[] { SerieCategoriaDAO.class };
		return (SerieCategoriaDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static TipoPantallaDAO getTipoPantallaDAO(){
		TipoPantallaDAOImpl dao =  new TipoPantallaDAOImpl();
		Class[] interfacesArray = new Class[] { TipoPantallaDAO.class };
		return (TipoPantallaDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static UsuarioDAO getUsuarioDAO(){
		UsuarioDAOImpl dao =  new UsuarioDAOImpl();
		Class[] interfacesArray = new Class[] { UsuarioDAO.class };
		return (UsuarioDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static UsuarioEscuelaDAO getUsuarioEscuelaDAO(){
		UsuarioEscuelaDAOImpl dao =  new UsuarioEscuelaDAOImpl();
		Class[] interfacesArray = new Class[] { UsuarioEscuelaDAO.class };
		return (UsuarioEscuelaDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static VodDAO getVodDAO(){
		VodDAOImpl dao =  new VodDAOImpl();
		Class[] interfacesArray = new Class[] { VodDAO.class };
		return (VodDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
	public static VodConsumidoDAO getVodConsumidoDAO(){
		VodConsumidoDAOImpl dao =  new VodConsumidoDAOImpl();
		Class[] interfacesArray = new Class[] { VodConsumidoDAO.class };
		return (VodConsumidoDAO) java.lang.reflect.Proxy.newProxyInstance(dao.getClass().getClassLoader(), interfacesArray, new DAOProxy(dao));
	}
}