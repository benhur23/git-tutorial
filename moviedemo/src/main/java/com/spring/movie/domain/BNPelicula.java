package com.spring.movie.domain;

import java.io.Serializable;
import java.util.Date;

public class BNPelicula implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7188355181162444862L;
	private Integer idPelicula;
	private String titulo;
	private Integer tiempoMinutos;
	private Date fechaLanzamiento;
	private Integer idDirector;
	private String nombreDirector;
	private Integer idGenero;
	private String nombreGenero;
	
	public Integer getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getTiempoMinutos() {
		return tiempoMinutos;
	}
	public void setTiempoMinutos(Integer tiempoMinutos) {
		this.tiempoMinutos = tiempoMinutos;
	}
	public Date getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	public Integer getIdDirector() {
		return idDirector;
	}
	public void setIdDirector(Integer idDirector) {
		this.idDirector = idDirector;
	}
	public String getNombreDirector() {
		return nombreDirector;
	}
	public void setNombreDirector(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}
	public Integer getIdGenero() {
		return idGenero;
	}
	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}
	public String getNombreGenero() {
		return nombreGenero;
	}
	public void setNombreGenero(String nombreGenero) {
		this.nombreGenero = nombreGenero;
	}
	
	@Override
	public String toString() {
		return "BNPelicula [idPelicula=" + idPelicula + ", titulo=" + titulo
				+ ", tiempoMinutos=" + tiempoMinutos + ", fechaLanzamiento="
				+ fechaLanzamiento + ", idDirector=" + idDirector
				+ ", nombreDirector=" + nombreDirector + ", idGenero="
				+ idGenero + ", nombreGenero=" + nombreGenero + "]";
	}
	
}