package controller;

import business.BOFactory;
import business.BOType;
import business.SuperBO;
import business.impl.StudentBOImpl;
import dto.StudentDTO;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import util.FactoryConfiguration;

import java.util.List;

public class ViewStudentFormController {
    @FXML
    private TableView<StudentDTO> tblStudent;

    @FXML
    private TableColumn<StudentDTO, String> clmStid;

    @FXML
    private TableColumn<StudentDTO, String> clmSname;

    @FXML
    private TableColumn<StudentDTO, String> cmlSaddress;

    @FXML
    private TableColumn<StudentDTO, String> clmScontact;

    @FXML
    private TableColumn<StudentDTO, String> clmSBirth;

    @FXML
    private TableColumn<StudentDTO, String> clmSgender;

    StudentBOImpl bo = BOFactory.getInstance().getBO(BOType.STUDENTBO);

    public void initialize() throws Exception {
        getAll();
    }

    private void getAll() throws Exception {

            clmStid.setCellValueFactory(new PropertyValueFactory<>("stID"));
            clmSname.setCellValueFactory(new PropertyValueFactory<>("name"));
            cmlSaddress.setCellValueFactory(new PropertyValueFactory<>("address"));
            clmScontact.setCellValueFactory(new PropertyValueFactory<>("contact"));
            clmSBirth.setCellValueFactory(new PropertyValueFactory<>("dob"));
            clmSgender.setCellValueFactory(new PropertyValueFactory<>("gender"));
            List<StudentDTO> allStudent = bo.getAllStudent();
        System.out.println(allStudent);
            tblStudent.setItems(FXCollections.observableArrayList(allStudent));



    }

    private void setColumn(){

    }
}
