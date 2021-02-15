package dao.impl;

import dao.custom.CourseDAO;
import entity.Course;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import util.FactoryConfiguration;

import java.util.ArrayList;
import java.util.List;

public class CourseDAOImpl implements CourseDAO {
    @Override
    public Boolean save(Course entity) throws Exception {
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
    public Boolean update(Course entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.update(entity);

        transaction.commit();
        session.close();
        return null;
    }

    @Override
    public List<Course> getAll() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Query from_course_ = session.createQuery("from Course ");
        List<Course> list = from_course_.list();
        for (Course course : list) {
            System.out.println("from database to dao"+course.getCourseName());
        }

        transaction.commit();
        session.close();
        return list;
    }

    @Override
    public Course findByID(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        Course c = session.get(Course.class, s);
        System.out.println(c.getCourseCode() + " " + c.getCourseName());
        transaction.commit();
        session.close();
        return c;
    }


    @Override
    public String getID() throws Exception {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery sqlQuery = session.createSQLQuery("select courseCode from Course order by courseCode desc limit 1");
        String idt = (String) sqlQuery.uniqueResult();

        transaction.commit();
        session.close();
        return idt;

    }
}
