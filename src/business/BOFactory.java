package business;

import business.impl.CourseBOImpl;
import business.impl.LoginDetailsBOImpl;
import business.impl.RegisterBOImpl;
import business.impl.StudentBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){

    }

    public static BOFactory getInstance(){
        return (boFactory==null) ? boFactory = new BOFactory() : boFactory;
    }

    public <T extends SuperBO> T getBO(BOType boType){
        switch (boType){
            case STUDENTBO:return (T) new StudentBOImpl();
            case COURSEBO:return (T) new CourseBOImpl();
            case REGISTERBO:return (T) new RegisterBOImpl();
            case LoginDetailsBO:return (T) new LoginDetailsBOImpl();
            default:return null;

        }
    }
}
