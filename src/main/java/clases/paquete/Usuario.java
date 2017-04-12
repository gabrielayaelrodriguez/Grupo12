package clases.paquete;
import java.sql.Date;

public class Usuario {
	
private int id_usuario;
private String nombre;
private String contrasenia;
private Date f_ingreso;

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
public Date getF_ingreso() {
	return f_ingreso;
}
public void setF_ingreso(Date f_ingreso) {
	this.f_ingreso = f_ingreso;
}
}
