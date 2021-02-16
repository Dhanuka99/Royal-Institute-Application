package dao.impl;


import dao.custom.LoginDetailsDAO;
import entity.LoginDetails;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import util.FactoryConfiguration;

import java.util.List;

public class LoginDetailsDAOImpl implements LoginDetailsDAO {
    @Override
    public Boolean save(LoginDetails entity) throws Exception {
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
    public Boolean update(LoginDetails entity) throws Exception {
        return null;
    }

    @Override
    public List<LoginDetails> getAll() throws Exception {
        return null;
    }

    @Override
    public LoginDetails findByID(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        LoginDetails loginDetails = session.get(LoginDetails.class, s);

        transaction.commit();
        session.close();
        return loginDetails;
    }

    @Override
    public String getLastSignupID() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery sqlQuery = session.createSQLQuery("select loginID from LoginDetails order by loginID desc limit 1");
        String o = (String) sqlQuery.uniqueResult();
        System.out.println("login ID"+o);


        transaction.commit();
        session.close();
        return o;
    }
}
