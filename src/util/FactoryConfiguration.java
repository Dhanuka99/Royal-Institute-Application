package util;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;
    static  Properties properties = new Properties();
    public FactoryConfiguration() {

        try {
            properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("Config.properties"));
            sessionFactory = new Configuration().mergeProperties(properties).buildSessionFactory();

        } catch (IOException e) {
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
