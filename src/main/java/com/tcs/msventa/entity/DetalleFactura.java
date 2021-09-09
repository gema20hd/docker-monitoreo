package com.tcs.msventa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "detalle_factura")
public class DetalleFactura implements Serializable {

	@EmbeddedId
	private FacturaDetallePrimary id;

	@ManyToOne(cascade=CascadeType.ALL)
	@MapsId("Producto_idProducto")
	@JoinColumn(name = "Producto_idProducto")
	Producto producto;

	@ManyToOne(cascade=CascadeType.ALL)
	@MapsId("Factura_idFactura")
	@JoinColumn(name = "Factura_idFactura")
	Factura factura;

	private double valor;
	private int cantidad;


	public FacturaDetallePrimary getId() {
		return id;
	}

	public void setId(FacturaDetallePrimary id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
