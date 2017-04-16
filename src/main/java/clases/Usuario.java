package clases;
import java.sql.Date;
import java.time.LocalDateTime;
//import java.util.Date; 

public class Usuario {
	
private int id_usuario;
protected String nombre;
protected String contrasenia;
protected LocalDateTime f_ingreso;

public Usuario(String nombre, String contrasenia) {
	super();
	this.nombre = nombre;
	this.contrasenia = contrasenia;
	this.f_ingreso=LocalDateTime.now();
}

public Usuario(){
}

public int getId_usuario() {
	return id_usuario;
}
public void setId_usuario(int id_usuario) {
	this.id_usuario = id_usuario;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getContrasenia() {
	return contrasenia;
}
public void setContrasenia(String contrasenia) {
	this.contrasenia = contrasenia;
}
public LocalDateTime getF_ingreso() {
	return f_ingreso;
}
public void setF_ingreso(LocalDateTime f_ingreso) {
	this.f_ingreso = f_ingreso;
}
}
