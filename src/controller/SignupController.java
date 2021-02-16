package controller;

import business.BOFactory;
import business.BOType;
import business.SuperBO;
import business.impl.LoginDetailsBOImpl;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import dto.LoginDetailsDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class SignupController {

    public JFXTextField txtUserName;
    public JFXPasswordField txtpassword;
    public Label lblLoginID;

    LoginDetailsBOImpl bo = BOFactory.getInstance().getBO(BOType.LoginDetailsBO);

    public void initialize() throws Exception {
        getLastID();
    }

    public void SignUpOnMouseClicked(MouseEvent mouseEvent) {
        String id = lblLoginID.getText();
        String name = txtUserName.getText();
        String password = txtpassword.getText();

        try {
            boolean b = bo.saveLoginDetails(new LoginDetailsDTO(id, name, password));
            if (b){
                new Alert(Alert.AlertType.CONFIRMATION,"Sign up Details Successfull added Then you login System..", ButtonType.OK).show();
             clear();
                Parent root = FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
              //  root = FXMLLoader.load(getClass().getClassLoader().getResource("path/to/other/view.fxml"), resources);
                Stage stage = new Stage();
               // stage.setTitle("My New Stage Title");
                stage.setScene(new Scene(root, 416, 354));
                stage.show();
            }else{
                new Alert(Alert.AlertType.ERROR,"Signup not success..", ButtonType.OK).show();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clearOnAction(ActionEvent actionEvent) {
       clear();
    }

    private void getLastID() throws Exception {
        String id = bo.getID();
        lblLoginID.setText(id);
    }

    private void clear(){
        txtUserName.clear();
        txtpassword.clear();
    }
}
