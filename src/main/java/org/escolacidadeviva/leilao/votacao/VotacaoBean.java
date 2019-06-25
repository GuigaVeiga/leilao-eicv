package org.escolacidadeviva.leilao.votacao;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean
@ApplicationScoped
public class VotacaoBean implements Serializable {
	
	private static final long serialVersionUID = -3724319274337492533L;
	
	private Votacao votacao = new Votacao();
	private List<Votacao> listarTodos = null;
	private Integer listarPontuacao;
	
	public void buscarPontos() {
		VotacaoRN votacaoRN = new VotacaoRN();
		votacaoRN.listarPontuacao(this.votacao);
	}
	
	public String salvar() {
		int valor =+ 1;
		this.votacao.setPontuacao(valor);
		VotacaoRN votacaoRN = new VotacaoRN();
		votacaoRN.salvar(this.votacao);
		this.votacao = new Votacao();
		return null;
		}
	
	
	public List<Votacao> getListarTodos() {
		if (this.listarTodos == null) {
			VotacaoRN votacaoRN = new VotacaoRN();
			this.listarTodos = votacaoRN.listarTodos();
		}
		return this.listarTodos;
	}

	public void setListarTodos(List<Votacao> listaTodos) {
		this.listarTodos = listaTodos;
	}

	public Votacao getVotacao() {
		return votacao;
	}

	public void setVotacao(Votacao votacao) {
		this.votacao = votacao;
	}



	public Integer getListarPontuacao() {
		return listarPontuacao;
	}



	public void setListarPontuacao(Integer listarPontuacao) {
		this.listarPontuacao = listarPontuacao;
	}

	
	
	
	
}
