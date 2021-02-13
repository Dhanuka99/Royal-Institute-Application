package dao.impl;

import dao.custom.CourseDAO;
import entity.Course;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import util.FactoryConfiguration;

import java.util.ArrayList;

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
        return null;
    }

    @Override
    public ArrayList<Course> getAll() throws Exception {
        return null;
    }

    @Override
    public Course findByID(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery sqlQuery = session.createSQLQuery("select * from Course where courseCode=?");
        Course c = (entity.Course) sqlQuery.uniqueResult();
        System.out.println(c.getCourseCode()+" "+c.getCourseName());
        transaction.commit();
        session.close();
        return c;
    }


    @Override
    public String getID() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery sqlQuery = session.createSQLQuery("select courseCode from Course order by courseCode desc limit 1");
        String id = (String) sqlQuery.uniqueResult();

        transaction.commit();
        session.close();
        return id;
    }
}
