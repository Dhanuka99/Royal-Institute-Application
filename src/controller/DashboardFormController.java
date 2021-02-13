package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

public class DashboardFormController {
    public Label lblStudent;
    public ImageView imgStudent;
    public Label lblCourse;
    public ImageView imgCourse;
    public Label lblReg;
    public ImageView imgReg;
    public Label lblDate;
    public Label lblTime;
    // public Pane mainPanel;

    @FXML
    private Pane mainPanel;

    public void initialize() throws IOException, ParseException {
        setDate();
        setTime();
        loadDefault();
    }

    public void studentOnMouseClicked(MouseEvent mouseEvent) throws IOException {
        setUi("StudentForm");
    }

    public void courseOnMouseClicked(MouseEvent mouseEvent) throws IOException {
        setUi("CourseForm");
    }

    public void registerOnMouseClicked(MouseEvent mouseEvent) throws IOException {
        setUi("StudentRegiterForm");

    }

    private void loadDefault() throws IOException {
setUi("StudentRegiterForm");

    }

    private void setUi(String location) throws IOException {
        mainPanel.getChildren().clear();
        mainPanel.getChildren().add(FXMLLoader.
                load((this.getClass()
                        .getResource("/view/" + location + ".fxml"))));
        // primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("view/LoginForm.fxml"))));
    }

    public void OnMouseEnter(MouseEvent mouseEvent) {

    }
    private void setDate() throws ParseException {
       // LocalTime localTime = new LocalTime();
        String date = LocalDate.now().toString();
        lblDate.setText(date);



    }

    private void setTime(){
        String s = LocalTime.now().toString();
        lblTime.setText(s);
    }
}
