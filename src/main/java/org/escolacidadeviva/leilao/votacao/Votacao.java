package org.escolacidadeviva.leilao.votacao;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Votacao implements Serializable {
	
	private static final long serialVersionUID = 7339215176978719860L;
	@Id
	@GeneratedValue
	private Integer id_votacao;
	private Integer imagem;
	private Integer pontuacao;
	
	public Integer getId_votacao() {
		return id_votacao;
	}

	public void setId_votacao(Integer id_votacao) {
		this.id_votacao = id_votacao;
	}

	public Integer getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Integer pontucao) {
		this.pontuacao = pontucao;
	}

	public Integer getImagem() {
		return imagem;
	}

	public void setImagem(Integer imagem) {
		this.imagem = imagem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_votacao == null) ? 0 : id_votacao.hashCode());
		result = prime * result + ((imagem == null) ? 0 : imagem.hashCode());
		result = prime * result + ((pontuacao == null) ? 0 : pontuacao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Votacao other = (Votacao) obj;
		if (id_votacao == null) {
			if (other.id_votacao != null)
				return false;
		} else if (!id_votacao.equals(other.id_votacao))
			return false;
		if (imagem == null) {
			if (other.imagem != null)
				return false;
		} else if (!imagem.equals(other.imagem))
			return false;
		if (pontuacao == null) {
			if (other.pontuacao != null)
				return false;
		} else if (!pontuacao.equals(other.pontuacao))
			return false;
		return true;
	}
	

}
