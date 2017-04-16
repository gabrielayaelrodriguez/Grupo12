package clases;

import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsuariosDAO
{  
    private Session sesion; 
    private Transaction tx;  

    public long guardarUsuario(Usuario user) throws HibernateException 
    { 
        long id = 0;  

        try 
        {   System.out.println("la execepcion salta por error en hibernateUntil");
            iniciaOperacion(); 
            id = (Long) sesion.save(user); 
            tx.commit(); 
            //aca salta la exepcion
            
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        }  

        return id; 
    }  

    public void actualizaUsuario(Usuario user) throws HibernateException 
    { 
        try 
        { 
            iniciaOperacion(); 
            sesion.update(user); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        } 
    }  

    public void eliminaUsuario(Usuario user) throws HibernateException 
    { 
        try 
        { 
            iniciaOperacion(); 
            sesion.delete(user); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        } 
    }  

    public Usuario obtenUsuario(long id_usuario) throws HibernateException 
    { 
        Usuario user = null;  
        try 
        { 
            iniciaOperacion(); 
            user = (Usuario) sesion.get(Usuario.class, id_usuario); 
        } finally 
        { 
            sesion.close(); 
        }  

        return user; 
    }  

    public List<Usuario> obtenListaUsuarios() throws HibernateException 
    { 
        List<Usuario> listaUsuarios = null;  

        try 
        { 
            iniciaOperacion(); 
            listaUsuarios = sesion.createQuery("from Usuario").list(); 
        } finally 
        { 
            sesion.close(); 
        }  

        return listaUsuarios; 
    }  

    private void iniciaOperacion() throws HibernateException 
    { 
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
       // sesion = HibernateUtil.getSessionFactory().openSession(); 
        sesion = sessionFactory.openSession();
        tx = sesion.beginTransaction(); 
    }  

    private void manejaExcepcion(HibernateException he) throws HibernateException 
    { 
        tx.rollback(); 
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he); 
    } 
}