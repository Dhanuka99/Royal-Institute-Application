package util;

import entity.Course;
import entity.Register;
import entity.Register_PK;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.omg.CORBA.portable.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    public FactoryConfiguration() {

        try {

            Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class)
                    .addAnnotatedClass(Course.class).addAnnotatedClass(Register.class).addAnnotatedClass(Register_PK.class);
            sessionFactory = configuration.buildSessionFactory();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null) ? factoryConfiguration=new FactoryConfiguration() : factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }


}
