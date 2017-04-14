package clases.paquete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory;
		
		// Setting up Hibernate
		Configuration configuration = new Configuration();
		configuration.configure();
		
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		//Droping schema
		new SchemaExport(configuration).drop(true, true);
		
		//Generating schema
		new SchemaExport(configuration).create(true, true);
		
		//Building sessions
		//SessionFactory sessions = configuration.buildSessionFactory();
		
		Usuario user=new Usuario();  //Creamos el objeto
		 
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		 
		session.save(user); //<|--- Aqui guardamos el objeto en la base de datos.
		 
		session.getTransaction().commit();
		session.close();
		
	}

}
