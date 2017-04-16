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
	   // Configuration conf = new Configuration().configure("/hibernate/hibernate.cfg.xml");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		HibernateUtil.crearSchema();
		
		//SessionFactory sessionFactory;
		
				// Setting up Hibernate
		        //System.out.println("aca arranca");
				//Configuration configuration = new Configuration();
				//configuration.configure("/hibernate/hibernate.cfg.xml");
				Pasajero user1=new Pasajero("pepe", "123", 700);  //Creamos el objeto
				System.out.println(user1.getNombre());
				session.save(user1);
				//usuariosDAO.guardarUsuario(user1);
				//System.out.println("hola");
				
	}
}
