package org.escolacidadeviva.leilao.lance;

import java.util.List;

import org.escolacidadeviva.leilao.usuario.Usuario;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class LanceDAOHibernate implements LanceDAO {
	
	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Lance lance) {
		this.session.saveOrUpdate(lance);
	}

	@Override
	public void excluir(Lance lance) {
		this.session.delete(lance);
	}

	@Override
	public Lance carregar(Integer lance) {
		return (Lance) this.session.get(Lance.class, lance);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Lance> listar(Usuario usuario) {
		Criteria criteria = this.session.createCriteria(Lance.class);
		criteria.add(Restrictions.eq("usuario", usuario));
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Lance> listarTodos() {
		return this.session.createCriteria(Lance.class).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Lance> listarLancesPorTurmas(String turma) {
		Criteria criteria = this.session.createCriteria(Lance.class);
		criteria.add(Restrictions.eq("turma", turma));
		return criteria.list();
	}


	
}
