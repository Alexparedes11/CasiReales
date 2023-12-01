package com.openwebinars.spring.modelos;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Productos {
	@Id @GeneratedValue
	private long id_producto;
	private String nombre_producto;
	private float precioUnitario;
	private String imagen;
	
	
	
	
	public Productos(String nombre_producto, float precioUnitario, String imagen) {
		this.nombre_producto = nombre_producto;
		this.precioUnitario = precioUnitario;
		this.imagen = imagen;
	}


	public long getId_producto() {
		return id_producto;
	}


	public void setId_producto(long id_producto) {
		this.id_producto = id_producto;
	}


	public String getNombre_producto() {
		return nombre_producto;
	}


	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}


	public float getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	

	@Override
	public int hashCode() {
		return Objects.hash(id_producto, imagen, nombre_producto, precioUnitario);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Productos other = (Productos) obj;
		return id_producto == other.id_producto && Objects.equals(imagen, other.imagen)
				&& Objects.equals(nombre_producto, other.nombre_producto)
				&& Float.floatToIntBits(precioUnitario) == Float.floatToIntBits(other.precioUnitario);
	}


	@Override
	public String toString() {
		return "Productos [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", precioUnitario="
				+ precioUnitario + ", imagen=" + imagen + "]";
	}
	
	
	
}
