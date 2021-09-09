package com.tcs.msventa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tcs.msventa.entity.DetalleFactura;
import com.tcs.msventa.entity.Supermercado;

public interface DetalleRepository extends JpaRepository<DetalleFactura, Integer> {

	//@Query(value = "select cantidad, valor from DetalleFactura where Producto_idProducto  in (select idProducto from Producto where Supermercado_idSupermercado = 1)",nativeQuery = true)
	 @Query(value = "select df.nombre, df.precio from Producto df",nativeQuery = true)
	//@Query("SELECT idSupermercado,nombre_supermercado  FROM Supermercado ")
	List<DetalleFactura> productoVendidosSupermax();

}
