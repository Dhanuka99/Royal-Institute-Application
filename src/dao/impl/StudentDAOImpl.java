package dao.impl;

import dao.custom.StudentDAO;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import util.FactoryConfiguration;

import java.util.ArrayList;
import java.util.List;

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
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.update(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public List<Student> getAll() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Query from_student = session.createQuery("from Student");
        List<Student> list = from_student.list();
        for (Student student : list) {
            System.out.println("from database to dao"+student.getStudentName());
        }
        transaction.commit();
        session.close();
        return list;
    }

    @Override
    public Student findByID(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Student student = session.get(Student.class, s);
        System.out.println(student.getStudentID()+" "+student.getStudentName());
        transaction.commit();
        session.close();
        return student;
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

    @Override
    public Student SearchStudent(String id) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Student student = session.get(Student.class, id);
        System.out.println(student.getStudentID()+" "+student.getStudentName());

        transaction.commit();
        session.close();
        return student;
    }
}
