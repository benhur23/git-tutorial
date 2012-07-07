package com.spring.movie.web;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.movie.domain.BNActor;
import com.spring.movie.domain.BNPelicula;
import com.spring.movie.domain.Pelicula;
import com.spring.movie.service.ActorService;
import com.spring.movie.service.PeliculaService;
import com.spring.movie.service.json.GenericResponse;
import com.spring.movie.service.json.PeliculaResponse;

@Controller
@RequestMapping("/pelicula")
public class PeliculaController {
	
	@Autowired
	private PeliculaService peliculaService;
	
	@Autowired
	public ActorService actorService;
	
	@RequestMapping(value = "/peliculas", method = RequestMethod.GET)
    public String cargarVistaDePeliculas() {
    
    	return "peliculas";
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public @ResponseBody PeliculaResponse listarTodasLasPeliculas(
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "rows", required = false) Integer rows,
    		@RequestParam(value = "sidx", required = false) String columnName, //nombre columna que se eligió
    		@RequestParam(value = "sord", required = false) String sortType // orden asc o desc
    		){
		
		int firstResult = ((page - 1) * rows) + 1;
		int maxResults = rows;
		
		List<BNPelicula> peliculas = peliculaService.obtenerTodasLasPeliculas(firstResult, maxResults, columnName, sortType);
		Integer contador = peliculaService.contarTodosLasPelículas();
		
		PeliculaResponse peliculaResponse = new PeliculaResponse();
		
		peliculaResponse.setRows(peliculas);
		peliculaResponse.setRecords(peliculas != null ? ""+peliculas.size() : "0");
		peliculaResponse.setPage(page.toString());
		peliculaResponse.setTotal(""+(contador / rows));
		
		return peliculaResponse;
	}
	
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody GenericResponse add(
    		@RequestParam("titulo") String firstName,
    		@RequestParam("tiempoMinutos") String lastName) {
    	
    	Boolean success = Boolean.TRUE;
    	if (success == true) {
    		GenericResponse response = new GenericResponse();
			response.setSuccess(true);
			response.setMessage("Action successful!");
    		return response;
    		
    	} else {
    		// A failure. Return a custom response as well
    		GenericResponse response = new GenericResponse();
			response.setSuccess(false);
			response.setMessage("Action failure!");
    		return response;
    	}
    	
	}	
    
    @RequestMapping(value = "/cargarActores")
    public String cargarActores(){
    	List<BNActor> actores = actorService.obtenerTodosLosBNActores();
    	
    	String result = "<select>";
    	for(Iterator<BNActor> iter = actores.iterator(); iter.hasNext(); ){
    		
    		BNActor actor = iter.next();    		
    		String select = "<option value='"+ actor.getValue().toString() + "'>'" + actor.getLabel() + "'</option>";
    		result = result.concat(select);    		
    	}
    	result += "</select>";
    	System.out.println("SELECT "+result);
    	return result;
    }

//	@RequestMapping(value="/cargarPeliculas")
//	public @ResponseBody List<Pelicula> cargarPeliculas(){
//		System.out.println("..............");
//		List<Pelicula> peliculas = null;//peliculaService.obtenerTodasLasPeliculas(1, 20, "", "");
//		PeliculaResponse peliculaResponse = new PeliculaResponse();
//		
//		peliculaResponse.setRows(peliculas);
//		peliculaResponse.setRecords(peliculas != null ? ""+peliculas.size() : "0");
//		return peliculas;
//	}

}
