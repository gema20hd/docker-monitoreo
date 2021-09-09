package com.tcs.msventa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "supermercado")
public class Supermercado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSupermercado;
	private String nombre_supermercado;
	private String cuenta_bancaria;
	



	public int getIdSupermercado() {
		return idSupermercado;
	}

	public void setIdSupermercado(int idSupermercado) {
		this.idSupermercado = idSupermercado;
	}

	public String getNombre_supermercado() {
		return nombre_supermercado;
	}

	public void setNombre_supermercado(String nombre_supermercado) {
		this.nombre_supermercado = nombre_supermercado;
	}

	public String getCuenta_bancaria() {
		return cuenta_bancaria;
	}

	public void setCuenta_bancaria(String cuenta_bancaria) {
		this.cuenta_bancaria = cuenta_bancaria;
	}

	@Override
	public String toString() {
		return "Supermercado [idSupermercado=" + idSupermercado + ", nombre_supermercado=" + nombre_supermercado
				+ ", cuenta_bancaria=" + cuenta_bancaria + "]";
	}

}
