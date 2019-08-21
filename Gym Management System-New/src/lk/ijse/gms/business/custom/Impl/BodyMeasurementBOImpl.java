//package lk.ijse.gms.business.custom.Impl;
//
//import lk.ijse.gms.business.custom.BodyMeasurementBO;
//import lk.ijse.gms.dao.DAOFactory;
//import lk.ijse.gms.dao.custom.BodyMeasurementDAO;
//import lk.ijse.gms.dao.custom.Impl.BodyMeasurementDAOImpl;
//import lk.ijse.gms.dto.AttendanceDTO;
//import lk.ijse.gms.dto.BodyMeasurementDTO;
//import lk.ijse.gms.dto.RegistrationDTO;
//import lk.ijse.gms.entity.Registration;
//
//import java.util.ArrayList;
//
//public class BodyMeasurementBOImpl implements BodyMeasurementBO {
//
//    private BodyMeasurementDAO bodyMeasurementDAO = new BodyMeasurementDAOImpl();
//
//
//    public BodyMeasurementBOImpl() {
//        this.bodyMeasurementDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BODYMEASUREMENT);
//
//    }
//
//
//    @Override
//    public boolean addBodyMeasurement(BodyMeasurementDTO bodyMeasurementDTO) throws Exception {
//        return bodyMeasurementDAO.save(new Registration(
//                bodyMeasurementDTO.getRid(),
//                bodyMeasurementDTO.getName(),
//                bodyMeasurementDTO.getWeight(),
//                bodyMeasurementDTO.getHeight(),
//                bodyMeasurementDTO.getScheid(),
//
//        ));
//
//    }
//    @Override
//    public boolean updateAttendance(AttendanceDTO attendanceDTO) throws Exception {
//        return false;
//    }
//
//    @Override
//    public boolean deleteAttendance(String id) throws Exception {
//        return false;
//    }
//
//    @Override
//    public AttendanceDTO searchAttendance(String id) throws Exception {
//        return null;
//    }
//
//    @Override
//    public ArrayList<AttendanceDTO> getAll() throws Exception {
//        return null;
//    }
//}
