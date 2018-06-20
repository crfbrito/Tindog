package com.carlos.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Carlos
 */
@Entity
@Table(name = "user")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "uid")
	private Integer uid;
	@Column(name = "image")
	private String imagen;
	@Column(name = "firstName")
	private String nombre;
	@Column(name = "secondName")
	private String apellido;
	@Column(name = "email")
	private String correo;
	@Column(name = "password")
	private String contrasena;
	@Column(name = "age")
	private int edad;
	@Column(name = "interests")
	private String intereses;
	@Column(name = "gender")
	private String sexo;
	@Column(name = "aboutMe")
	private String sobreMi;

	public Usuario() {

	}

	public Usuario(Integer uid,String imagen, String nombre, String apellido, String correo, String contrasena,
			int edad, String intereses, String sexo, String sobreMi) {
		
		this.uid = uid;
		this.imagen = imagen;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrasena = contrasena;
		this.edad = edad;
		this.intereses = intereses;
		this.sexo = sexo;
		this.sobreMi = sobreMi;
	}
	
	public Usuario(String imagen, String nombre, String apellido, String correo, String contrasena,
			int edad, String intereses, String sexo, String sobreMi) {
		
		this.imagen = imagen;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrasena = contrasena;
		this.edad = edad;
		this.intereses = intereses;
		this.sexo = sexo;
		this.sobreMi = sobreMi;
	}
	
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getIntereses() {
		return intereses;
	}

	public void setIntereses(String intereses) {
		this.intereses = intereses;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSobreMi() {
		return sobreMi;
	}

	public void setSobreMi(String sobreMi) {
		this.sobreMi = sobreMi;
	}

}