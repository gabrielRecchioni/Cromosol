package ar.com.gabriel.Peliculas.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "peliculas")
public class Pelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_peliculas")
	Long id;
	
	String nombre;
	String pais;
	Date fechaEstreno;
	String director;
	 @ManyToMany(targetEntity = Actor.class,fetch = FetchType.LAZY,cascade =CascadeType.MERGE)
    @JoinTable(name = "reparto", joinColumns = { @JoinColumn(name = "id_peliculas") }, 
                       inverseJoinColumns = { @JoinColumn(name = "id_actores") })
	 @JsonIgnoreProperties("peliculas")
	 List<Actor> reparto;

	
	public Long getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Date getFechaEstreno() {
		return fechaEstreno;
	}
	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public List<Actor> getReparto() {
		return reparto;
	}
	public void setReparto(List<Actor> actores) {
		this.reparto = actores;
	}
	
}
