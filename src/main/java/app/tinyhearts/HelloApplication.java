package app.tinyhearts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;
import java.io.IOException;

/**
 * desktop DB URL: jdbc:jtds:sqlserver://localhost:1433/projetoei;instance=DESKTOP-MUU271E;user=sa;password=123456
 * laptop  DB URL: jdbc:jtds:sqlserver://LAPTOP-5K0DBPI8:1433/projetoei;instance=EI26272;user=sa;password=123456
 * **/

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, SQLException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Tiny Hearts!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}