package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Conductor extends Usuario {
	private List<Viaje> viajes;
	private List<Calificacion> calificaciones;
	private LocalDateTime f_licencia;
	//private int id_conductor;

    public Conductor(){
    	
    }
    
    public Conductor(String nombre, String contrasenia , LocalDateTime f_licencia){
		
		super(nombre, contrasenia);
		this.viajes = new ArrayList<Viaje>();
		this.f_licencia=f_licencia;
		this.calificaciones = new ArrayList<Calificacion>();
		
			
	}
    
    public Viaje crearViaje(String origen, String destino, int maxpasajeros, float costo) {
    	Viaje viaje = new Viaje(origen, destino, maxpasajeros, costo, this);
		this.viajes.add(viaje);
		return viaje;
    }

    public void agregarCalificacion(Calificacion c){
    	//System.out.println(c.getComentario());
    	this.calificaciones.add(c);
    	
    	
    }
    //geters y setters
    
	public List<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}

	public LocalDateTime getF_licencia() {
		return f_licencia;
	}

	public void setF_licencia(LocalDateTime f_licencia) {
		this.f_licencia = f_licencia;
	}

	public List<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(List<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}

	//public int getId_conductor() {
	//	return id_conductor;
	//}

	//public void setId_conductor(int id_conductor) {
	//	this.id_conductor = id_conductor;
	//}
}
