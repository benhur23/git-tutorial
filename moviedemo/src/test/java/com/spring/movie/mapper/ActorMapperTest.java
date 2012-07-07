package com.spring.movie.mapper;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.spring.movie.domain.Actor;
import com.spring.movie.util.CalendarUtil;

@ContextConfiguration(locations={"classpath:com/spring/movie/system-test-config.xml"})
public class ActorMapperTest 
			extends AbstractTransactionalJUnit4SpringContextTests{

	@Autowired
	private ActorMapper actorMapper;
	
	@Test
	public void obtenerTodosLosActores(){
		
		List<Actor> actores = actorMapper.obtenerTodosLosActores();
		assertNotNull(actores);
	}
	
	@Test
	public void guardarActor() throws ParseException{
		
		Actor actor = crearNuevoActor();
		int registrosModificados = actorMapper.guardarActor(actor);
		System.out.println("registrosModificados = "+registrosModificados);
		System.out.println("actor = "+actor);
	}
	
	@Test
	public void obtenerActorPorId() throws ParseException{
		
		Actor actor = crearNuevoActor();
		int registrosModificados = actorMapper.guardarActor(actor);
		System.out.println("registrosModificados = "+registrosModificados);
		System.out.println("actor = "+actor);
		
		Actor actorBD = actorMapper.obtenerActorPorId(actor.getIdActor());
		assertNotNull(actorBD);
		assertEquals(actor, actorBD);
	}
	
	@Test
	public void eliminarActor() throws ParseException{

		Actor actor = crearNuevoActor();
		int registrosModificados = actorMapper.guardarActor(actor);
		System.out.println("registrosModificados = "+registrosModificados);
		System.out.println("actor = "+actor);
		
		registrosModificados = actorMapper.eliminarActor(actor.getIdActor());
		System.out.println("registrosModificados = "+registrosModificados);		
		
		Actor actorBD = actorMapper.obtenerActorPorId(actor.getIdActor());
		assertNull(actorBD);
	}
	
	@Test
	public void actualizarActor() throws ParseException{
		
		Actor actor = crearNuevoActor();
		int registrosModificados = actorMapper.guardarActor(actor);
		System.out.println("registrosModificados = "+registrosModificados);
		System.out.println("actor = "+actor);
		
		actor.setNombre("Andrea Boccelli");
		registrosModificados = actorMapper.guardarActor(actor);
		System.out.println("registrosModificados = "+registrosModificados);
		
		Actor actorBD = actorMapper.obtenerActorPorId(actor.getIdActor());
		assertEquals("Andrea Boccelli", actorBD.getNombre());
		
	}

	private Actor crearNuevoActor()  throws ParseException{
		Calendar fecha = CalendarUtil.stringToCalendar("dd-MM-yyyy", "11-08-1960");	
		Actor actor = new Actor("Jennifer Aniston", fecha.getTime());
		return actor;
	}
}
