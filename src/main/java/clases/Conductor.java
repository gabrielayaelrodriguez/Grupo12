package clases;

public class Conductor extends Usuario {
	private Viaje viajes[];

    public Conductor(){
    	
    }
	public Viaje[] getViajes() {
		return viajes;
	}

	public void setViajes(Viaje viajes[]) {
		this.viajes = viajes;
	}
}
