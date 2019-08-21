package lk.ijse.gms.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private JFXTextField txtUserName;

    @FXML
    private JFXPasswordField txtPassword;

    @FXML
    private JFXButton btnLogin;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
  <parent>  void btnLoginOnAction(ActionEvent actionEvent) throws Exception {
//        Parent parent = FXMLLoader.load(getClass().getResource("/lk/ijse/gms/view/Dashboard.fxml"));
//        Scene scene = new Scene(parent);
//        Stage mainStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//        mainStage.setScene(scene);
//        mainStage.setWidth(1366);
//        mainStage.setHeight(768);
//        mainStage.centerOnScreen();
//        mainStage.show();
//
//        if (txtUserName.getText().equals("1") && txtPassword.getText().equals("1")) {
//            Parent parent1 = FXMLLoader.load(getClass().getResource("/lk/ijse/gms/view/Dashboard.fxml"));
//            Scene mainScene1 = new Scene(parent);
//            mainStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//            mainStage.setScene(scene);
//            mainStage.centerOnScreen();
//            mainStage.show();}
//        } else {
//            if (!(txtUserName.getText().equals("1"))) {
//                Alert alert = new Alert(Alert.AlertType.ERROR, "Incorrect User Name");
//                alert.show();
//            } else if
//            (!(txtPassword.getText().equals("1"))) {
//                Alert alert = new Alert(Alert.AlertType.ERROR, "Incorrect Password");
//                alert.show();

//            Alert alert = new Alert(Alert.AlertType.ERROR, "Incorrect Password OR User Name", new ButtonType[]{JFXButton.ButtonType.OK});
//            alert.show();


        if (this.txtUserName.getText().equals("admin") && this.txtPassword.getText().equals("admin")) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/lk/ijse/gms/view/Dashboard.fxml"));
                parent root = fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Home ");
                stage.initStyle(StageStyle.DECORATED);
                stage.setScene(new Scene((Parent)root));
                stage.show();
                stage = (Stage)this.btnLogin.getScene().getWindow();
                stage.close();
            } catch (Exception var5) {
                ;
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Incorrect Password OR User Name", new ButtonType[]{ButtonType.OK});
            alert.show();
        }




}


}
