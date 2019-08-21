// package lk.ijse.gms.business.custom.Impl;
//
//import lk.ijse.gms.business.custom.AttendanceBO;
//import lk.ijse.gms.dao.DAOFactory;
//import lk.ijse.gms.dao.custom.AttendanceDAO;
//import lk.ijse.gms.dao.custom.Impl.AttendanceDAOImpl;
//import lk.ijse.gms.dao.custom.Impl.RegistrationDAOImpl;
//import lk.ijse.gms.dao.custom.PaymentDAO;
//import lk.ijse.gms.dao.custom.RegistrationDAO;
//import lk.ijse.gms.dto.AttendanceDTO;
//import lk.ijse.gms.dto.RegistrationDTO;
//import lk.ijse.gms.entity.Registration;
//
//import java.util.ArrayList;
//
//
// public class AttendanceBOImpl implements AttendanceBO {
//
//    private AttendanceDAO attendanceDAO = new AttendanceDAOImpl();
//
//
//    public AttendanceBOImpl() {
//        this.attendanceDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REGISTATION);
//
//    }
//
//
//    @Override
//    public boolean addRegistration(RegistrationDTO registrationDTO) throws Exception {
//        return attendanceDAO.save(new Registration(
//                registrationDTO.getRid(),
//                registrationDTO.getMid(),
//                registrationDTO.getName(),
//                registrationDTO.getAddress(),
//               registrationDTO.getBirthday(),
//                registrationDTO.getAge(),
//                registrationDTO.getCon(),
//                registrationDTO.getPayment()
//        ));
//
//   }
//
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
//   @Override
//   public ArrayList<AttendanceDTO> getAll() throws Exception {
//        return null;
//    }
// }
//
//
