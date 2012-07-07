package com.spring.movie.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.spring.movie.domain.Pelicula;

public interface PeliculaMapper {

	@Select("SELECT " + 	
				" p.ID_PELICULA AS idPelicula,  " + 
				" p.TITULO AS titulo,  " + 
				" p.TIEMPO_MINUTOS AS tiempoMinutos,  " + 
				" p.FECHA_LANZAMIENTO AS fechaLanzamiento,  " + 
				" d.NOMBRE AS nombreProductor,  " + 
				" pr.NOMBRE AS nombreDirector,  " + 
				" pa.NOMBRE AS nombrePais,  " + 
				" g.NOMBRE AS nombreGenero,  " + 
				" p.COMENTARIOS AS comentarios 	  " + 
			" FROM pelicula p JOIN actor d ON p.ID_DIRECTOR = d.ID_ACTOR  " + 
				" JOIN actor pr ON p.ID_PRODUCTOR = pr.ID_ACTOR  " + 
				" JOIN pais pa ON p.ID_PAIS = pa.ID_PAIS  " + 
				" JOIN genero g ON p.ID_GENERO = g.ID_GENERO ")
	public List<Pelicula> obtenerTodasLasPeliculas();
	
	public Pelicula obtenerPeliculaPorId(Integer idPelicula);
}
