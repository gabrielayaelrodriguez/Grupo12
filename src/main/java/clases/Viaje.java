package clases;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Viaje {
	private int id_viaje;
	private int max_pasajeros;
	private boolean finalizado;
	private String destino;
	private String origen;
	private float costo;
	private Date fecha;
	private Set<Calificacion> calificaciones;
	private Set<Pasajero> pasajeros;
	private Conductor conducido_por;
	private Muber muber;
	
	public Viaje(){
		
	}
	
	
	public Viaje(String origen, String destino, int maxpasajeros, float costo, Conductor conducido_por) {
		// TODO Auto-generated constructor stub
		this.finalizado=false;
		this.destino=destino;
		this.origen=origen;
		this.costo=costo;
		this.fecha=new Date();
		this.max_pasajeros=maxpasajeros;
		this.pasajeros = new HashSet<Pasajero>();
		this.conducido_por = conducido_por;
		this.calificaciones = new HashSet<Calificacion>();
	}
	
	

	public void agregarPasajero(Pasajero pasajero) {
		if (!this.finalizado && this.pasajeros.size()< this.max_pasajeros){
			this.pasajeros.add(pasajero);
		}
		
	}
	
	public void finalizar() {
		float acobrar = this.costo / this.pasajeros.size();
		for(Pasajero p : this.pasajeros) {
            p.cobrar(acobrar);
        }
	}
	
	public void agregarCalificacion(Calificacion calif) {
		this.calificaciones.add(calif);
		
	}
	//setters y getters
	
	public Set<Pasajero> getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(Set<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	
	public int getId_viaje() {
		return id_viaje;
	}
	public void setId_viaje(int id_viaje) {
		this.id_viaje = id_viaje;
	}
	public boolean isFinalizado() {
		return finalizado;
	}
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getMax_pasajeros() {
		return max_pasajeros;
	}
	public void setMax_pasajeros(int max_pasajeros) {
		this.max_pasajeros = max_pasajeros;
	}
	public Set<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(HashSet<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}
	
	public Conductor getConducido_por() {
		return conducido_por;
	}
	public void setConducido_por(Conductor conducido_por) {
		this.conducido_por = conducido_por;
	}


	public Muber getMuber() {
		return muber;
	}


	public void setMuber(Muber muber) {
		this.muber = muber;
	}


	

}
