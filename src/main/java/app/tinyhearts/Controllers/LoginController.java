package app.tinyhearts.Controllers;

import app.tinyhearts.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    public TextField numFuncionario;
    public ImageView logo;
    public Button entrarButton;
    public PasswordField password;
    public Text errorText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        entrarButton.setOnAction(actionEvent -> onLogin());
    }

    private void onLogin() {
        Stage stage = (Stage) errorText.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showFuncionarioWindow();
    }

}
