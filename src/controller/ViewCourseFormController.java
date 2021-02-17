package controller;
import javafx.collections.FXCollections;
import business.BOFactory;
import business.BOType;
import business.impl.CourseBOImpl;
import dto.CourseDTO;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import view.tm.CourseTM;

import java.util.List;

public class ViewCourseFormController {

    @FXML
    private TableView<CourseTM> tblCourse;

    @FXML
    private TableColumn<CourseTM, String> colCid;

    @FXML
    private TableColumn<CourseTM, String> colCname;

    @FXML
    private TableColumn<CourseTM, String> colCtype;

    @FXML
    private TableColumn<CourseTM, String> colCduration;

    CourseBOImpl bo = BOFactory.getInstance().getBO(BOType.COURSEBO);

    public void initialize() throws Exception {
        getAllCourses();
    }

    private void getAllCourses() throws Exception {
        colCid.setCellValueFactory(new PropertyValueFactory<>("cID"));
        colCname.setCellValueFactory(new PropertyValueFactory<>("cName"));
        colCtype.setCellValueFactory(new PropertyValueFactory<>("cType"));
        colCduration.setCellValueFactory(new PropertyValueFactory<>("cDuration"));

        List<CourseDTO> allCourses = bo.getAllCourses();
        ObservableList<CourseTM> list = FXCollections.observableArrayList();
        for (CourseDTO a : allCourses) {
            list.add(new CourseTM(
                    a.getcID(),
                    a.getcName(),
                    a.getcType(),
                    a.getcDuration()
            ));
        }
        System.out.println(list);
        tblCourse.setItems(list);


    }

}
