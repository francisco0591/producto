package com.prueba.producto.dto;

import java.io.Serializable;

public class ProductoDTO implements Serializable{
private Long idProducto;
	
	private String nombre;
	
	private String fechaRegistro;

	public ProductoDTO() {
	}

	public ProductoDTO(Long idProducto, String nombre, String fechaRegistro) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.fechaRegistro = fechaRegistro;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
}
