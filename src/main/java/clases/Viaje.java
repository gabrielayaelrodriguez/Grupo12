package clases;
import java.sql.Date;
import java.util.List;

public class Viaje {
	private int id_viaje;
	private boolean finalizado;
	private String destino;
	private String origen;
	private float costo;
	private Date fecha;
	private List<Calificacion> calificaciones;
	private List<Pasajero> pasajeros;
	
	
	
	public void agregarPasajero(Pasajero pasajero) {
		this.pasajeros.add(pasajero);
	}
	//setters y getters
	
	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	private Conductor conductor;
	
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
	int max_pasajeros;

}
