package dao.impl;

import dao.custom.StudentDAO;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import util.FactoryConfiguration;

import java.util.ArrayList;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public Boolean save(Student entity) throws Exception {
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
    public Boolean update(Student entity) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Student> getAll() throws Exception {
        return null;
    }

    @Override
    public Student findByID(String s) throws Exception {
        return null;
    }

    @Override
    public String getLastStudentId() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        NativeQuery sqlQuery = session.createSQLQuery("select studentID from Student order by studentID desc limit 1");
        String id = (String) sqlQuery.uniqueResult();
        transaction.commit();

        session.close();
        System.out.println(id);
        return id;
    }
}
