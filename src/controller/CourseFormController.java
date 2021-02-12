package controller;

import business.BOFactory;
import business.BOType;
import business.impl.CourseBOImpl;
import com.jfoenix.controls.JFXTextField;
import dto.CourseDTO;
import entity.Register;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;

public class CourseFormController {
    public JFXTextField txtCourseCode;
    public JFXTextField txtCourseName;
    public JFXTextField txtCourseType;
    public JFXTextField txtCourseDuration;
    public Label lblNextCount;

    CourseBOImpl courseBO = BOFactory.getInstance().getBO(BOType.COURSEBO);

    public void initialize() throws Exception {
        getLastID();
    }

    public void saveOnAction(ActionEvent actionEvent) {
        String courseCode = lblNextCount.getText();
        String courseName = txtCourseName.getText();
        String courseType = txtCourseType.getText();
        String courseDuration = txtCourseDuration.getText();
        List<Register> registers = new ArrayList<>();

        try {
            CourseDTO courseDTO = new CourseDTO(courseCode, courseName, courseType, courseDuration, registers);
            boolean save = courseBO.save(courseDTO);
            if (save){
                new Alert(Alert.AlertType.CONFIRMATION,"Course Added..", ButtonType.OK).show();
                getLastID();
            }else{
                new Alert(Alert.AlertType.ERROR,"Course not Added..", ButtonType.OK).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getLastID() throws Exception {
        String id = courseBO.getID();
        lblNextCount.setText(id);
    }
}
