package com.spring.movie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.movie.dao.PeliculaDao;
import com.spring.movie.domain.BNPelicula;
import com.spring.movie.domain.Pelicula;
import com.spring.movie.mapper.PeliculaMapper;
import com.spring.movie.service.PeliculaService;

@Service
public class PeliculaServiceImpl implements PeliculaService {
	
	@Autowired
	private PeliculaDao peliculaDao;
	
	@Autowired
	private PeliculaMapper peliculaMapper;

	public List<BNPelicula> obtenerTodasLasPeliculas(int firstResult, int maxResults, 
			String columnName, String sortType) {
		return peliculaDao.obtenerTodasLasBNPeliculas(firstResult, maxResults, 
				columnName, sortType);
	}

	public Pelicula obtenerPeliculaPorId(Integer idPelicula) {
		return peliculaMapper.obtenerPeliculaPorId(idPelicula);
	}

	public Integer contarTodosLasPelículas() {
		return peliculaDao.contarTodosLasPelículas();
	}

}
