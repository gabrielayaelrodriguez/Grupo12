package clases;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Main {
	
	
	public static void main(String[] args) {
		
		//SessionFactory sessionFactory;
		
				// Setting up Hibernate
		        System.out.println("aca arranca");
				Configuration configuration = new Configuration();
				configuration.configure("/hibernate/hibernate.cfg.xml");
				//borra si existe el esquema en la base de datos asi no hay conflictos y asi deja libre para cargar la nueva version de las tablas
				System.out.println("drop");
				new SchemaExport(configuration).drop(true, true);
				System.out.println("funca drop.");
				//genera las tablas
				System.out.println("create");
				new SchemaExport(configuration).create(true, true);
				System.out.println("funca create.");
				
				
				
				
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
				System.out.println(org.hibernate.Version.getVersionString());
				System.out.println("llegamos a la carg.");
				UsuariosDAO usuariosDAO = new UsuariosDAO();
				Pasajero user1=new Pasajero("pepe", "123", 700);  //Creamos el objeto
				System.out.println(user1.getNombre());
				usuariosDAO.guardarUsuario(user1);
				System.out.println("cargo.");
				
				
	}
}
