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

    public void initialize(){
        getAll();
    }

    private void getAll(){
        try {
            clmStid.setCellValueFactory(new PropertyValueFactory<StudentDTO,String>("studentID"));
            clmSname.setCellValueFactory(new PropertyValueFactory<>("studentName"));
            cmlSaddress.setCellValueFactory(new PropertyValueFactory<>("studentAddress"));
            clmScontact.setCellValueFactory(new PropertyValueFactory<>("studentContact"));
            clmSBirth.setCellValueFactory(new PropertyValueFactory<>("studentDOB"));
            clmSgender.setCellValueFactory(new PropertyValueFactory<>("studentGender"));
            List<StudentDTO> allStudent = bo.getAllStudent();

            tblStudent.setItems(FXCollections.observableArrayList(allStudent));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setColumn(){

    }
}
