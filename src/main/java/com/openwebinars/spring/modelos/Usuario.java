package com.openwebinars.spring.modelos;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Usuario {
	
	@Id @GeneratedValue
	private long id;
	private String nombre;
	

	private String apellido;
	
	@Email
	private String email;
	private String rol;
	
	private String dni;
	private String direccion;
	private String telefono;
	private String contraseña;
	
	public Usuario() { }
	
	public Usuario(String nombre, String apellido, @Email String email, String rol, String dni, String direccion,
			String telefono, String contraseña) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.rol = rol;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.contraseña = contraseña;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellido, contraseña, direccion, dni, email, id, nombre, rol, telefono);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(contraseña, other.contraseña)
				&& Objects.equals(direccion, other.direccion) && Objects.equals(dni, other.dni)
				&& Objects.equals(email, other.email) && id == other.id && Objects.equals(nombre, other.nombre)
				&& Objects.equals(rol, other.rol) && Objects.equals(telefono, other.telefono);
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", rol="
				+ rol + ", dni=" + dni + ", direccion=" + direccion + ", telefono=" + telefono + ", contraseña="
				+ contraseña + "]";
	}
	
	
	
	
}
