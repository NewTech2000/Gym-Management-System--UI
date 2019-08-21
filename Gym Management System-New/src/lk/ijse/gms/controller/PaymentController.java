package lk.ijse.gms.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class PaymentController implements Initializable {
    @FXML
    private JFXTextField TxtCustomerName;

    @FXML
    private JFXTextField TxtRid;

    @FXML
    private JFXTextField TxtTotal;

    @FXML
    private JFXTextField TxtCharge;

    @FXML
    private JFXTextField TxtDate;

    @FXML
    private JFXButton btnSave;

    @FXML
    private JFXButton btnDelete;

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {



    }


    }

