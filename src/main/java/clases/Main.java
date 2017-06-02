package clases;

import java.util.GregorianCalendar;
import org.hibernate.Session;


public class Main {
	
	
	public static void main(String[] args) {
		
		
		//abrimos la sesión
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		//empezamos a instanciar y hacer lo pedido en el enunciado
		
		Muber muber= new Muber();
		
       
		Conductor roberto = new Conductor("Roberto","1234",new GregorianCalendar(2020, 2, 20).getTime(), muber);
		Viaje viaje = roberto.registrarViaje("La Plata","Tres Arroyos", 3, 900);
		
	
		//estos son para que haya viajes abiertos en la salida
		
		roberto.registrarViaje("La Plata","Buenos Aires", 4,500);
		roberto.registrarViaje("Moron","La Plata", 1, 12900);
		
		
		
		Pasajero german = new Pasajero("German", "g", 1500, muber);
		Pasajero alicia = new Pasajero("Alicia", "a", 1500, muber );
		Pasajero margarita = new Pasajero("Margarita", "m", 1500, muber);
		Pasajero ruperta = new Pasajero("Ruperta", "m", 1500, muber);
		
		german.agregarse(viaje);
		alicia.agregarse(viaje);
		margarita.agregarse(viaje);
		
		
		german.calificar(5, "excelente viaje", viaje);
		alicia.calificar(4, "buen viaje", viaje);
		margarita.calificar(4, "bien", viaje);
		session.save(muber);
		
		margarita.calificar(5, "bien", viaje);
		
		ruperta.calificar(5, "bien", viaje);
		
		roberto.finalizar(viaje);
		
		
		
		
		
		
		
		session.save(muber);
		
		
		
	
		
		
		
		
		
		
		
		
		
		HibernateUtil.cerrar(session);
		
	}
}
