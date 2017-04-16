package clases;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil
{  
	private static SessionFactory sessionFactory;
    
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            // loads configuration and mappings
        	
            Configuration configuration = new Configuration().configure("/hibernate/hibernate.cfg.xml");
            
            ServiceRegistry serviceRegistry
                = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            System.out.println("el problema esta aca");
            // builds a session factory from the service registry
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);   
            System.out.println("esto ya no lo lee"); 
        }
         
        return sessionFactory;
    }
}