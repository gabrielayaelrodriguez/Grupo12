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
		
	}
}
