package com.prueba.producto.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.producto.bean.Producto;
import com.prueba.producto.dto.ProductoDTO;
import com.prueba.producto.repositorio.ProductoRepository;
import com.pruebas.producto.response.ProductoResponse;

@RestController
public class ProductoController {

	@Autowired
	ProductoRepository productoRepository;

	@PostMapping(value = "/saveProductos")
	@Transactional(readOnly = true)
	public ResponseEntity saveUserData(@RequestBody Producto producto) {
		ProductoResponse response = new ProductoResponse();
		List<ProductoDTO> listaFinal = new ArrayList<>();

		try {
			Map<String, Object> productos = productoRepository.saveProductos(producto.getNombre());
			List<Producto> listaProductos = productoRepository.getListarProductos();
			// productos.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " +
			// v));
			productos.forEach((k, v) -> {
				if (k.equals("codigo")) {
					response.setCodigo(v);
				} else {
					response.setMensaje(v);
				}
			});
			for (Producto product : listaProductos) {
				SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
				String fechaFormateada = formato.format(product.getFechaRegistro());
				ProductoDTO productosFinal = new ProductoDTO();
				productosFinal.setIdProducto(product.getIdProducto());
				productosFinal.setNombre(product.getNombre());
				productosFinal.setFechaRegistro(fechaFormateada);
				listaFinal.add(productosFinal);
			}
			response.setLista(listaFinal);
			return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatusCode.valueOf(500));
			//e.printStackTrace();
		}
	}
}
