//package lk.ijse.gms.dao.custom.Impl;
//
//import lk.ijse.gms.dao.CrudUtil;
//import lk.ijse.gms.dao.custom.BodyMeasurementDAO;
//import lk.ijse.gms.entity.Bodymeasurement;
//
//import java.util.ArrayList;
//
//
//public class BodyMeasurementDAOImpl implements BodyMeasurementDAO {
//    public boolean save(Bodymeasurement varl) throws Exception {
//       return CrudUtil.executeUpdate("INSERT INTO bodymeasurement VALUES(?,?,?,?,); ",
//                varl.getRid(),
//                varl.getName(),
//               varl.getWeight(),
//                varl.getHeight(),
//                varl.getScheid()) >0;
//    }
//
//    @Override
//    public boolean update(Bodymeasurement varl) throws Exception {
//        return false;
//    }
//    @Override
//    public boolean delete(String varl) throws Exception {
//       return false;
//    }
//
//    @Override
//    public Bodymeasurement search(String varl) throws Exception {
//        return null;
//    }
//
// @Override
//  public ArrayList<Bodymeasurement
//           > getAll() throws Exception {
//     return null;
//  }
//
//   @Override
//    public Integer lastIndex() throws Exception {
//        return null;
//    }
//
//   @Override
//    public Integer getIncrementIndex() throws Exception {
//        return null;
//    }
//
//
//}
