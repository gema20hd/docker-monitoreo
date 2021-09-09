package com.tcs.msventa.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {

	public Producto() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;
	private String nombre_producto;
	private double precio;
	private int unidad;
	// private int Supermercado_idSupermercado;

	@ManyToOne
	private Supermercado Supermercado;

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getUnidad() {
		return unidad;
	}

	public void setUnidad(int unidad) {
		this.unidad = unidad;
	}

	public Supermercado getSupermercado() {
		return Supermercado;
	}

	public void setSupermercado(Supermercado supermercado) {
		Supermercado = supermercado;
	}

}
