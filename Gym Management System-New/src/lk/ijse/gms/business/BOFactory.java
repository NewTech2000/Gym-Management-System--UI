package lk.ijse.gms.business;

import lk.ijse.gms.business.custom.Impl.*;

public class BOFactory {
   private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getInstance() {
        if (boFactory == null) {
            boFactory = new BOFactory();
        }

        return boFactory;
    }

   public <T extends SuperBO> T getBO(BOFactory.BOTypes boType) {
        switch(boType) {
            case REGISTATION:
                return (T) new RegistrationBOImpl();
           case PAYMENT:
                return (T) new PaymentBOImpl();
        //        case ATTENDANCE:
       //             return (T)new AttendanBOImpl();
          //          case BODYMEASUREMENT:
        //    return (T)new BodyMeasurementBOI();
           case SCHEDULE:
                return (T)new ScheduleBOImpl();
            default:
                return null;
        }
   }



   public static enum BOTypes {
        REGISTATION,
        PAYMENT,
        ATTENDANCE,
        BODYMEASUREMENT,
       SCHEDULE;

   }
}
