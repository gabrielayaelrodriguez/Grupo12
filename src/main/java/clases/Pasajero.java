package clases;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Pasajero extends Usuario {
	private float credito;
	private List<Viaje> viajes;
	private List<Calificacion> calificaciones;

	public Pasajero(){
	
	}

	public Pasajero(String nombre, String contrasenia, float credito){
		
		super(nombre, contrasenia);
		this.credito=credito;
		this.viajes = new ArrayList<Viaje>();
		

		
	}
	
	public void agregarViaje(Viaje viaje) {
		    viaje.agregarPasajero(this);
			this.viajes.add(viaje);
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
	public List<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}

	public void cobrar(float acobrar) {
		this.credito=this.credito - acobrar;
		
	}

}
