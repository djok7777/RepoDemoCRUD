/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.demochl.dao;

import cl.demochl.model.Cliente;
import cl.demochl.util.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author BlueOcean
 */
public class ClienteDAO {

    public void addCliente(Cliente cliente) {
        Transaction tx = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tx = session.beginTransaction();
            session.save(cliente);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        }
        finally{
            session.flush();
            session.close();
        }
    }

    public void deleteCliente(int id) {
    }

    public void updateCliente(Cliente cliente) {
    }

    public Cliente getClientById(int id) {

        return null;
    }

}
