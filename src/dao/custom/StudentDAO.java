package dao.custom;

import dao.CrudDAO;
import entity.Student;

public interface StudentDAO extends CrudDAO<Student,String> {
    public String getLastStudentId() throws Exception;
}
