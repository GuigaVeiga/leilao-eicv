package org.escolacidadeviva.leilao.util;

import org.escolacidadeviva.leilao.lance.*;
import org.escolacidadeviva.leilao.usuario.UsuarioDAO;
import org.escolacidadeviva.leilao.usuario.UsuarioDAOHibernate;
import org.escolacidadeviva.leilao.votacao.VotacaoDAO;
import org.escolacidadeviva.leilao.votacao.VotacaoDAOHibernate;

public class DAOFactory {

	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO; 
	}
		
	public static LanceDAO criarLanceDAO() {
		LanceDAOHibernate lanceDAO = new LanceDAOHibernate();
		lanceDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return lanceDAO; 
	}
	
	public static VotacaoDAO criarVotacaoDAO() {
		VotacaoDAOHibernate votacaoDAO = new VotacaoDAOHibernate();
		votacaoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return votacaoDAO; 
	}
}
