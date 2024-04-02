package com.prueba.producto.repositorio;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prueba.producto.bean.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

	@Procedure(name = "pkg_producto.spinsertaproductos")
	Map<String, Object> saveProductos(@Param("nombre") String nombre);

	@Procedure(name = "pkg_producto.splistarProductos")
	List<Producto> getListarProductos();
}
