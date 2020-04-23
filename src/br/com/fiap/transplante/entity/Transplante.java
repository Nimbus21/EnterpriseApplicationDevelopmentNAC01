package br.com.fiap.transplante.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_TRANSPLANTE")
public class Transplante {
	
	@Id
	@Column(name="cd_transplante")
	private int codigo;
	
	@Column(name="dt_cirurgia")
	private Calendar cirurgia;

	public Transplante() {
		super();
	}

	public Transplante(int codigo, Calendar cirurgia) {
		super();
		this.codigo = codigo;
		this.cirurgia = cirurgia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getCirurgia() {
		return cirurgia;
	}

	public void setCirurgia(Calendar cirurgia) {
		this.cirurgia = cirurgia;
	}

}
