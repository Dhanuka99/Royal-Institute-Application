package business.custom;

import business.SuperBO;
import dto.LoginDetailsDTO;

public interface LoginDetailsBO extends SuperBO {

    boolean saveLoginDetails(LoginDetailsDTO dto) throws Exception;

    String getID() throws Exception;

    LoginDetailsDTO search(String s) throws Exception;
}
