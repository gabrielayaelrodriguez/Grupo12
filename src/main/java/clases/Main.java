package clases;




import java.util.GregorianCalendar;
import java.util.Date;
import org.hibernate.Session;


public class Main {
	
	
	public static void main(String[] args) {
		
		
	
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		
		Muber muber= new Muber();
		
        System.out.println("punto 4.a");
		Conductor roberto = new Conductor("roberto","1234",new GregorianCalendar(2020, 2, 20).getTime(), muber);
		Viaje viaje = roberto.registrarViaje("la plata","tres arroyos",4,900,muber);
	
		
		System.out.println("punto 4.b");
		
		Pasajero german = new Pasajero("german","g",1500, muber);
		Pasajero alicia = new Pasajero("alicia","a",1500,muber );
		Pasajero margarita = new Pasajero("margarita","m",1500,muber);
		german.agregarse(viaje);
		alicia.agregarse(viaje);
		margarita.agregarse(viaje);
		
		System.out.println("-------------------");
		System.out.println("punto 4.c");
		
		Calificacion c1= german.calificar(5, "muy buenas anecdotas", viaje);
		Calificacion c2= alicia.calificar(4, "buen viaje", viaje);
		Calificacion c3= margarita.calificar(4, "bien", viaje);
		
		
		System.out.println("-------------------");
		System.out.println("punto 4.d");
		viaje.finalizar();
		session.save(muber);
		session.save(german);
		session.save(alicia);
		session.save(margarita);
		session.save(roberto);
		session.save(viaje);
		session.save(c1);
		session.save(c2);
		session.save(c3);
		
		System.out.println("imfomarcion de conductor");
		
		roberto.mostrarInformacion();
		
		System.out.println("-------------------");
		System.out.println("CONDUCTORES");
		muber.listarConductores();
		System.out.println("-------------------");
		//no hay viaje abirto porque ya estaba finalizado
		System.out.println("VIAJES ABIERTOS");
		muber.listarViajesAbiertos();
		System.out.println("-------------------");
		System.out.println("PASAJEROS");
		muber.listarPasajeros();
		System.out.println("-------------------");
		
		
		
		HibernateUtil.cerrar(session);
		
	}
}
