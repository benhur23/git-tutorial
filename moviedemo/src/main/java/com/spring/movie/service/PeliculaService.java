package com.spring.movie.service;

import java.util.List;

import com.spring.movie.domain.BNPelicula;
import com.spring.movie.domain.Pelicula;

public interface PeliculaService {

	public List<BNPelicula> obtenerTodasLasPeliculas(int firstResult, int maxResults, 
						String columnName, String sortType);
	
	public Pelicula obtenerPeliculaPorId(Integer idPelicula);
	
	public Integer contarTodosLasPelículas();
}
