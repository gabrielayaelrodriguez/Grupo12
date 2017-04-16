package clases;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;


//estos son los "nuevos"

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		//kosas "nuevas"
		
		Configuration conf = new Configuration().configure("/hibernate/hibernate.cfg.xml");
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		SessionFactory sf = conf.buildSessionFactory(sr);
		Session session = sf.openSession();
		session.beginTransaction();
		
		//SessionFactory sessionFactory;
		
				// Setting up Hibernate
		        //System.out.println("aca arranca");
				//Configuration configuration = new Configuration();
				//configuration.configure("/hibernate/hibernate.cfg.xml");
				//borra si existe el esquema en la base de datos asi no hay conflictos y asi deja libre para cargar la nueva version de las tablas
				System.out.println("Droping schema.........");
				new SchemaExport(conf).drop(true, true);
				System.out.println("DONE.");
				//genera las tablas
				System.out.println("Generating schema.........");
				new SchemaExport(conf).create(true, true);
				System.out.println("DONE.");
				/*ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
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
				*/
				
				UsuariosDAO usuariosDAO = new UsuariosDAO();
				Pasajero user1=new Pasajero("pepe", "123", 700);  //Creamos el objeto
				System.out.println(user1.getNombre());
				//usuariosDAO.guardarUsuario(user1);
				
				
	}
}
