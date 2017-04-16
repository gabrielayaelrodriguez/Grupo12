package clases;

import java.util.ArrayList;
import java.util.List;

public class Conductor extends Usuario {
	private List<Viaje> viajes;

    public Conductor(){
    	
    }
    
    public Conductor(String nombre, String contrasenia){
		
		super(nombre, contrasenia);
		this.viajes = new ArrayList<Viaje>();
			
	}
    
    public void crearViaje(String origen, String destino, int maxpasajeros, float costo) {
    	Viaje viaje = new Viaje(origen, destino, maxpasajeros, costo, this);
		this.viajes.add(viaje);
    }


    //geters y setters
    
	public List<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}
}
