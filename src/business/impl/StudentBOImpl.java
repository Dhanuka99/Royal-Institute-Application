package business.impl;

import business.custom.StudentBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.SuperDAO;
import dao.impl.StudentDAOImpl;
import dto.StudentDTO;
import entity.Register;
import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentBOImpl implements StudentBO {

    StudentDAOImpl dao = DAOFactory.getInstance().getDAO(DAOType.STUDENTDAO);


    @Override
    public boolean save(StudentDTO dto) throws Exception {
        Student student = new Student(dto.getStID(), dto.getName(), dto.getDob(), dto.getContact(), dto.getDob(), dto.getGender(), dto.getRegisters());
       return dao.save(student);

    }

    @Override
    public String getID() throws Exception {
        String lastStudentId = dao.getLastStudentId();
        int newID  = Integer.parseInt(lastStudentId.substring(1,4))+1;

        if (newID<10){
            return "C00"+newID;
        }else if(newID<100){
            return "C0"+newID;
        }
        return "C"+newID;
    }

    @Override
    public Student search(String sid) throws Exception {
        Student student = dao.SearchStudent(sid);
        return student;
    }

    @Override
    public List<StudentDTO> getAllStudent() throws Exception {
        List<Student> all = dao.getAll();
        List<StudentDTO> allStudent = new ArrayList<>();
     //   List<Register> registers = new ArrayList<>();
        for (Student s : all) {
            allStudent.add(new StudentDTO(s.getStudentID(),s.getStudentName(),s.getStudentAddress(),s.getStudentContact(),s.getStudentDOB(),s.getStudentGender()));
        }

        return null;
    }


}
