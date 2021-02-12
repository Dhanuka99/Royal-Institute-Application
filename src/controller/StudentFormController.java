package controller;

import business.BOFactory;
import business.BOType;
import business.impl.StudentBOImpl;
import com.jfoenix.controls.JFXTextField;
import dto.StudentDTO;
import entity.Register;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class StudentFormController {
    public JFXTextField txtStudentName;
    public JFXTextField txtStudentAddress;
    public JFXTextField txtStudentContact;
    public JFXTextField txtDOB;
    public Label lblNextCount;
    public JFXTextField txtGender;

    StudentBOImpl bo = BOFactory.getInstance().getBO(BOType.STUDENTBO);

    public void initialize() throws Exception {
        LoadLastId();
    }

    public void saveOnAction(ActionEvent actionEvent) {
        String sid = lblNextCount.getText();
        String name = txtStudentName.getText();
        String address = txtStudentAddress.getText();
        String contact = txtStudentContact.getText();
        String dob = txtDOB.getText();
        String gender = txtGender.getText();

        ArrayList<Register> objects = new ArrayList<>();
        StudentDTO studentDTO = new StudentDTO(sid, name,address,contact,dob,gender,objects);
        try {
            boolean save = bo.save(studentDTO);
            if (save){
                new Alert(Alert.AlertType.CONFIRMATION,"Student Added..", ButtonType.OK).show();
                LoadLastId();
            }else{
                new Alert(Alert.AlertType.ERROR,"Student not Added..",ButtonType.OK).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void LoadLastId() throws Exception {
        String id = bo.getID();
        lblNextCount.setText(id);
    }
}
