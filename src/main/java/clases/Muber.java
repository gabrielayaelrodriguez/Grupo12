package clases;

import java.util.ArrayList;
import java.util.List;

public class Muber {
	
	private List<Conductor> conductores;
	private List<Pasajero> pasajeros;
	private List<Viaje> viajes;
	private int id_muber;

	public Muber(){
		
		this.conductores=new ArrayList<Conductor>();
		this.pasajeros=new ArrayList<Pasajero>();
		this.viajes=new ArrayList<Viaje>();


	}

	public List<Conductor> getConductores() {
		return conductores;
	}

	public void setConductores(List<Conductor> conductores) {
		this.conductores = conductores;
	}

	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public List<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}

	public int getId_muber() {
		return id_muber;
	}

	public void setId_muber(int id_muber) {
		this.id_muber = id_muber;
	}
	
	

}
