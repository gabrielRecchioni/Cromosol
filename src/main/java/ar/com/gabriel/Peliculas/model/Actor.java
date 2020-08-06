package ar.com.gabriel.Peliculas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "actores")
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id_actores")
	Long id;
	String nombre;
	String apellido; 
	@ManyToMany(mappedBy="reparto",cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	 @JsonIgnoreProperties("reparto")
	List<Pelicula> peliculas;
	public String getNombre() {
		return nombre;
	}
	
	
	public Long getId() {
		return id;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public List<Pelicula> getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	
}
