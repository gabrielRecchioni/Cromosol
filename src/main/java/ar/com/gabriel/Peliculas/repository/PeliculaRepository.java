package ar.com.gabriel.Peliculas.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ar.com.gabriel.Peliculas.model.Pelicula;

@Repository
public interface PeliculaRepository  extends  JpaRepository <Pelicula,Long>{

	    
    @Query("SELECT p FROM Pelicula as p WHERE p.nombre LIKE %?1%")
	public List<Pelicula >getPeliculaByNombre(String nombre);

	}
