package com.spring.movie.service.json;

import java.util.List;

import com.spring.movie.domain.BNPelicula;
import com.spring.movie.domain.Pelicula;

public class PeliculaResponse {

	private String page;
	private String total;
	private String records;
	private List<BNPelicula> rows;
	
	public PeliculaResponse(){
		
	}
	
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getRecords() {
		return records;
	}
	public void setRecords(String records) {
		this.records = records;
	}
	public List<BNPelicula> getRows() {
		return rows;
	}
	public void setRows(List<BNPelicula> rows) {
		this.rows = rows;
	}
	
}
