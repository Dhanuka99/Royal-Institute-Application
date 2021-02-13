package dao.custom;

import dao.CrudDAO;
import entity.Register;

public interface RegistrationDAO extends CrudDAO<Register,String> {

    String getlastid() throws Exception;
}
