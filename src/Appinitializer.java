import entity.Course;
import entity.Register;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import util.FactoryConfiguration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Appinitializer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/hibernate.properties");
        Properties props = new Properties();
        props.load(fis);

        Configuration configuration = new Configuration();
        configuration.setProperties(props);
       // configuration.addFile("student.hbm.xml");
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Student student = new Student();
        student.setStudentID("S001");
        student.setStudentName("Dhanuka");
        student.setStudentAddress("Kurunegala");
        student.setStudentDOB("1999-21-21");
        student.setStudentContact("0778090357");
        student.setStudentGender("male");


        Course course = new Course();
        course.setCourseCode("C001");
        course.setCourseType("Degree level");
        course.setCourseName("IT");
        course.setDuration("4 years");

        Register register = new Register();
        register.setRegNo(1);
        register.setRegFee(150000.00);
        register.setRegDate("2020-1-3");

        session.save(student);
        session.save(course);
        session.save(register);




        transaction.commit();
        session.close();
    }
}
