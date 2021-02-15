package business.custom;


import business.SuperBO;
import dto.StudentDTO;
import entity.Student;

import java.util.List;

public interface StudentBO extends SuperBO {
    boolean save(StudentDTO studentDTO) throws Exception;

    String getID() throws Exception;

    Student search(String sid) throws Exception;

    List<StudentDTO> getAllStudent() throws Exception;
}
