package com.spring.movie.dao;

import java.util.List;

import com.spring.movie.domain.BNPelicula;
import com.spring.movie.domain.Pelicula;

public interface PeliculaDao {

	public List<Pelicula> obtenerTodasLasPeliculas(int firstResult, int maxResults, 
			String columnName, String sortType);
	
	public List<BNPelicula> obtenerTodasLasBNPeliculas(int firstResult, int maxResults, 
			String columnName, String sortType);	
	
	public Integer contarTodosLasPelículas();
}
