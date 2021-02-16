package business.impl;

import business.custom.LoginDetailsBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.impl.LoginDetailsDAOImpl;
import dto.LoginDetailsDTO;
import entity.LoginDetails;

public class LoginDetailsBOImpl implements LoginDetailsBO {

    LoginDetailsDAOImpl dao = DAOFactory.getInstance().getDAO(DAOType.LoginDetailsDAO);

    @Override
    public boolean saveLoginDetails(LoginDetailsDTO dto) throws Exception {

        return false;
    }

    @Override
    public String getID() throws Exception {
        String lastSignupID = dao.getLastSignupID();
       int newID = Integer.parseInt(lastSignupID.substring(1,4))+1;
        if (newID<10){
            return "L00"+newID;
        }else if(newID<100){
            return "L0"+newID;
        }return "L"+newID;
    }

    @Override
    public LoginDetailsDTO search(String s) throws Exception {
        LoginDetails byID = dao.findByID(s);
        LoginDetailsDTO loginDetailsDTO = new LoginDetailsDTO(byID.getLoginID(), byID.getLoginName(), byID.getLoginPassword());
        return loginDetailsDTO;
    }
}
