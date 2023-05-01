package app.tinyhearts.Controllers;

import app.tinyhearts.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    public TextField numFuncionario;
    public ImageView logo;
    public Button entrarButton;
    public PasswordField password;
    public Text errorText;

    public void initialize() {
        errorText.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        entrarButton.setOnAction(actionEvent -> Model.getInstance().getViewFactory().showFuncionarioWindow());
    }
}
