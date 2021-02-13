package business.impl;

import business.custom.RegisterBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.impl.CourseDAOImpl;
import dao.impl.RegistrationDAOImpl;
import dao.impl.StudentDAOImpl;
import dto.RegisterDTO;
import entity.Course;
import entity.Register;

public class RegisterBOImpl implements RegisterBO {

    RegistrationDAOImpl rdao = DAOFactory.getInstance().getDAO(DAOType.REGISTERDAO);
    CourseDAOImpl cdao = DAOFactory.getInstance().getDAO(DAOType.COURSEDAO);
    StudentDAOImpl stdao = DAOFactory.getInstance().getDAO(DAOType.STUDENTDAO);



    @Override
    public Course searchCourse(String id) throws Exception {
        Course byID = cdao.findByID(id);
        return byID;

    }

    @Override
    public boolean saveRegistration(RegisterDTO dto) throws Exception {
      return rdao.save(new Register(
              dto.getRegID(),
              dto.getRegDate(),
              dto.getFee(),
              stdao.findByID(dto.getStID()),
              cdao.findByID(dto.getcID())
      ));


    }

    @Override
    public String getLastID() throws Exception {
        String getlastid = String.valueOf(rdao.getlastid());
       String new1 =  (getlastid.substring(1,4))+1;
       int newID = Integer.parseInt(new1);
        if (newID<10){
            return "R00"+newID;
        }else if(newID<100){
            return "R0"+newID;
        }return "R"+newID;


    }
}
/*    insert into Register
values("R001","2021-2-2","5000.00","E001","C001");

    insert into Course
values("E001","IT","Diploma","6 months");

    insert into Student
values("C001","Kurunegala","088737344","1999-2-3","male","Dhanuka");*/
