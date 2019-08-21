package lk.ijse.gms.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AttendanceController {

    @FXML
    private JFXButton BtnSave;

    @FXML
    private JFXButton BtnDelete;

    @FXML
    private JFXTextField TxtRid;

    @FXML
    private JFXTextField TxtArrivalTime;

    @FXML
    private JFXTextField TxtDepatureTime;

    @FXML
    private JFXDatePicker TxtDate;

    @FXML
    void BtnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void BtnSaveOnAction(ActionEvent event) {

    }

}
