/**
 * @author Andres Ramirez
 * File: BikeCatalog.java
 * Date 02/29/2020
 * 
 */


package com.uvm.sweetjane.model;

import javax.persistence.*;
import org.springframework.web.multipart.MultipartFile;


@Entity
public class BikeCatalog {
	
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

	public void setNombre(String title) {
		this.nombre = title;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String author) {
		this.sabor = author;
	}

	public String getPorciones() {
		return porciones;
	}

	public void setPorciones(String publisher) {
		this.porciones = publisher;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(String publicationDate) {
		this.fechaPublicacion = publicationDate;
	}

	public String getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(String language) {
		this.almacenamiento = language;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String category) {
		this.categoria = category;
	}

	public int getTiempoPrepar() {
		return tiempoPrepar;
	}

	public void setTiempoPrepar(int numberOfPages) {
		this.tiempoPrepar = numberOfPages;
	}

	public String getAlmacen() {
		return almacen;
	}

	public void setAlmacen(String format) {
		this.almacen = format;
	}

	public double getPrecioLista() {
		return precioLista;
	}

	public void setPrecioLista(double listPrice) {
		this.precioLista = listPrice;
	}

	public double getPrecioPublico() {
		return precioPublico;
	}

	public void setPrecioPublico(double ourPrice) {
		this.precioPublico = ourPrice;
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

	public void setDescripcion(String description) {
		this.descripcion = description;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int inStockNumber) {
		this.cantidadDisponible = inStockNumber;
	}

	public MultipartFile getImagenPastel() {
		return imagenPastel;
	}

	public void setImagenPastel(MultipartFile bikeImage) {
		this.imagenPastel = bikeImage;
	}
}
