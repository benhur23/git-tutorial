package com.spring.movie.dao;

import java.util.List;

import com.spring.movie.domain.BNActor;

public interface ActorDao {

	public List<BNActor> obtenerTodosLosActores();
}
