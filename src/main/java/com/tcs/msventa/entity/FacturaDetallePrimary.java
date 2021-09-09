package com.tcs.msventa.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FacturaDetallePrimary implements Serializable {

	public FacturaDetallePrimary() {

	}

	@Column(name = "Factura_idFactura")
	private int Factura_idFactura;

	@Column(name = "Producto_idProducto")
	private int Producto_idProducto;

	public int getFactura_idFactura() {
		return Factura_idFactura;
	}

	public void setFactura_idFactura(int factura_idFactura) {
		Factura_idFactura = factura_idFactura;
	}

	public int getProducto_idProducto() {
		return Producto_idProducto;
	}

	public void setProducto_idProducto(int producto_idProducto) {
		Producto_idProducto = producto_idProducto;
	}

}
