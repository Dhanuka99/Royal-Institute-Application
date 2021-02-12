package business.custom;

import business.SuperBO;
import dto.CourseDTO;

public interface CourseBO extends SuperBO {
    boolean save(CourseDTO courseDTO) throws Exception;
}
