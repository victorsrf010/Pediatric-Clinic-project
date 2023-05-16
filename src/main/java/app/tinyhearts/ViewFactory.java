package app.tinyhearts;

import app.tinyhearts.Controllers.Funcionario.FuncionarioController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {

    //Vistas funcionario

    private AnchorPane dashboardView;

    public ViewFactory() {

    }

    public AnchorPane getDashboardView() {
        if (dashboardView == null) {
            try {
                dashboardView = new FXMLLoader(getClass().getResource("FXML/Funcionario/dashboard.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dashboardView;
    }

    public void showLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/login.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("TinyHearts");
        stage.show();
    }

    public void showFuncionarioWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/Funcionario/funcionario.fxml"));
        FuncionarioController funcionarioController = new FuncionarioController();
        loader.setController(funcionarioController);
        createStage(loader);
    }

    public void showQuitConfirmation() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/quitConfirmation.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("TinyHearts");
        stage.show();
    }

    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("TinyHearts");
        stage.setMaximized(true);
        stage.show();
    }

    public void closeStage(Stage stage) {
        stage.close();
    }

}
