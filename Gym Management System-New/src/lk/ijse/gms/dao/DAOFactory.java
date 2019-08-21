package lk.ijse.gms.dao;


import lk.ijse.gms.dao.custom.Impl.PaymentDAOImpl;
import lk.ijse.gms.dao.custom.Impl.RegistrationDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory(){
    }

    public static DAOFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public <T extends SuperDAO> T getDAO (DAOFactory.DAOTypes daoTypes){
        switch (daoTypes){
            case REGISTATION:
                return (T)new RegistrationDAOImpl();
            case PAYMENT:
                return (T)new PaymentDAOImpl();
//            case ATTENDANCE:
//                return (T)new AttendanceDAOImpl();
//            case BODYMEASUREMENT:
//                return (T)new BodyMeasurementBOImpl();
//            case SCHEDUIE:
//                return (T)new ScheduleBOImpl();
            default:
                return null;
        }
    }

    public static enum DAOTypes {
        REGISTATION,
        PAYMENT,
        ATTENDANCE,
        BODYMEASUREMENT,
        SCHEDULE;
        private DAOTypes(){

        }
    }
}
