package controller;

import business.BOFactory;
import business.BOType;
import business.SuperBO;
import business.impl.RegisterBOImpl;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import dao.DAOType;
import entity.Course;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class StudentRegisterFormController {
    public Label lblRegisterID;
    public Label lblCid;
    public Label lblCname;
    public Label lblType;
    public Label lblDuration;
    public JFXTextField txtRegisterID;
    public JFXTextField txtregisterFee;
    public TableView tblCourses;
    public JFXButton btnRemoveCourse;
    public JFXDatePicker registerDate;
    public JFXTextField txtSearchCourse;
    public JFXButton btnAdductors;

    RegisterBOImpl bo = BOFactory.getInstance().getBO(BOType.REGISTERBO);

    public void lblSearchMouseClicked(MouseEvent mouseEvent) {
        String id = txtSearchCourse.getText();
        try {
            Course course = bo.searchCourse(id);
            if (course!=null){
                lblCid.setText(course.getCourseCode());
                lblCname.setText(course.getCourseName());
                lblDuration.setText(course.getDuration());
                lblType.setText(course.getCourseType());
            }else{
                new Alert(Alert.AlertType.ERROR,"Course Not Found", ButtonType.OK).show();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void RegisterMouseClicked(MouseEvent mouseEvent) {
    }
}
