package app.tinyhearts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

/**
 * desktop DB URL: jdbc:jtds:sqlserver://localhost:1433/projetoei;instance=DESKTOP-MUU271E;user=sa;password=123456
 * laptop  DB URL: jdbc:jtds:sqlserver://LAPTOP-5K0DBPI8:1433/projetoei;instance=EI26272;user=sa;password=123456
 * **/

public class DatabaseUtil {

    // Establish a connection to the database
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433/projetoei;instance=DESKTOP-MUU271E;user=sa;password=123456");
    }

    // Retrieve data from the database
    public static ObservableList<ObservableList<String>> getData(String query) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ObservableList<ObservableList<String>> data = FXCollections.observableArrayList();

        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);

            ResultSetMetaData metaData = rs.getMetaData();
            int numColumns = metaData.getColumnCount();
            ObservableList<String> columnNames = FXCollections.observableArrayList();

            // Add column names to the list
            for (int i = 1; i <= numColumns; i++) {
                columnNames.add(metaData.getColumnLabel(i));
            }
            data.add(columnNames);

            // Add rows to the list
            while (rs.next()) {
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= numColumns; i++) {
                    row.add(rs.getString(i));
                }
                data.add(row);
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

        return data;
    }

    public static ResultSet executeQuery(String query) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return rs;
    }


}
