package org.escolacidadeviva.leilao.votacao;

import java.util.List;

import org.hibernate.*;

public class VotacaoDAOHibernate implements VotacaoDAO {

	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Votacao votacao) {
		this.session.saveOrUpdate(votacao);
	}

	@Override
	public void excluir(Votacao votacao) {
		this.session.delete(votacao);
	}

	@Override
	public Votacao carregar(Integer votacao) {
		return (Votacao) this.session.get(Votacao.class, votacao);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Votacao> listarTodos() {
		return this.session.createCriteria(Votacao.class).list();
	}

	@Override
	public Integer listarPontuacao(Votacao votacao) {
		StringBuffer sql = new StringBuffer();
		sql.append("select sum(pontuacao)");
		sql.append("from votacao)");
		sql.append("where imagem = :imagem");
		SQLQuery query = this.session.createSQLQuery(sql.toString());
		query.setParameter("imagem", votacao.getImagem());
		
		Integer pontos = (Integer) query.uniqueResult();
		
		return pontos;
		
	}

}
