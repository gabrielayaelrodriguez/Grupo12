package clases.paquete;

public class Calificacion {
	
private int id_calificacion;
private int puntaje;
private Pasajero hecha_por;
private String comentario;

public Calificacion(){

}
public void crearCalificacion(int puntaje, Pasajero pas){
    this.puntaje = puntaje;
    this.hecha_por=pas;
}

public int getId_Calificacion() {
	return id_calificacion;
}
public void setId_Calificacion(int id) {
	this.id_calificacion = id;
}

public int getPuntaje() {
	return puntaje;
}
public void setPuntaje(int puntaje) {
	this.puntaje = puntaje;
}
public String getComentario() {
	return comentario;
}
public void setComentario(String comentario) {
	this.comentario = comentario;
}
public Pasajero getHecha_por() {
	return hecha_por;
}
public void setHecha_por(Pasajero hecha_por) {
	this.hecha_por = hecha_por;
}

}
