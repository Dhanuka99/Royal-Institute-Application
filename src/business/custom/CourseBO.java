package business.custom;

import business.SuperBO;
import dto.CourseDTO;

import java.util.List;

public interface CourseBO extends SuperBO {
    boolean save(CourseDTO courseDTO) throws Exception;

    String getID() throws Exception;

    List<CourseDTO> getAllCourses() throws Exception;
}
