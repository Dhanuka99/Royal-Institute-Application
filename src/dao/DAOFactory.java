package dao;

import dao.impl.CourseDAOImpl;
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
            case COURSE:return (T) new CourseDAOImpl();
            case STUDENT:return (T) new StudentDAOImpl();
            case REGISTER:return (T) new RegistrationDAOImpl();
            default : return null;
        }
    }
}
