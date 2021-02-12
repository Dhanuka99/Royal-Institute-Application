package business.custom;

import business.SuperBO;
import dto.StudentDTO;

public interface StudentBO extends SuperBO {
    boolean save(StudentDTO studentDTO) throws Exception;

    String getID() throws Exception;
}
