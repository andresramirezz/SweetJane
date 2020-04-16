/**
 * @author Andres Ramirez
 * File: PastelCatalogo.java
 * Date 02/29/2020
 * 
 */


package com.uvm.sweetjane.model;

import javax.persistence.*;
import org.springframework.web.multipart.MultipartFile;


@Entity
public class PastelCatalogo {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private Long id;
	private String nombre;
	private String sabor;
	private String porciones;
	private String fechaPublicacion;
	private String almacenamiento;
	private String categoria;
	private int tiempoPrepar;
	private String almacen;
	private double precioLista;
	private double precioPublico;
	private boolean active=true;
	
	@Column( columnDefinition="text" )
	private String descripcion;
	private int cantidadDisponible;
	
	@Transient
	private MultipartFile imagenPastel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getPorciones() {
		return porciones;
	}

	public void setPorciones(String porciones) {
		this.porciones = porciones;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getTiempoPrepar() {
		return tiempoPrepar;
	}

	public void setTiempoPrepar(int tiempoPrepar) {
		this.tiempoPrepar = tiempoPrepar;
	}

	public String getAlmacen() {
		return almacen;
	}

	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}

	public double getPrecioLista() {
		return precioLista;
	}

	public void setPrecioLista(double precioLista) {
		this.precioLista = precioLista;
	}

	public double getPrecioPublico() {
		return precioPublico;
	}

	public void setPrecioPublico(double precioPublico) {
		this.precioPublico = precioPublico;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	public MultipartFile getImagenPastel() {
		return imagenPastel;
	}

	public void setImagenPastel(MultipartFile imagenPastel) {
		this.imagenPastel = imagenPastel;
	}
}
