package clases.paquete;
import java.sql.Date;

public class Viaje {
	private int id_viaje;
	private boolean finalizado;
	private String destino;
	private String origen;
	private float costo;
	private Date fecha;
	private Calificacion calificaciones[];
	private Pasajero pasajeros[];
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
	public Calificacion[] getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(Calificacion calificaciones[]) {
		this.calificaciones = calificaciones;
	}
	public Pasajero[] getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(Pasajero pasajeros[]) {
		this.pasajeros = pasajeros;
	}
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	int max_pasajeros;

}
