package lk.ijse.gms.business.custom.Impl;

import lk.ijse.gms.business.custom.RegistrationBO;
import lk.ijse.gms.dao.DAOFactory;
import lk.ijse.gms.dao.custom.Impl.RegistrationDAOImpl;
import lk.ijse.gms.dao.custom.RegistrationDAO;
import lk.ijse.gms.dto.RegistrationDTO;
import lk.ijse.gms.entity.Registration;

import java.util.ArrayList;

public class RegistrationBOImpl implements RegistrationBO {

    private RegistrationDAO registrationDAO = new RegistrationDAOImpl();

    public RegistrationBOImpl() {
        this.registrationDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REGISTATION);

    }


    @Override
    public boolean addRegistration(RegistrationDTO registrationDTO) throws Exception {
       return registrationDAO.save(new Registration(
               registrationDTO.getRid(),
               registrationDTO.getMid(),
               registrationDTO.getName(),
               registrationDTO.getAddress(),
               registrationDTO.getBirthday(),
               registrationDTO.getAge(),
               registrationDTO.getPhoneNum(),
               registrationDTO.getPayment()
       ));



    }

    @Override
    public boolean updateRegistration(RegistrationDTO registrationDTO) throws Exception {
        return false;
    }

    @Override
    public boolean deleteRegistration(String id) throws Exception {
        return registrationDAO.delete(id);
    }

    @Override
    public RegistrationDTO searchRegistration(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<RegistrationDTO> getAll() throws Exception {
        return null;
    }
}
