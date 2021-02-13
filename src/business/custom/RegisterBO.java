package business.custom;

import business.SuperBO;
import entity.Course;

public interface RegisterBO extends SuperBO {

    Course searchCourse(String id) throws Exception;
}
