package clases.paquete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Main {

	public static void main(String[] args) {
		
		// Setting up Hibernate
		Configuration cfg = new Configuration();
		cfg.configure();
		
		//Droping schema
		new SchemaExport(cfg).drop(true, true);
		
		//Generating schema
		new SchemaExport(cfg).create(true, true);
		
		//Building sessions
		SessionFactory sessions = cfg.buildSessionFactory();
		Session session = sessions.openSession();
		
		Calificacion calif= new Calificacion();
		
	}

}
