package ar.com.gabriel.Peliculas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import ar.com.gabriel.Peliculas.model.Actor;
import ar.com.gabriel.Peliculas.model.Pelicula;
import ar.com.gabriel.Peliculas.repository.ActorRepository;
import ar.com.gabriel.Peliculas.repository.PeliculaRepository;
@Service
public class PeliculasServiceImpl implements PeliculasService {

	@Autowired
	private PeliculaRepository peliculaRepo;
	@Autowired
	private ActorRepository actorRepo;

	@Override
	public List<Pelicula> obtenerPeliculas() {
		return peliculaRepo.findAll((Sort.by(Sort.Direction.ASC, "nombre")));

	}

	@Override
	public List<Pelicula> obtenerPeliculaByNombre(String nombre) {
		return peliculaRepo.getPeliculaByNombre(nombre);
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		List<Actor> reparto = pelicula.getReparto();
		actorRepo.saveAll(reparto);
		return peliculaRepo.save(pelicula);
	}
	
	
	@Override
	public Pelicula modificarPelicula(Pelicula pelicula) {
				
		return peliculaRepo.save(pelicula);
	}

	@Override
	public void borrarPelicula(Long id) {
		peliculaRepo.deleteById(id);

	}

	@Override
	public Page<Pelicula> obtenerPeliculaPaginada(int page, int size) {
		Page<Pelicula> peliculas = peliculaRepo
				.findAll(PageRequest.of(page, size, Sort.by(Sort.Direction.ASC, "nombre")));
		return peliculas;
	}
}
