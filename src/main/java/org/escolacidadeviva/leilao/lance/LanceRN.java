package org.escolacidadeviva.leilao.lance;

import java.util.List;

import org.escolacidadeviva.leilao.usuario.Usuario;
import org.escolacidadeviva.leilao.util.DAOFactory;

public class LanceRN {
	private LanceDAO lanceDAO;


	public LanceRN() {
		this.lanceDAO = DAOFactory.criarLanceDAO();
		}
	
	public List<Lance> listar(Usuario usuario){
		return this.lanceDAO.listar(usuario);
	}
	
	public List<Lance> listarTodos(){
		return this.lanceDAO.listarTodos();
	}
	
	public List<Lance> listarLancesPorTurmas(String turma) {
		return this.lanceDAO.listarLancesPorTurmas(turma);	
		}

	public Lance carregar(Integer lance) {
		return this.carregar(lance);
	}
	
	public void salvar(Lance lance) {
		this.lanceDAO.salvar(lance);
	}
	
	public void excluir(Lance lance) {
		this.lanceDAO.excluir(lance);
	}
}
