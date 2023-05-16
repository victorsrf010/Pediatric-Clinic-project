module app.tinyhearts {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires java.sql;
    requires jakarta.persistence;

    opens app.tinyhearts to javafx.fxml;
    opens app.tinyhearts.Controllers to javafx.fxml;
    opens app.tinyhearts.Controllers.Funcionario to javafx.fxml;
    opens app.tinyhearts.Identities to javafx.base;
    exports app.tinyhearts;
    exports app.tinyhearts.Controllers;
}