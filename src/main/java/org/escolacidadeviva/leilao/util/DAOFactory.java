package org.escolacidadeviva.leilao.util;

import org.escolacidadeviva.leilao.usuario.UsuarioDAO;
import org.escolacidadeviva.leilao.usuario.UsuarioDAOHibernate;

public class DAOFactory {

	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO; 
	}
		

}
