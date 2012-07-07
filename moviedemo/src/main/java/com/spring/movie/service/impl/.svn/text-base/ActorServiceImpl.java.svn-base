package com.spring.movie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.movie.dao.ActorDao;
import com.spring.movie.domain.Actor;
import com.spring.movie.domain.BNActor;
import com.spring.movie.mapper.ActorMapper;
import com.spring.movie.service.ActorService;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorMapper actorMapper;
	
	@Autowired
	private ActorDao actorDao;
	
	public List<Actor> obtenerTodosLosActores() {
		List<Actor> actores = actorMapper.obtenerTodosLosActores();
		System.out.println(actores);
		return actores;
	}
	
	public List<BNActor> obtenerTodosLosBNActores(){
		return actorDao.obtenerTodosLosActores();
	}

}
