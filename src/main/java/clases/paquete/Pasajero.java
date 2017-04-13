package clases.paquete;

public class Pasajero extends Usuario {
	private int credito;
	private Viaje viajes[];

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public Viaje[] getViajes() {
		return viajes;
	}

	public void setViajes(Viaje viajes[]) {
		this.viajes = viajes;
	}

}