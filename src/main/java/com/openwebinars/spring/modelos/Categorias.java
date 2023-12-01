package com.openwebinars.spring.modelos;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Categorias {
	@Id @GeneratedValue
	private long id_categoria;
	private String categoria;
	
	
	public Categorias(String categoria) {
		this.categoria = categoria;
	}


	public long getId_categoria() {
		return id_categoria;
	}


	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	@Override
	public int hashCode() {
		return Objects.hash(categoria, id_categoria);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categorias other = (Categorias) obj;
		return Objects.equals(categoria, other.categoria) && id_categoria == other.id_categoria;
	}


	@Override
	public String toString() {
		return "categorias [id_categoria=" + id_categoria + ", categoria=" + categoria + "]";
	}

	


}
 