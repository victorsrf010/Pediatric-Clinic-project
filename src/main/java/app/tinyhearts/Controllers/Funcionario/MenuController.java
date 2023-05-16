package app.tinyhearts.Controllers.Funcionario;

import app.tinyhearts.Controllers.QuitConfirmationController;
import app.tinyhearts.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {
    public Button inicioButton;
    public Button pacientesButton;
    public Button perfilButton;
    public Button consultasButton;
    public Button definicoesButton;
    public Button desconectarButton;
    public Text time;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String currentTime = LocalTime.now().format(formatter);
            time.setText(currentTime);
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

        desconectarButton.setOnAction(actionEvent -> onClose());
    }

    private void onClose() {
        Stage stage = (Stage) time.getScene().getWindow();
        Model.getInstance().getViewFactory().showQuitConfirmation();


    }

}
