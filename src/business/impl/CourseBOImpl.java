package business.impl;

import business.custom.CourseBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.SuperDAO;
import dao.impl.CourseDAOImpl;
import dto.CourseDTO;
import entity.Course;

public class CourseBOImpl implements CourseBO {
    CourseDAOImpl dao = DAOFactory.getInstance().getDAO(DAOType.COURSEDAO);

    @Override
    public boolean save(CourseDTO dto) throws Exception {
       return dao.save(new Course(dto.getcID(), dto.getcName(), dto.getcType(), dto.getcDuration()));

    }
}
