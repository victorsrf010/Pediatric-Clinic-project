package app.tinyhearts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

import java.sql.ResultSet;

import java.sql.*;

public class HelloController {

    @FXML
    private ListView<String> list;

    public void initialize() throws SQLException {

        // Establish a connection to the database
        Connection conn = DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433/projetoei;instance=DESKTOP-MUU271E;user=sa;password=123456");

        // Create a statement object
        Statement statement = conn.createStatement();

        // Execute a SQL query
        ResultSet resultSet = statement.executeQuery("SELECT * FROM CODPOSTAL");

        // Create an ObservableList to store the data
        ObservableList<String> items = FXCollections.observableArrayList();

        // Process the result set
        while (resultSet.next()) {
            String cdPostal = resultSet.getString("CODPOSTAL");
            String name = resultSet.getString("LOCALIDADE");
            String item = cdPostal + " - " + name;
            items.add(item);
        }

        // Set the items of the ListView to the ObservableList
        list.setItems(items);

        // Close the resources
        resultSet.close();
        statement.close();
        conn.close();
    }

}