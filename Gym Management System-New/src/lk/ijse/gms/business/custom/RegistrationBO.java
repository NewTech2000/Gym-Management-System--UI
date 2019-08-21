package lk.ijse.gms.business.custom;


import lk.ijse.gms.business.SuperBO;
import lk.ijse.gms.dto.RegistrationDTO;

import java.util.ArrayList;

public interface RegistrationBO extends SuperBO {
    boolean addRegistration(RegistrationDTO registrationDTO) throws Exception;

    boolean updateRegistration(RegistrationDTO registrationDTO) throws Exception;

    boolean deleteRegistration(String id) throws Exception;

      RegistrationDTO   searchRegistration(String id) throws Exception;

    ArrayList<RegistrationDTO> getAll() throws Exception;

}
