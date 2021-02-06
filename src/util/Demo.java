package util;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Demo {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Student student = new Student();
        student.setId("S001");
        student.setStudentName("Dhanuka");
        student.setAddress("Kurunegala");
        student.setContact("077876544");
        student.setDob("1999-21-21");
        student.setGender("male");
        session.save(student);

        transaction.commit();
        session.close();
        
    }
}
