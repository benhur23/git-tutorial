package com.spring.movie.mapper;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.spring.movie.domain.Pelicula;

@ContextConfiguration(locations={"classpath:com/spring/movie/system-test-config.xml"})
public class PeliculaMapperTest extends
		AbstractTransactionalJUnit4SpringContextTests {
	
	@Autowired
	private PeliculaMapper peliculaMapper;
	
	@Test
	public void obtenerTodasLasPeliculas(){
		
		List<Pelicula> peliculas = peliculaMapper.obtenerTodasLasPeliculas();
		System.out.println(peliculas);
	}
	
	@Test
	public void obtenerPeliculaPorId(){
		
		Pelicula pelicula = peliculaMapper.obtenerPeliculaPorId(1);
		System.out.println(pelicula);
	}	

}
