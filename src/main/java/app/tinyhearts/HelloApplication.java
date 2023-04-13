package app.tinyhearts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, SQLException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        // Establish a connection to the database
        Connection conn = DriverManager.getConnection("jdbc:jtds:sqlserver://LAPTOP-5K0DBPI8:1433/projetoei;instance=EI26272;user=sa;password=123456");

        // Create a statement object
        Statement statement = conn.createStatement();

        // Execute a SQL query
        ResultSet resultSet = statement.executeQuery("SELECT * FROM CODPOSTAL");

        // Process the result set
        while (resultSet.next()) {
            String cdPostal = resultSet.getString("CODPOSTAL");
            String name = resultSet.getString("LOCALIDADE");
            System.out.println("CodPostal: " + cdPostal + ", Localidade: " + name);
        }

        // Close the resources
        resultSet.close();
        statement.close();
        conn.close();

    }

    public static void main(String[] args) {
        launch();
    }
}