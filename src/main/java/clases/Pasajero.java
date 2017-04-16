package clases;

import java.time.LocalDateTime;

public class Pasajero extends Usuario {
	private float credito;
	private Viaje viajes[];
	private Calificacion calificaciones[];

	public Pasajero(String nombre, String contrasenia, float credito){
		
		this.nombre=nombre;
		this.contrasenia=contrasenia;
		this.credito=credito;
		this.f_ingreso=LocalDateTime.now();

		
	}

	public float getCredito() {
		return credito;
	}

	public Viaje[] getViajes() {
		return viajes;
	}

	public void setViajes(Viaje viajes[]) {
		this.viajes = viajes;
	}

	public Calificacion[] getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(Calificacion[] calificaciones) {
		this.calificaciones = calificaciones;
	}

	public void setCredito(float credito) {
		this.credito = credito;
	}

}
