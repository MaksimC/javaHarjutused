package LoginDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by mtseljab on 22.11.15.
 */
public class Andmebaas {
    Connection conn;
    public Andmebaas() {
        seadistaAndmebaas();
    }

    private void seadistaAndmebaas() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:login.db");
            System.out.println("dababase successfully initialized");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void sulgeBaas() {
        try {
            conn.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void seadistaTabel() {
        try {
            Statement stat = conn.createStatement();
            String sql = "CREATE TABLE USER (ID INT AUTO_INCREMENT, USERNAME TEXT, PASSWORD TEXT, TELEFON TEXT, ADDRESS TEXT);";
            stat.executeUpdate(sql);
            stat.close();
            System.out.println("TABEL ON LOODUD");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
