import animatefx.animation.FadeIn;
import animatefx.animation.Pulse;
import entity.Course;
import entity.Register;
import entity.Student;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import util.FactoryConfiguration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Appinitializer extends Application {
    public static void main(String[] args) throws IOException {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent load = FXMLLoader.load(this.getClass().getResource("view/LoginForm.fxml"));
        new FadeIn(load).play();
        primaryStage.setScene(new Scene(load));
        primaryStage.show();


    }
}
