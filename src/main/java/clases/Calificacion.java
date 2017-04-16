package clases;

public class Calificacion {
	
private int id_calificacion;
private int puntaje;
private Pasajero hecha_por;
private String comentario;
private Viaje para_viaje;

public Calificacion(){

}
public Calificacion(int puntaje, String comentario, Pasajero pas, Viaje viaje){
    this.puntaje = puntaje;
    this.comentario=comentario;
    this.hecha_por=pas;
    this.para_viaje=viaje;
    
}

public int getId_calificacion() {
	return id_calificacion;
}
public void setId_calificacion(int id_calificacion) {
	this.id_calificacion = id_calificacion;
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
public Viaje getPara_viaje() {
	return para_viaje;
}
public void setPara_viaje(Viaje para_viaje) {
	this.para_viaje = para_viaje;
}

}
