package clases;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
	private int id_viaje;
	private int max_pasajeros;
	private boolean finalizado;
	private String destino;
	private String origen;
	private float costo;
	private LocalDateTime fecha;
	private List<Calificacion> calificaciones;
	private List<Pasajero> pasajeros;
	private Conductor conductor;
	
	public Viaje(){
		
	}
	
	
	public Viaje(String origen, String destino, int maxpasajeros, float costo, Conductor conductor) {
		// TODO Auto-generated constructor stub
		this.finalizado=false;
		this.destino=destino;
		this.origen=origen;
		this.costo=costo;
		this.fecha=LocalDateTime.now();
		this.max_pasajeros=maxpasajeros;
		this.pasajeros = new ArrayList<Pasajero>();
		this.conductor = conductor;
	}
	
	public Viaje(String origen, String destino, int maxpasajeros, float costo) {
		// TODO Auto-generated constructor stub
		this.finalizado=false;
		this.destino=destino;
		this.origen=origen;
		this.costo=costo;
		this.fecha=LocalDateTime.now();
		this.max_pasajeros=maxpasajeros;
		this.pasajeros = new ArrayList<Pasajero>();
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
	
	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(List<Pasajero> pasajeros) {
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
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public int getMax_pasajeros() {
		return max_pasajeros;
	}
	public void setMax_pasajeros(int max_pasajeros) {
		this.max_pasajeros = max_pasajeros;
	}
	public List<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(List<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}
	
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}


	

}
