package clases.paquete;

public class Pasajero extends Usuario {
	int credito;
	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	private Viaje viajes[];

	public Viaje[] getViajes() {
		return viajes;
	}

	public void setViajes(Viaje viajes[]) {
		this.viajes = viajes;
	}

}
