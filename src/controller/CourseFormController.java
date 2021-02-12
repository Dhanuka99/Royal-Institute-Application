package controller;

import business.BOFactory;
import business.BOType;
import business.SuperBO;
import business.impl.CourseBOImpl;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;

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


    }
}
