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
		
        System.out.println("PUNTO 4.a");
		Conductor roberto = new Conductor("Roberto","1234",new GregorianCalendar(2020, 2, 20).getTime(), muber);
		Viaje viaje = roberto.registrarViaje("La Plata","Tres Arroyos", 4, 900);
		
		
		//estos son para que haya viajes abiertos en la salida
		
		roberto.registrarViaje("La Plata","Buenos Aires", 4,500);
		roberto.registrarViaje("Moron","La Plata", 1, 12900);
		
		System.out.println("PUNTO 4.b");
		
		Pasajero german = new Pasajero("German", "g", 1500, muber);
		Pasajero alicia = new Pasajero("Alicia", "a", 1500, muber );
		Pasajero margarita = new Pasajero("Margarita", "m", 1500, muber);
		
		german.agregarse(viaje);
		alicia.agregarse(viaje);
		margarita.agregarse(viaje);
		
		System.out.println("-------------------");
		System.out.println("PUNTO 4.c");
		
		german.calificar(5, "excelente viaje", viaje);
		alicia.calificar(4, "buen viaje", viaje);
		margarita.calificar(4, "bien", viaje);
		
		
		System.out.println("-------------------");
		System.out.println("PUNTO 4.d");
		roberto.finalizar(viaje);
		System.out.println("-------------------");
		
		
		//guardamos sólo muber por la persistencia por alcance
		
		session.save(muber);
		
		System.out.println("INFORMACIÓN DEL CONDUCTOR");
		
		roberto.mostrarInformacion();
		
		System.out.println("-------------------");
		System.out.println("CONDUCTORES");
		muber.listarConductores();
		System.out.println("-------------------");
		
		//dos viajes abiertos porque uno ya se finalizó
		
		System.out.println("VIAJES ABIERTOS");
		muber.listarViajesAbiertos();
		System.out.println("-------------------");
		System.out.println("PASAJEROS");
		muber.listarPasajeros();
		System.out.println("-------------------");
		
		
		HibernateUtil.cerrar(session);
		
	}
}
