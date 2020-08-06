package ar.com.gabriel.Peliculas.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import ar.com.gabriel.Peliculas.model.Pelicula;

@Service
public interface PeliculasService {
		
	public List<Pelicula> obtenerPeliculas();
	
	public List<Pelicula> obtenerPeliculaByNombre(String nombre);
	
	public Pelicula guardarPelicula(Pelicula pelicula);
	
	public Pelicula modificarPelicula(Pelicula pelicula);
	
	public void borrarPelicula(Long id);
	
	public  Page<Pelicula> obtenerPeliculaPaginada(int page , int size);
}
