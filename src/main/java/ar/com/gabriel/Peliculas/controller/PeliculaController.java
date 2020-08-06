package ar.com.gabriel.Peliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.com.gabriel.Peliculas.model.Pelicula;
import ar.com.gabriel.Peliculas.service.PeliculasService;

@RestController
@RequestMapping("/api/v1")
public class PeliculaController {
	
	
	@Autowired
	private PeliculasService peliculaService;
	
	
	@GetMapping("/peliculas")
	@CrossOrigin
	public List<Pelicula> obtenerPeliculas() {
		return peliculaService.obtenerPeliculas();
	}

	@GetMapping("/pelicula")
	@CrossOrigin
	public List<Pelicula> obtenerPeliculaPorNombre(@RequestParam String nombre) {
			
		return peliculaService.obtenerPeliculaByNombre(nombre);
	}

	@PostMapping("/peliculas")
	@CrossOrigin
	public Pelicula crearPelicula(@RequestBody Pelicula pelicula) {
		return peliculaService.guardarPelicula(pelicula);
	}

	@PutMapping(path = "/update")
	@CrossOrigin
	public Pelicula updatePelicula(@RequestBody Pelicula pelicula) {

		return peliculaService.modificarPelicula(pelicula);
	}
	
	
	@DeleteMapping(path="/eliminar")
	public void deletePelicula(@RequestParam Long id) {
		peliculaService.borrarPelicula(id);
	}

	
	@GetMapping("/peliculas/pagina")
	@CrossOrigin
	public Page<Pelicula> getPeliculasPaginada(@RequestParam int page,int size) {
		return peliculaService.obtenerPeliculaPaginada(page, size);
	}
}
