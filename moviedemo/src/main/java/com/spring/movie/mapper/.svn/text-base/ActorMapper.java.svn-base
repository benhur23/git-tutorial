package com.spring.movie.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.spring.movie.domain.Actor;

public interface ActorMapper {
	
	@Select("SELECT " + 
				"ID_ACTOR as idActor," +  
				"NOMBRE as nombre " + 
			"FROM actor ")
	public List<Actor> obtenerTodosLosActores();

	@Select("SELECT " + 
				"ID_ACTOR as idActor," +  
				"NOMBRE as nombre, " + 
				"FECHA_NACIMIENTO as fechaNacimiento " + 
			"FROM actor WHERE ID_ACTOR = #{idActor}")
	public Actor obtenerActorPorId(Integer idActor);
	
	@Insert(" INSERT INTO actor(NOMBRE, FECHA_NACIMIENTO) VALUES " +
			" (#{nombre}, #{fechaNacimiento}) ")
	@Options(useGeneratedKeys=true, keyProperty="idActor")
	public int guardarActor(Actor actor); 
	
	@Update("UPDATE actor  " + 
				" SET " + 
				" NOMBRE = #{nombre} ,  " + 
				" FECHA_NACIMIENTO = #{fechaNacimiento} " + 
			"WHERE ID_ACTOR = #{idActor} ")
	public int actualizarActor(Actor actor);
		
	@Delete("DELETE FROM actor WHERE ID_ACTOR = #{idActor}")
	public int eliminarActor(Integer idActor);

}
