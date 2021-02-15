package controller;
import javafx.collections.FXCollections;
import business.BOFactory;
import business.BOType;
import business.impl.CourseBOImpl;
import dto.CourseDTO;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class ViewCourseFormController {

    @FXML
    private TableView<?> tblCourse;

    @FXML
    private TableView<CourseDTO> tblStudent;

    @FXML
    private TableColumn<CourseDTO, String> colCid;

    @FXML
    private TableColumn<CourseDTO, String> colCname;

    @FXML
    private TableColumn<CourseDTO, String> colCtype;

    @FXML
    private TableColumn<CourseDTO, String> colCduration;

    CourseBOImpl bo = BOFactory.getInstance().getBO(BOType.COURSEBO);

    private void getAllCourses() throws Exception {
        colCid.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        colCname.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        colCtype.setCellValueFactory(new PropertyValueFactory<>("courseType"));
        colCduration.setCellValueFactory(new PropertyValueFactory<>("courseDuration"));

        List<CourseDTO> allCourses = bo.getAllCourses();
      //  tblCourse.setItems(FXCollections.observableArrayList(allCourses));



    }

}
