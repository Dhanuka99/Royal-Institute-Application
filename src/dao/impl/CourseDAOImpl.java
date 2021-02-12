package dao.impl;

import dao.custom.CourseDAO;
import entity.Course;
import org.hibernate.Session;
import org.hibernate.Transaction;
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
        return null;
    }
}
