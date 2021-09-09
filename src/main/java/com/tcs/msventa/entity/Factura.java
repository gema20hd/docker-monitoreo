package com.tcs.msventa.entity;

import java.io.Serializable;
import java.sql.Date;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;

@Entity
@Table(name = "factura")

public class Factura implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFactura;
	private double total;
	private double subtotal;
	private double iva_cantidad;
	private Date fecha;
	private String metodo_pago;

	private Producto producto;

	@ManyToOne
	private Supermercado Supermercado;
	/*
	 * // Relacion ManyToMany (Un usuario tiene muchos perfiles) // Por defecto
	 * Fetch es FetchType.LAZY
	 * 
	 * @ManyToMany(fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name = "detalle_factura", // tabla intermedia joinColumns
	 * = @JoinColumn(name = "Factura_idFactura"), // foreignKey en la tabla de
	 * detalle inverseJoinColumns = @JoinColumn(name = "Producto_idProducto") //
	 * foreignKey en la tabla de detalle-- ) private List<Producto> productos;
	 */
	@Transient
	private double totalSuperMercado;

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getIva_cantidad() {
		return iva_cantidad;
	}

	public void setIva_cantidad(double iva_cantidad) {
		this.iva_cantidad = iva_cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getMetodo_pago() {
		return metodo_pago;
	}

	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	public double getTotalSuperMercado() {
		return totalSuperMercado;
	}

	public void setTotalSuperMercado(double totalSuperMercado) {
		this.totalSuperMercado = totalSuperMercado;
	}

}
