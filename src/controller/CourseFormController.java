package controller;

import business.BOFactory;
import business.BOType;
import business.SuperBO;
import business.custom.CourseBO;
import business.impl.CourseBOImpl;
import com.jfoenix.controls.JFXTextField;
import dto.CourseDTO;
import entity.Course;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class CourseFormController {
    public JFXTextField txtCourseCode;
    public JFXTextField txtCourseName;
    public JFXTextField txtCourseType;
    public JFXTextField txtCourseDuration;

     CourseBOImpl courseBO = BOFactory.getInstance().getBO(BOType.COURSEBO);

    public void saveOnAction(ActionEvent actionEvent) {
        String courseCode = txtCourseCode.getText();
        String courseName = txtCourseName.getText();
        String courseType = txtCourseType.getText();
        String courseDuration = txtCourseDuration.getText();

        try {
            boolean save = courseBO.save(new CourseDTO(courseCode, courseName, courseType, courseDuration));
            if (save){
                new Alert(Alert.AlertType.CONFIRMATION,"Course Added..", ButtonType.OK).show();
            }else{
                new Alert(Alert.AlertType.ERROR,"Course not Added..", ButtonType.OK).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
