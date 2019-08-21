package lk.ijse.gms.dao.custom.Impl;


import lk.ijse.gms.dao.CrudUtil;
import lk.ijse.gms.dao.custom.RegistrationDAO;
import lk.ijse.gms.dto.RegistrationDTO;
import lk.ijse.gms.entity.Registration;

import java.util.ArrayList;

public class RegistrationDAOImpl implements RegistrationDAO {


    @Override
    public boolean save(Registration varl) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO registration VALUES( ?,?,?,?,?,?,?,?); ",


                varl.getRid(),
                varl.getMid(),
                varl.getName(),
                varl.getAddress(),
                varl.getBirthday(),
                varl.getAge(),
                varl.getPhoneNum(),
                varl.getPayment())>0;
    }


    @Override
    public boolean update(Registration varl) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String varl) throws Exception {
        return false;
    }

    @Override
    public Registration search(String varl) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Registration> getAll() throws Exception {
        return null;
    }

    @Override
    public Integer lastIndex() throws Exception {
        return null;
    }

    @Override
    public Integer getIncrementIndex() throws Exception {
        return null;
    }
}


