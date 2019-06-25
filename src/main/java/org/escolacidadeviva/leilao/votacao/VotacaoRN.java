package org.escolacidadeviva.leilao.votacao;

import java.util.List;

import org.escolacidadeviva.leilao.util.DAOFactory;

public class VotacaoRN {
	private VotacaoDAO votacaoDAO;
	
	public VotacaoRN(){
		this.votacaoDAO = DAOFactory.criarVotacaoDAO();
	}
	
	public Votacao carregar(Integer Votacao) {
		return this.carregar(Votacao);
	}
	
	public void salvar(Votacao votacao) {
		this.votacaoDAO.salvar(votacao);
	}
	
	public void excluir(Votacao votacao) {
		this.votacaoDAO.excluir(votacao);
	}
	
	public List<Votacao> listarTodos(){
		return this.votacaoDAO.listarTodos();
	}
	
	public Integer listarPontuacao(Votacao votacao) {
		return this.votacaoDAO.listarPontuacao(votacao);
	}
	
	
}
