package app.tinyhearts.Controllers;

import app.tinyhearts.Model;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.controlsfx.control.PropertySheet;

public class QuitConfirmationController extends Application {

    public Button yesButton;
    public Button returnButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        yesButton.setOnAction(actionEvent -> quit());
    }

    public void quit() {
        Stage stage = (Stage) returnButton.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);


    }
}
