package com.pruebas.producto.response;

import java.io.Serializable;
import java.util.List;

import com.prueba.producto.bean.Producto;
import com.prueba.producto.dto.ProductoDTO;

public class ProductoResponse implements Serializable{

	
	private Object codigo;
	private Object mensaje;
	private List<ProductoDTO> lista;
	
	public Object getCodigo() {
		return codigo;
	}
	public void setCodigo(Object codigo) {
		this.codigo = codigo;
	}
	public Object getMensaje() {
		return mensaje;
	}
	public void setMensaje(Object mensaje) {
		this.mensaje = mensaje;
	}
	public List<ProductoDTO> getLista() {
		return lista;
	}
	public void setLista(List<ProductoDTO> lista) {
		this.lista = lista;
	}
	
	
}
