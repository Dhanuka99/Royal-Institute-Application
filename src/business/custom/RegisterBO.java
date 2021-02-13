package business.custom;

import business.SuperBO;
import dto.RegisterDTO;
import entity.Course;

public interface RegisterBO extends SuperBO {

    Course searchCourse(String id) throws Exception;

    boolean saveRegistration(RegisterDTO registerDTO) throws Exception;

    String getLastID() throws Exception;
}
