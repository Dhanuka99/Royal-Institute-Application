package util;

import entity.Register;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.security.auth.login.Configuration;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Student student = new Student();
       /* student.setStID("S001");
        student.setName("Dhanuka");
        student.setAddress("Kurunegala");*/






        session.save(student);

        transaction.commit();
        session.close();
        
    }
}
