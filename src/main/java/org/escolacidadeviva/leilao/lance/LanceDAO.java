package org.escolacidadeviva.leilao.lance;

import java.util.List;

import org.escolacidadeviva.leilao.usuario.Usuario;

public interface LanceDAO {
	
	public void salvar(Lance lance);
	public void excluir(Lance lance);
	public Lance carregar(Integer lance);
	public List<Lance> listar(Usuario usuario);
	public List<Lance> listarTodos();
	public List<Lance> listarLancesPorTurmas(String turma);
	
	
}
