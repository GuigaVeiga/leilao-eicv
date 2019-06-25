package org.escolacidadeviva.leilao.votacao;

import java.util.List;


public interface VotacaoDAO {
	
	public void salvar(Votacao votacao);
	public void excluir(Votacao votacao);
	public Votacao carregar(Integer votacao);
	public List<Votacao> listarTodos();
	public Integer listarPontuacao(Votacao votavao);
}
