package clases.paquete;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Main {

	public static void main(String[] args) {
		
		// Setting up Hibernate
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//Droping schema
		new SchemaExport(cfg).drop(true, true);
		
		//Generating schema
		new SchemaExport(cfg).create(true, true);
		
		//Building sessions
		SessionFactory sf = cfg.buildSessionFactory();
		
	}

}
