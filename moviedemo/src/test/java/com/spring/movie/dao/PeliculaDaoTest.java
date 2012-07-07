package com.spring.movie.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.spring.movie.domain.BNPelicula;

@ContextConfiguration(locations={"classpath:com/spring/movie/system-test-config.xml"})
public class PeliculaDaoTest extends
		AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private PeliculaDao peliculaDao;
	
	@Test
	public void obtenerTodasLasPeliculas(){
		
		List<BNPelicula> peliculas = peliculaDao.obtenerTodasLasBNPeliculas(1, 20, "", "");
		System.out.println(peliculas);
	}
	
}
