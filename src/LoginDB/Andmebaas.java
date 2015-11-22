package LoginDB;

import java.sql.*;

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

    public void regisreeriKasutaja(String kasutajaNimi, String parool) {
        try {
            Statement stat = conn.createStatement();
            String sql = "INSERT INTO USER (USERNAME, PASSWORD) VALUES ('"+ kasutajaNimi +"', '"+ parool +"');";
            stat.executeUpdate(sql);
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void kuvaRead(String kasutajaNimi) {
        try {
            Statement stat = conn.createStatement();
            String sql = "SELECT * FROM USER WHERE USERNAME = '" + kasutajaNimi +"'";
            ResultSet results = stat.executeQuery(sql);

            String abKasutaja = results.getString("USERNAME");
            System.out.println(abKasutaja);

            stat.executeUpdate(sql);
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
