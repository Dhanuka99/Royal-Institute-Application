package dao;

import dao.impl.CourseDAOImpl;
import dao.impl.LoginDetailsDAOImpl;
import dao.impl.RegistrationDAOImpl;
import dao.impl.StudentDAOImpl;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory(){

    }

    public static DAOFactory getInstance(){
        return (daoFactory==null) ? daoFactory=new DAOFactory() :daoFactory;
    }

    public <T extends SuperDAO> T getDAO(DAOType DAOType){
        switch (DAOType){
            case COURSEDAO:return (T) new CourseDAOImpl();
            case STUDENTDAO:return (T) new StudentDAOImpl();
            case REGISTERDAO:return (T) new RegistrationDAOImpl();
            case LoginDetailsDAO: return (T) new LoginDetailsDAOImpl();
            default : return null;
        }
    }
}
