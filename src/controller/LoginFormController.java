package controller;

import animatefx.animation.Pulse;
import business.BOFactory;
import business.BOType;
import business.SuperBO;
import business.impl.LoginDetailsBOImpl;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import dto.LoginDetailsDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
    public JFXTextField txtUserID;
    LoginDetailsBOImpl bo = BOFactory.getInstance().getBO(BOType.LoginDetailsBO);

    public void initialize(){
     /*   img.setImage(new Image(""));

        imgEye.setImage(new Image(""));*/
    }

    public void loginOnAction(MouseEvent event) throws Exception {

        String userName=txtUserName.getText().trim();
        String password= PSpassword.getText().trim();
        /*start Login */
        if (userName.length()>0 && password.length()>0){
            LoginDetailsDTO search = bo.search(txtUserID.getText());
            if (search!=null){
                if (password.equalsIgnoreCase(PSpassword.getText())
                        && password.equals(search.getLoginPassword())){
                    Stage window = (Stage) this.root.getScene().getWindow();

                    try {
                        Parent root =  FXMLLoader.load(this.getClass().getResource("../view/DashboardForm.fxml"));
                        new Pulse(root).play();
                        window.setScene(new Scene(root));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    window.centerOnScreen();
            } new Alert(Alert.AlertType.WARNING, "password incorrect",
                        ButtonType.OK).show();
            }else{
                new Alert(Alert.AlertType.WARNING, "ID not Available",
                        ButtonType.OK).show();
            }
        }else{
            new Alert(Alert.AlertType.WARNING, "User Name Or Password Empty!",
                    ButtonType.OK).show();
        }
    }
    /*End Login */

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

    public void SignUpOnMouseClicked(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("../view/SignUpForm.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root,416,354));
        stage.show();
    }
}
