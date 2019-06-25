package org.escolacidadeviva.leilao.lance;

import java.io.Serializable;

import javax.persistence.*;

import org.escolacidadeviva.leilao.usuario.Usuario;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
public class Lance implements Serializable{
	
	private static final long serialVersionUID = 8060522382312048306L;
	
	@Id
	@GeneratedValue
	private Integer Lance;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(nullable = false,
				foreignKey = @ForeignKey(name = "fk_lancamentos"))
	private Usuario usuario;
	
	private String turma;
	private Integer id_img;
	private float valorLance;
	
	public Integer getLance() {
		return Lance;
	}
	public void setLance(Integer lance) {
		Lance = lance;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Integer getId_img() {
		return id_img;
	}
	public void setId_img(Integer id_img) {
		this.id_img = id_img;
	}

	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public float getValorLance() {
		return valorLance;
	}
	public void setValorLance(float valorLance) {
		this.valorLance = valorLance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Lance == null) ? 0 : Lance.hashCode());
		result = prime * result + ((id_img == null) ? 0 : id_img.hashCode());
		result = prime * result + ((turma == null) ? 0 : turma.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime * result + Float.floatToIntBits(valorLance);
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
		Lance other = (Lance) obj;
		if (Lance == null) {
			if (other.Lance != null)
				return false;
		} else if (!Lance.equals(other.Lance))
			return false;
		if (id_img == null) {
			if (other.id_img != null)
				return false;
		} else if (!id_img.equals(other.id_img))
			return false;
		if (turma == null) {
			if (other.turma != null)
				return false;
		} else if (!turma.equals(other.turma))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (Float.floatToIntBits(valorLance) != Float.floatToIntBits(other.valorLance))
			return false;
		return true;
	}
	

}
