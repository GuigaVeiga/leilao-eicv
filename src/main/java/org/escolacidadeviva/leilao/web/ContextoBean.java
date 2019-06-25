package org.escolacidadeviva.leilao.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.escolacidadeviva.leilao.lance.Lance;
import org.escolacidadeviva.leilao.lance.LanceRN;
import org.escolacidadeviva.leilao.usuario.Usuario;
import org.escolacidadeviva.leilao.usuario.UsuarioRN;

@ManagedBean
@SessionScoped
public class ContextoBean implements Serializable {

	private static final long serialVersionUID = -2671573334874485222L;
	private Usuario usuarioLogado = null;
	private Lance lanceAtiva = null;

	public Usuario getUsuarioLogado() {
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext external = context.getExternalContext();
		String login = external.getRemoteUser();

		if (this.usuarioLogado == null || !login.equals(this.usuarioLogado.getLogin())) {

			if (login != null) {
				UsuarioRN usuarioRN = new UsuarioRN();
				this.usuarioLogado = usuarioRN.buscarPorLogin(login);
				this.lanceAtiva = null;
			}
		}

		return usuarioLogado;
	}

	public Lance getLanceAtiva() {
		
		if (this.lanceAtiva == null) {
			Usuario usuario = this.getUsuarioLogado();
			LanceRN lanceRN = new LanceRN();

			if (this.lanceAtiva == null) {
				List<Lance> lances = lanceRN.listar(usuario);
				if (lances != null) {
					for (Lance lance : lances) {
						this.lanceAtiva = lance;
						break;
					}
				}
			}
		}
		return this.lanceAtiva;
	}

	public void setLanceAtiva(ValueChangeEvent event) {

		Integer lance = (Integer) event.getNewValue();

		LanceRN lanceRN = new LanceRN();
		this.lanceAtiva = lanceRN.carregar(lance);
	}
}
