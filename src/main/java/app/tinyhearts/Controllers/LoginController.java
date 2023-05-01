package app.tinyhearts.Controllers;

import app.tinyhearts.DatabaseUtil;
import app.tinyhearts.Identities.Utente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.sql.*;
import java.util.Objects;

public class LoginController {

    public TextField numFuncionario;
    public ImageView logo;
    public Button entrarButton;
    public PasswordField password;
    public Text errorText;

    public void initialize() {
        errorText.setText("");
    }
}
