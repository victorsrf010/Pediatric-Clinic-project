package app.tinyhearts.Controllers.Funcionario;

import app.tinyhearts.DatabaseUtil;
import app.tinyhearts.Identities.Utente;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PacientesController {

    public TableView<Utente> utente;
    public TableColumn<Utente, String> NOME;
    public TableColumn<Utente, String> NIF;

    public void initialize() throws SQLException {
        String query = "SELECT NOME, NIF FROM Utente order by NOME";

        ResultSet rs = DatabaseUtil.executeQuery(query);
        while (rs.next()) {
            String nome = rs.getString("NOME");
            String nif = rs.getString("NIF");
            Utente u = new Utente(nome, nif);
            utente.getItems().add(u);
        }

        NOME.setCellValueFactory(new PropertyValueFactory<>("nome"));
        NIF.setCellValueFactory(new PropertyValueFactory<>("nif"));
    }

}
