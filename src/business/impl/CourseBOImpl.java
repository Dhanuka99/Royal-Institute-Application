package business.impl;

import business.custom.CourseBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.SuperDAO;
import dao.impl.CourseDAOImpl;
import dto.CourseDTO;
import entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseBOImpl implements CourseBO {
    CourseDAOImpl dao = DAOFactory.getInstance().getDAO(DAOType.COURSEDAO);

    @Override
    public boolean save(CourseDTO dto) throws Exception {
        Course course = new Course(dto.getcID(), dto.getcName(), dto.getcType(), dto.getcDuration(), dto.getRegisters());
        return dao.save(course);


    }

    @Override
    public String getID() throws Exception {
        String id = dao.getID();
        int newInt = Integer.parseInt(id.substring(1, 4))+1;
        if (newInt<10){
            return "E00"+newInt;
        }else if(newInt<100){
            return "E0"+newInt;
        }return "E"+newInt;

    }

    @Override
    public List<CourseDTO> getAllCourses() throws Exception {
        List<Course> all = dao.getAll();
        List<CourseDTO> allStudents = new ArrayList<>();
        for (Course c : all) {
            allStudents.add(new CourseDTO(c.getCourseCode(),c.getCourseName(),c.getCourseType(),c.getDuration()));
        }

        return allStudents;
    }
}
