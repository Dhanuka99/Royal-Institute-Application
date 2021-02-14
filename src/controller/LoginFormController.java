package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public JFXPasswordField PSpassword;
    public JFXTextField txtUserName;
    public ImageView img;
    public AnchorPane root;
    public ImageView imgEye;
    public JFXTextArea label;


    public void initialize(){
     /*   img.setImage(new Image(""));

        imgEye.setImage(new Image(""));*/
    }

    public void loginOnAction(MouseEvent event) {

        String userName=txtUserName.getText().trim();
        String password= PSpassword.getText().trim();

        if (userName.length()>0 && password.length()>0){
            if (userName.equalsIgnoreCase("Dhanuka")
                    && password.equals("1234")){
                /*start Login */

                Stage window = (Stage) this.root.getScene().getWindow();
                try {
                    window.setScene(new Scene(FXMLLoader.load((this.getClass()
                            .getResource("/view/DashboardForm.fxml")))));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                window.centerOnScreen();

                /*End Login */
            }else{
                new Alert(Alert.AlertType.WARNING, "Try Again!",
                        ButtonType.OK).show();
            }
        }else{
            new Alert(Alert.AlertType.WARNING, "User Name Or Password Empty!",
                    ButtonType.OK).show();
        }
    }

    public void clearOnAction(ActionEvent event) {
        txtUserName.clear();
        PSpassword.clear();
        label.clear();
    }

    public void eyeClickedOnAction(MouseEvent mouseEvent) {
        label.appendText(PSpassword.getText());
    }

    public void eyePressesOnAction(MouseEvent mouseEvent) {

    }

    public void eyeReleasedOnAction(MouseEvent mouseEvent) {
    }
}
