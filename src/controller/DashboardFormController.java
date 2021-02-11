package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.Objects;

public class DashboardFormController {
   // public Pane mainPanel;

    @FXML
    private Pane mainPanel;

    public void initialize() throws IOException {
      //  loadDefault();
    }

    public void studentOnMouseClicked(MouseEvent mouseEvent) throws IOException {
       // setUi("StudentForm");

    }

    public void courseOnMouseClicked(MouseEvent mouseEvent) {

    }

    public void registerOnMouseClicked(MouseEvent mouseEvent) throws IOException {
      //  setUi("StudentRegiterForm");
    }
    private void loadDefault() throws IOException {
    //  setUi("StudentRegiterForm");

    }

    private void setUi(String location) throws IOException {
     /*   mainPanel.getChildren().clear();
        mainPanel.getChildren().add(FXMLLoader.
                load((Objects.requireNonNull(this.getClass().getClassLoader()
                        .getResource("/view/" + location + ".fxml")))));*/
    }

}
