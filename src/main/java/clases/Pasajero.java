package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Pasajero extends Usuario {
	private float credito;
	private Set<Viaje> viajes;
	private List<Calificacion> calificaciones;
	private Muber muber;

	public Pasajero(){
	
	}

	public Pasajero(String nombre, String contrasenia, float credito, Muber muber){
		
		super(nombre, contrasenia);
		this.credito=credito;
		this.viajes = new HashSet<Viaje>();
		this.calificaciones = new ArrayList<Calificacion>();
		this.setMuber(muber);
		

		
	}
	
	public void agregarViaje(Viaje viaje) {
		    viaje.agregarPasajero(this);
			this.viajes.add(viaje);
	}
	
	public Calificacion calificar(int puntaje, String comentario, Viaje viaje) {
		
		Calificacion calif= new Calificacion(puntaje, comentario, this, viaje);
		
		viaje.agregarCalificacion(calif);
		return calif;
	}
	
	
	//geters y setters
	
	
	
	public List<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(List<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}

	public float getCredito() {
		return credito;
	}


	public void setCredito(float credito) {
		this.credito = credito;
	}
	public Set<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(Set<Viaje> viajes) {
		this.viajes = viajes;
	}

	public void cobrar(float acobrar) {
		this.credito=this.credito - acobrar;
		
	}

	public Muber getMuber() {
		return muber;
	}

	public void setMuber(Muber muber) {
		this.muber = muber;
	}

}
