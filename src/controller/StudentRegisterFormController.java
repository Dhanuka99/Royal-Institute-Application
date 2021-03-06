package controller;

import business.BOFactory;
import business.BOType;
import business.SuperBO;
import business.impl.RegisterBOImpl;
import business.impl.StudentBOImpl;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.sun.javafx.css.CssError;
import dao.DAOType;
import dto.CourseDTO;
import dto.RegisterDTO;
import dto.StudentDTO;
import entity.Course;
import entity.Register;
import entity.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentRegisterFormController {
    public Label lblRegisterID;
    public Label lblCid;
    public Label lblCname;
    public Label lblType;
    public Label lblDuration;
    public JFXButton btnRemoveCourse;
    public JFXDatePicker registerDate;
    public JFXTextField txtSearchCourse;
    public JFXButton btnAdductors;
    public JFXTextField txtSearchStudentID;
    public Label lblsid;
    public Label lblsname;
    public TableColumn cmbRegFee;
    public Label lblName;
    public Label lblAddress;
    public Label lblDOB;
    public JFXTextField txtregisterFee;
    public Label lblname;
    public Label lblcuName;
    public Label lblstName;
    private List<RegisterDTO> itemList = new ArrayList<>();

    @FXML
    private TableView<RegisterDTO> tblCourses;

    @FXML
    private TableColumn<RegisterDTO, String> cmbRegID;

    @FXML
    private TableColumn<RegisterDTO, String> cmbStudentID;

    @FXML
    private TableColumn<RegisterDTO, String> cmbCourseID;

    @FXML
    private TableColumn<RegisterDTO, String> cmbRegDate;


    RegisterBOImpl bo = BOFactory.getInstance().getBO(BOType.REGISTERBO);
    StudentBOImpl Studentbo = BOFactory.getInstance().getBO(BOType.STUDENTBO);

    public void initialize(){
        genarateID();
    }

    private void setTableColumn() {
        cmbRegID.setCellValueFactory(new PropertyValueFactory<RegisterDTO, String>("regNo"));
        cmbCourseID.setCellValueFactory(new PropertyValueFactory<RegisterDTO, String>("courseCode"));
        cmbStudentID.setCellValueFactory(new PropertyValueFactory<RegisterDTO, String>("studentID"));
        cmbRegDate.setCellValueFactory(new PropertyValueFactory<RegisterDTO, String>("regDate"));
        cmbRegDate.setCellValueFactory(new PropertyValueFactory<RegisterDTO, String>("regFee"));

    }

    public void lblSearchMouseClicked(MouseEvent mouseEvent) {
        String id = txtSearchCourse.getText();
        try {
            Course course = bo.searchCourse(id);
            if (course != null) {
                lblCid.setText(course.getCourseCode());
                lblcuName.setText(course.getCourseName());
                lblDuration.setText(course.getDuration());
                lblType.setText(course.getCourseType());
            } else {
                new Alert(Alert.AlertType.ERROR, "Course Not Found", ButtonType.OK).show();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void genarateID(){
        try {
            String lastID = bo.getLastID();
            lblRegisterID.setText(lastID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void RegisterMouseClicked(MouseEvent mouseEvent) {

        String rid = lblRegisterID.getText();
        String sid = lblsid.getText();
        String cid = lblCid.getText();
        String date = registerDate.getValue().toString();
        double fee = Double.parseDouble(txtregisterFee.getText());


        RegisterDTO registerDTO = new RegisterDTO(rid, sid, cid, date, fee);
        try {
            boolean b = bo.saveRegistration(registerDTO);
            if (b){
                new Alert(Alert.AlertType.CONFIRMATION,"Registration Successfully",ButtonType.OK).show();
                genarateID();
                clear();
            }else{
                new Alert(Alert.AlertType.CONFIRMATION,"Registration not Successfully",ButtonType.OK).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void removeOnAction(ActionEvent actionEvent) {
    }

/*    private int isExist(String code) {
        for (int i = 0; i < tblCourses.getItems().size(); i++) {
            if (code.equals(tblCourses.getItems().get(i).getRegID())) {
                return i;
            }
        }
        return -1;
    }*/

/*
    public void AddCourseOnAction(ActionEvent actionEvent) {

        System.out.println("111111");
        int isExistRow = isExist("0");
        System.out.println("222222");
        System.out.println("is exist"+ isExistRow);
        if (isExistRow == -1) {
            String regID = lblRegisterID.getText();
            String cid = lblCid.getText();
            String sid = lblsid.getText();
            String date = registerDate.getValue().toString();
            double fee = Double.parseDouble(cmbRegFee.getText());
            RegisterDTO registerDTO = new RegisterDTO(regID, sid, cid, date, fee);
            tblCourses.getItems().add(registerDTO);
            setTableColumn();

//     Update new ItemRow
           String rid = tblCourses.getSelectionModel().getSelectedItem().getRegID();
            String stid = tblCourses.getSelectionModel().getSelectedItem().getStID();
            String csid = tblCourses.getSelectionModel().getSelectedItem().getcID();
            String date2 = tblCourses.getSelectionModel().getSelectedItem().getRegDate();
            double fee3 = tblCourses.getSelectionModel().getSelectedItem().getFee();

            RegisterDTO item = new RegisterDTO(rid,stid,csid,date2,fee3);
            itemList.add(item);


        }


    }
*/

    public void studentSearchOnAction(MouseEvent mouseEvent) {
        String sid = txtSearchStudentID.getText();

        try {
            Student s = Studentbo.search(sid);
            if (s != null) {
                lblsid.setText(s.getStudentID());
                lblstName.setText(s.getStudentName());
                lblAddress.setText(s.getStudentAddress());
                lblDOB.setText(s.getStudentDOB());

            } else {
                new Alert(Alert.AlertType.ERROR, "Student Not Found..", ButtonType.OK).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void AddCourseOnAction(ActionEvent actionEvent) {
    }

    private void clear(){
        txtregisterFee.clear();
        txtSearchCourse.clear();

    }
}
