package com.openwebinars.spring.modelos;

import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import com.openwebinars.spring.modelos.Usuario;

@Entity
public class Pedidos {
	@Id @GeneratedValue
	private long id_pedido;
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToOne
	private Usuario nombre_usuario;
	@ManyToOne
	private Usuario apellido_usuario;
	@ManyToOne
	private Usuario dni_usuario;
	@ManyToOne
	private Usuario direccion_usuario;
	
	
	private float precioTotal;
	
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	public Pedidos() { }

	public Pedidos(Usuario usuario, Usuario nombre_usuario, Usuario apellido_usuario, Usuario dni_usuario,
			Usuario direccion_usuario, float precioTotal) {
		this.usuario = usuario;
		this.nombre_usuario = nombre_usuario;
		this.apellido_usuario = apellido_usuario;
		this.dni_usuario = dni_usuario;
		this.direccion_usuario = direccion_usuario;
		this.precioTotal = precioTotal;
	}

	public long getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(Usuario nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public Usuario getApellido_usuario() {
		return apellido_usuario;
	}

	public void setApellido_usuario(Usuario apellido_usuario) {
		this.apellido_usuario = apellido_usuario;
	}

	public Usuario getDni_usuario() {
		return dni_usuario;
	}

	public void setDni_usuario(Usuario dni_usuario) {
		this.dni_usuario = dni_usuario;
	}

	public Usuario getDireccion_usuario() {
		return direccion_usuario;
	}

	public void setDireccion_usuario(Usuario direccion_usuario) {
		this.direccion_usuario = direccion_usuario;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido_usuario, direccion_usuario, dni_usuario, fecha, id_pedido, nombre_usuario,
				precioTotal, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedidos other = (Pedidos) obj;
		return Objects.equals(apellido_usuario, other.apellido_usuario)
				&& Objects.equals(direccion_usuario, other.direccion_usuario)
				&& Objects.equals(dni_usuario, other.dni_usuario) && Objects.equals(fecha, other.fecha)
				&& id_pedido == other.id_pedido && Objects.equals(nombre_usuario, other.nombre_usuario)
				&& Float.floatToIntBits(precioTotal) == Float.floatToIntBits(other.precioTotal)
				&& Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Pedidos [id_pedido=" + id_pedido + ", usuario=" + usuario + ", nombre_usuario=" + nombre_usuario
				+ ", apellido_usuario=" + apellido_usuario + ", dni_usuario=" + dni_usuario + ", direccion_usuario="
				+ direccion_usuario + ", precioTotal=" + precioTotal + ", fecha=" + fecha + "]";
	}
	
	
	
}
