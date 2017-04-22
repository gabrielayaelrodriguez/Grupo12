package clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Muber {
	
	private Set<Conductor> conductores;
    private Set<Pasajero> pasajeros;
	private Set<Viaje> viajes;
	private int id_muber;

	public Muber(){
		
		this.conductores=new HashSet<Conductor>();
		this.pasajeros=new HashSet<Pasajero>();
		this.viajes=new HashSet<Viaje>();


	}
	
	public void listarConductores(){
		for (Conductor c: this.getConductores()){
 		    System.out.println("NOMBRE:"+c.getNombre()+"; FECHA LICENCIA:"+c.getF_licencia()+"; FECHA INGRESO:"+c.getF_ingreso());
    	}	
		
	}
	
    public void listarPasajeros(){
    	for (Pasajero c: this.getPasajeros()){
 		    System.out.println("NOMBRE:"+c.getNombre()+"; FECHA INGRESO:"+c.getF_ingreso()+"; CREDITO:"+c.getCredito());
    	}	
	}
	
	public void listarViajesAbiertos(){
		for (Viaje v: this.getViajes()){
			 if(v.getFinalizado()==false){	
	 		    System.out.println("ORIGEN:"+v.getOrigen()+"; DESTINO:"+v.getDestino()+"; COSTO:"+v.getCosto());
			 }
		 }	
   }

	
	
	//getters y setters
	
	public Set<Conductor> getConductores() {
		return conductores;
	}

	public void setConductores(Set<Conductor> conductores) {
		this.conductores = conductores;
	}

	public Set<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Set<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Set<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(Set<Viaje> viajes) {
		this.viajes = viajes;
	}

	public int getId_muber() {
		return id_muber;
	}

	public void setId_muber(int id_muber) {
		this.id_muber = id_muber;
	}



}
