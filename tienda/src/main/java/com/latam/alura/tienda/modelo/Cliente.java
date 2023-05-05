package com.latam.alura.tienda.modelo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Embedded
	private DatosPersonales datosPersonales;
						
	public Cliente() {}


	public Cliente(String nombre, String cedula) {
		this.datosPersonales = new DatosPersonales(nombre, cedula);
	}


	public Long getId() {
		return id;
	}

	public String getNombre() {
		return datosPersonales.getNombre();
	}


	public void setNombre(String nombre) {
		this.datosPersonales.setNombre(nombre);
	}


	public String getCedula() {
		return datosPersonales.getCedula();
	}


	public void setCedula(String cedula) {
		this.datosPersonales.setCedula(cedula);;
	}
	
		
}
