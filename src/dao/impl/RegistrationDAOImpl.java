package dao.impl;

import dao.custom.RegistrationDAO;
import entity.Register;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import util.FactoryConfiguration;

import java.util.ArrayList;

public class RegistrationDAOImpl implements RegistrationDAO {
    @Override
    public Boolean save(Register entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public Boolean delete(String s) throws Exception {
        return null;
    }

    @Override
    public Boolean update(Register entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.update(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public ArrayList<Register> getAll() throws Exception {
        return null;
    }

    @Override
    public Register findByID(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Register register = session.get(Register.class, s);


        transaction.commit();
        session.close();
        return register;
    }

    @Override
    public String getlastid() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        NativeQuery sqlQuery = session.createSQLQuery("select regNo from Register order by regNo desc limit 1");
        String o = (String) sqlQuery.uniqueResult();
        System.out.println("Regiter ID" +o);
        transaction.commit();
        session.close();
        return o;
    }
}
