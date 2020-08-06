package ar.com.gabriel.Peliculas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.gabriel.Peliculas.model.Actor;

public interface ActorRepository  extends JpaRepository <Actor,Long>{

}
