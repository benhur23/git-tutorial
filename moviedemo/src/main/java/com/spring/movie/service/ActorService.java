package com.spring.movie.service;

import java.util.List;

import com.spring.movie.domain.Actor;
import com.spring.movie.domain.BNActor;

public interface ActorService {

	public List<Actor> obtenerTodosLosActores();
	public List<BNActor> obtenerTodosLosBNActores();
}
