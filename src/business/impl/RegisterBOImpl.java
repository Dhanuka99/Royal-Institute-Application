package business.impl;

import business.custom.RegisterBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.SuperDAO;
import dao.impl.CourseDAOImpl;
import dao.impl.StudentDAOImpl;
import entity.Course;
import entity.Student;

public class RegisterBOImpl implements RegisterBO {

    StudentDAOImpl StudentREGdao = DAOFactory.getInstance().getDAO(DAOType.REGISTERDAO);
    CourseDAOImpl coursedao = DAOFactory.getInstance().getDAO(DAOType.COURSEDAO);


    @Override
    public Course searchCourse(String id) throws Exception {
        Course byID = coursedao.findByID(id);
        return byID;

    }
}
