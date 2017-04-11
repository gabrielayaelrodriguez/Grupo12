import java.sql.Date;

public class Usuario {
String nombre;
String contrasena;
Date f_ingreso;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getContrasena() {
	return contraseña;
}
public void setContrasena(String contraseña) {
	this.contraseña = contraseña;
}
public Date getF_ingreso() {
	return f_ingreso;
}
public void setF_ingreso(Date f_ingreso) {
	this.f_ingreso = f_ingreso;
}
}
