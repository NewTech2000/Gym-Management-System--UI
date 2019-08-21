package lk.ijse.gms.business.custom;

import lk.ijse.gms.dto.PaymentDTO;
import lk.ijse.gms.dto.RegistrationDTO;

import java.util.ArrayList;

public interface PaymentBO {
    boolean addPayment(PaymentDTO paymentDTO) throws Exception;

    boolean updatePayment(RegistrationDTO registrationDTO) throws Exception;

    boolean deletePayment(String id) throws Exception;

    PaymentDTO  searchPayment(String id) throws Exception;

    ArrayList<PaymentDTO> getAll() throws Exception;

}
