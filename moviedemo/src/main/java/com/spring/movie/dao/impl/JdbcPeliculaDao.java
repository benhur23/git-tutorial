package com.spring.movie.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.movie.dao.PeliculaDao;
import com.spring.movie.domain.BNPelicula;
import com.spring.movie.domain.Pelicula;

@Repository
public class JdbcPeliculaDao extends JdbcDaoSupport implements PeliculaDao {
	
	@Autowired
	public JdbcPeliculaDao(DataSource dataSource){
		setDataSource(dataSource);
	}

	public List<Pelicula> obtenerTodasLasPeliculas(int firstResult,
			int maxResults, String columnName, String sortType) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BNPelicula> obtenerTodasLasBNPeliculas(int firstResult,
			int maxResults, String columnName, String sortType) {
		StringBuilder query = new StringBuilder("");
		query.append("	SELECT p.ID_PELICULA AS idPelicula, ");
		query.append("	    p.TITULO AS titulo, ");
		query.append("	    p.TIEMPO_MINUTOS AS tiempoMinutos, ");
		query.append("	    p.FECHA_LANZAMIENTO AS fechaLanzamiento,");
		query.append("	    d.ID_ACTOR AS idDirector, ");
		query.append("	    d.NOMBRE AS nombreDirector, ");
		query.append("	    g.ID_GENERO AS idGenero, ");
		query.append("	    g.NOMBRE AS nombreGenero ");
		query.append("	FROM pelicula p INNER JOIN actor a ON p.ID_PRODUCTOR = a.ID_ACTOR ");
		query.append("    INNER JOIN actor d ON p.ID_DIRECTOR = d.ID_ACTOR ");
		query.append("    INNER JOIN pais pa ON p.ID_PAIS = pa.ID_PAIS ");
		query.append("    INNER JOIN genero g ON p.ID_GENERO = g.ID_GENERO ");
		query.append("    ORDER BY p.ID_PELICULA ASC  ");
		query.append("	LIMIT ? , ? ");		
		
		List<BNPelicula> peliculas = getJdbcTemplate().query(query.toString(), 
						new Object[]{firstResult, (firstResult + maxResults) - 1}, new PeliculaMapper());
		return peliculas;
	}
	
	private static final class PeliculaMapper implements RowMapper<BNPelicula> {

	    public BNPelicula mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	
	    	BNPelicula pelicula = new BNPelicula();
	    	pelicula.setFechaLanzamiento(rs.getDate("fechaLanzamiento"));
	    	pelicula.setIdDirector(rs.getInt("idDirector"));
	    	pelicula.setIdGenero(rs.getInt("idGenero"));
	    	pelicula.setIdPelicula(rs.getInt("idPelicula"));
	    	pelicula.setNombreDirector(rs.getString("nombreDirector"));
	    	pelicula.setNombreGenero(rs.getString("nombreGenero"));
	    	pelicula.setTiempoMinutos(rs.getInt("tiempoMinutos"));
	    	pelicula.setTitulo(rs.getString("titulo"));
	        return pelicula;
	    }        
	}		
	
	public Integer contarTodosLasPelículas() {
		
		StringBuilder query = new StringBuilder();
		query.append("  SELECT COUNT(*)");
		query.append("	FROM pelicula p INNER JOIN actor a ON p.ID_PRODUCTOR = a.ID_ACTOR ");
		query.append("		INNER JOIN actor d ON p.ID_DIRECTOR = d.ID_ACTOR ");
		query.append("		INNER JOIN pais pa ON p.ID_PAIS = pa.ID_PAIS ");
		query.append(" 		INNER JOIN genero g ON p.ID_GENERO = g.ID_GENERO ");
		return getJdbcTemplate().queryForInt(query.toString());
	}

}
