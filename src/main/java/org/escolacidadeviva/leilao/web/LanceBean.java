package org.escolacidadeviva.leilao.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;

import org.escolacidadeviva.leilao.lance.Lance;
import org.escolacidadeviva.leilao.lance.LanceRN;

@ManagedBean
@ViewScoped
public class LanceBean implements Serializable {

	private static final long serialVersionUID = -6645192793109822115L;

	private Lance selecionada = new Lance();
	private List<Lance> lista = null;
	@ManagedProperty(value = "#{contextoBean}")
	private ContextoBean contextoBean;

	private List<Lance> listarTodos = null;
	private List<Lance> listarLancesPorTurmas = null;

	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();

		this.selecionada.setUsuario(this.contextoBean.getUsuarioLogado());
		float valor = this.selecionada.getValorLance();
		if (valor < 20) {
			FacesMessage facesMessage = new FacesMessage("Lance Mínimo de R$20,00");
			context.addMessage(null, facesMessage);

			return null;
		}

		LanceRN lanceRN = new LanceRN();
		lanceRN.salvar(this.selecionada);
		this.selecionada = new Lance();
		this.lista = null;

		return null;
	}

	public String excluir() {
		LanceRN lanceRN = new LanceRN();
		lanceRN.excluir(this.selecionada);
		this.selecionada = new Lance();
		this.lista = null;
		return null;
	}

	public void lancesPorTurmas(String turmas) {
		LanceRN lanceRN = new LanceRN();
		this.listarLancesPorTurmas = lanceRN.listarLancesPorTurmas(turmas);
		System.out.println(listarLancesPorTurmas);
	}

	public Lance getSelecionada() {
		return selecionada;
	}

	public void setSelecionada(Lance selecionada) {
		this.selecionada = selecionada;
	}

	public List<Lance> getListarTodos() {
		if (this.listarTodos == null) {
			LanceRN lanceRN = new LanceRN();
			this.listarTodos = lanceRN.listarTodos();
		}
		return this.listarTodos;
	}

	public void setListarTodos(List<Lance> listaTodos) {
		this.listarTodos = listaTodos;
	}

	public List<Lance> getLista() {
		if (this.lista == null) {
			LanceRN lanceRN = new LanceRN();
			this.lista = lanceRN.listar(this.contextoBean.getUsuarioLogado());
		}
		return this.lista;

	}

	public void setLista(List<Lance> lista) {
		this.lista = lista;
	}

	public ContextoBean getContextoBean() {
		return contextoBean;
	}

	public void setContextoBean(ContextoBean contextoBean) {
		this.contextoBean = contextoBean;
	}

	public List<Lance> getListarLancesPorTurmas() {
		return listarLancesPorTurmas;
	}

}
