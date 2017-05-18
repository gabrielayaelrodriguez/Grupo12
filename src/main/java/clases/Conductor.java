package clases;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Conductor extends Usuario {
	private Set<Viaje> viajes;
	private Date f_licencia;
	private Muber muber;

    public Conductor(){
    	
    }
    
    public Conductor(String nombre, String contrasenia , Date f_licencia, Muber muber){
		
		super(nombre, contrasenia);
		this.viajes = new HashSet<Viaje>();
		this.f_licencia=f_licencia;
		this.muber=muber;
	    muber.getConductores().add(this);
			
	}
    
    //un conductor registra un viaje nuevo
    
    public Viaje registrarViaje(String origen, String destino, int maxpasajeros, float costo) {
    	if(this.getF_licencia().after(new Date()) ){
		   	Viaje viaje = new Viaje(origen, destino, maxpasajeros, costo, this);
			this.viajes.add(viaje);
			return viaje;
    	}else{
    		
    		return null;
    		
    		
    	}
   }
    
    //mostrar datos del conductor
    
    public void mostrarInformacion(){
    	System.out.println("datos del conductor: ");
    	System.out.println("-------------------");
    	System.out.println("NOMBRE:"+ this.getNombre());
    	System.out.println("PROMEDIO:" + this.calificacionPromedio());
    	System.out.println("FECHA LICENCIA:"+ this.getF_licencia());
    	System.out.println("VIAJES:");
    	for (Viaje v: this.getViajes()){
 		    System.out.println("ORIGEN:"+v.getOrigen()+"; DESTINO:"+v.getDestino()+"; COSTO:"+v.getCosto());
    	}	
    	
    }
    
    //calificación promedio del conductor
    
    public float calificacionPromedio(){
    	float prom=0;
    	int cant=0;
    	for (Viaje v: this.getViajes()){
    		 if(v.promedioViaje()>-1){
    		   cant++;	 
    		   prom= prom + v.promedioViaje();
    		 }
    	}
    	prom= prom / cant;	
    	return	prom;

    	
    }
  
    public void finalizar(Viaje v){
    	v.finalizar();
    	
    }
    //getters y setters
    
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

	

	public Muber getMuber() {
		return muber;
	}

	public void setMuber(Muber muber) {
		this.muber = muber;
	}

}
