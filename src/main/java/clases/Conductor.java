package clases;

import java.util.Date;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Conductor extends Usuario {
	private Set<Viaje> viajes;
	private List<Calificacion> calificaciones;
	private Date f_licencia;
	private Muber muber;
	//private int id_conductor;

    public Conductor(){
    	
    }
    
    public Conductor(String nombre, String contrasenia , Date f_licencia, Muber muber){
		
		super(nombre, contrasenia);
		this.viajes = new HashSet<Viaje>();
		this.f_licencia=f_licencia;
		this.calificaciones = new ArrayList<Calificacion>();
		this.setMuber(muber);
		
			
	}
    
   // public Viaje crearViaje(String origen, String destino, int maxpasajeros, float costo) {
   // 	Viaje viaje = new Viaje(origen, destino, maxpasajeros, costo, this, this.muber);
//		this.viajes.add(viaje);
//		return viaje;
  //  }

    public void agregarCalificacion(Calificacion c){
    	//System.out.println(c.getComentario());
    	this.calificaciones.add(c);
    	
    	
    }
    //geters y setters
    
	public Set<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(Set<Viaje> viajes) {
		this.viajes = viajes;
	}

	public Date getF_licencia() {
		return f_licencia;
	}

	public void setF_licencia(Date f_licencia) {
		this.f_licencia = f_licencia;
	}

	public List<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(List<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}

	public Muber getMuber() {
		return muber;
	}

	public void setMuber(Muber muber) {
		this.muber = muber;
	}

	//public int getId_conductor() {
	//	return id_conductor;
	//}

	//public void setId_conductor(int id_conductor) {
	//	this.id_conductor = id_conductor;
	//}
}
