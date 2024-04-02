package com.prueba.producto.bean;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;

@Entity
@NamedStoredProcedureQuery(name = "pkg_producto.spinsertaproductos", procedureName = "pkg_producto.spinsertaproductos", parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "nombre", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "codigo", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "mensaje", type = String.class) })
@NamedStoredProcedureQuery(name = "pkg_producto.splistarProductos", procedureName = "pkg_producto.splistarProductos", resultClasses = Producto.class, parameters = {
		@StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, name = "ccursor", type = List.class) })
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private Long idProducto;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "fecha_registro")
	private Date fechaRegistro;

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

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

}
