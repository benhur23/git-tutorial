package com.spring.movie.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.movie.dao.ActorDao;
import com.spring.movie.domain.BNActor;

@Repository
public class JdbcActorDao extends JdbcDaoSupport implements ActorDao {

	@Autowired
	public JdbcActorDao(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	public List<BNActor> obtenerTodosLosActores(){
		
		List<BNActor> actores = (List<BNActor>)getJdbcTemplate()
				.query("select ID_ACTOR, NOMBRE from actor", new ActorMapper());
		return actores;
	}
	
	private static final class ActorMapper implements RowMapper<BNActor> {

	    public BNActor mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	BNActor actor = new BNActor();
	        actor.setValue(rs.getInt("ID_ACTOR"));
	        actor.setLabel(rs.getString("NOMBRE"));
	        return actor;
	    }        
	}
}
