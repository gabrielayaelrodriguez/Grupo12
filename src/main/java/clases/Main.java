package clases;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import java.time.LocalDateTime;
//estos son los "nuevos"

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		//kosas "nuevas"
	   // Configuration conf = new Configuration().configure("/hibernate/hibernate.cfg.xml");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("punto 4.a");
		
		Conductor roberto = new Conductor("roberto","1234",LocalDateTime.now());
		Viaje viaje = roberto.crearViaje("la plata","tres arroyos",4,900);
		System.out.println("-------------------");
		
		System.out.println("punto 4.b");
		
		Pasajero german = new Pasajero("german","g",1500);
		Pasajero alicia = new Pasajero("alicia","a",1500);
		Pasajero margarita = new Pasajero("margarita","m",1500);
		german.agregarViaje(viaje);
		alicia.agregarViaje(viaje);
		margarita.agregarViaje(viaje);
		
		System.out.println("-------------------");
		System.out.println("punto 4.c");
		
		Calificacion c1= german.calificar(5, "muy buenas anecdotas", viaje);
		Calificacion c2= alicia.calificar(4, "buen viaje", viaje);
		Calificacion c3= margarita.calificar(4, "bien", viaje);
		
		
		System.out.println("-------------------");
		
		session.save(roberto);
		session.save(german);
		session.save(alicia);
		session.save(margarita);
		session.save(viaje);
		session.save(c1);
		session.save(c2);
		session.save(c3);
		HibernateUtil.cerrar(session);
				
	}
}
