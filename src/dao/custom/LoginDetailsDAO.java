package dao.custom;

import business.SuperBO;
import dao.CrudDAO;
import entity.LoginDetails;

public interface LoginDetailsDAO extends CrudDAO<LoginDetails,String> {

    String getLastSignupID() throws Exception;
}
