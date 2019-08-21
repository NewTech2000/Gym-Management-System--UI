package lk.ijse.gms.controller;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import lk.ijse.gms.business.custom.Impl.RegistrationBOImpl;
import lk.ijse.gms.business.custom.RegistrationBO;
import lk.ijse.gms.common.Common;
import lk.ijse.gms.dto.RegistrationDTO;
import java.net.URL;
import java.util.ResourceBundle;

public class RegistrationController implements Initializable {


    @FXML
    private JFXButton TxtDelete;

    @FXML
    private JFXButton TxtAdd;

    @FXML
    private JFXTextField TxtMid;

    @FXML
    private JFXTextField TxtBirthday;

    @FXML
    private JFXTextField TxtAddress;

    @FXML
    private JFXTextField TxtName;

    @FXML
    private JFXTextField TxtRid;

    @FXML
    private JFXTextField TxtAge;

    @FXML
    private JFXTextField TxtPhoneNum;

    @FXML
    private JFXTextField TxtPayment;

    private RegistrationBO registrationBO=new RegistrationBOImpl();

    @FXML
    void AddbtnOnAction(ActionEvent event) {
        RegistrationDTO registrationDTO =new  RegistrationDTO(

                TxtMid.getText(),
                TxtRid.getText(),
                TxtName.getText(),
                TxtAddress.getText(),
                TxtBirthday.getText(),
                TxtAge.getText(),
                TxtPhoneNum.getText(),
                TxtPayment.getText()
                );
        try {
            boolean b = registrationBO.addRegistration(registrationDTO);
            System.out.println(b);

            if (b)
                Common.showMessage("ADDED!");
        } catch (Exception e1) {
            Common.showError("NOT added");
            e1.printStackTrace();
        }
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}


