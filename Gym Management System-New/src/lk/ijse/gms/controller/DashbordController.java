package lk.ijse.gms.controller;


import com.jfoenix.controls.JFXButton;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
public class DashbordController implements Initializable {

    @FXML
    private AnchorPane root;

    @FXML
    private Label lbldate;

    @FXML
    private Label lbltime;

    @FXML
    private JFXButton btRegistation;

    @FXML
    private JFXButton btPayment;

    @FXML
    private JFXButton btAttendance;

    @FXML
    private JFXButton btBodyMeasurement;

    @FXML
    private JFXButton btSchedule;

    @FXML
    private AnchorPane lodepanal;

    @FXML
    private  void btRegistation_onAction() throws Exception{
        AnchorPane load = FXMLLoader.load(this.getClass().getResource("/lk/ijse/gms/view/RegistrationForm.fxml"));
        lodepanal.getChildren().setAll(load);
    }

//    private void loadabc() throws IOException {
//        AnchorPane registrationPanel = FXMLLoader.load(this.getClass().getResource("/lk/ijse/gms/view/RegistrationForm.fxml"));
//        root.getChildren().setAll(registrationPanel);
//    }
//
//    public void btRegistation_onAction(ActionEvent event) throws Exception {
//        loadRegistrationPanel();
//    }

    @FXML
    public void btPayment_onAction(ActionEvent event) throws Exception {
        AnchorPane load = FXMLLoader.load(this.getClass().getResource("/lk/ijse/gms/view/PaymentSheet.fxml"));
        lodepanal.getChildren().setAll(load);
    }

    @FXML
    public void btAttendance_onAction(ActionEvent event) throws Exception{
        AnchorPane load = FXMLLoader.load(this.getClass().getResource("/lk/ijse/gms/view/AttendanceForm.fxml"));
        lodepanal.getChildren().setAll(load);
    }

    @FXML
    public void btBodyMeasurement_onAction(ActionEvent event) throws Exception{
        AnchorPane load = FXMLLoader.load(this.getClass().getResource("/lk/ijse/gms/view/BodyMeasurementForm.fxml"));
        lodepanal.getChildren().setAll(load);
    }


    @FXML
    public void btSchedule_onAction(ActionEvent event)throws Exception {
        AnchorPane load = FXMLLoader.load(this.getClass().getResource("/lk/ijse/gms/view/ScheduleForm.fxml"));
        lodepanal.getChildren().setAll(load);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setTimeDate();
//        try {
//            loadRegistrationPanel();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    private void setTimeDate() {
        Timeline newTimeLine = new Timeline(new KeyFrame(Duration.seconds(0), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lbldate.setText(new SimpleDateFormat("YYYY-MM-dd").format(new Date()));
                lbltime.setText(new SimpleDateFormat("hh:mm:ss a").format(new Date()));
            }

        }), new KeyFrame(Duration.seconds(1)));
        newTimeLine.setCycleCount(Animation.INDEFINITE);
        newTimeLine.play();
    }


}
