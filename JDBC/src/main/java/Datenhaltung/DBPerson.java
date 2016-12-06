package Datenhaltung;

import Fachkonzept.Person;
import Fachkonzept.RelationshipType;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DBPerson{

    public static void initTable(Connection connection) throws Exception {
        //String dropSql = "DROP TABLE IF EXISTS Person";
        // String dropSql = new
        // SqlLanguage().Drop().Table().If().Exists().S("Person").toString();
        String createSql = "CREATE TABLE IF NOT EXISTS Person (idPerson INT NOT NULL PRIMARY KEY, Nachname VARCHAR(45) NULL, Vorname VARCHAR(45) NULL)";
        // String createSql = new
        // SqlLanguage().Create().Table().If().Not().Exists().S("Person
        // (idPerson INT NOT NULL PRIMARY KEY, Nachname VARCHAR(45) NULL,
        // Vorname VARCHAR(45) NULL)").toString();
        //connection.createStatement().executeUpdate(dropSql);
        connection.createStatement().executeUpdate(createSql);
    }


    public static int insert(Person obj, Connection con) throws Exception {
        String query =" INSERT INTO Person (Nachname, Vorname) VALUES (?, ?)";
        PreparedStatement stm = con.prepareStatement(query);
        stm.setString(1, obj.getName());
        stm.setString(2, obj.getFirstname());
        int anzahl = stm.executeUpdate();
        return anzahl;
    }


    public int update(Person obj, Connection con) throws Exception {
        String query = "UPDATE Person SET Nachname = ?, Vorname = ? WHERE idPerson = ?";
        PreparedStatement stm = con.prepareStatement(query);
        stm.setString(1, obj.getName());
        stm.setString(2, obj.getFirstname());
        stm.setInt(3, obj.getId());
        int anzahl = stm.executeUpdate();
        return anzahl;
    }


    public void delete(Person obj, Connection persistence) throws Exception {
        String updateSql = "DELETE FROM Person WHERE idPerson = ?";
        PreparedStatement stm = persistence.prepareStatement(updateSql);
        stm.setInt(1, obj.getId());
        stm.executeQuery();
    }


    public Person select(Person obj, Connection connection) throws Exception {
        Person person = null;
        String sql = "SELECT idPerson, Nachname, Vorname FROM Person WHERE idPerson = ?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setInt(1, obj.getId());
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            person = new Person(rs.getInt("idPerson"), rs.getString("Vorname"), rs.getString("Nachname"));
        }
        return person;
    }



    public void selectWithId(int id, Connection con){
        //TODO
    }

    public static List<Person> getAll(Connection con) throws SQLException {
        String query = "SELECT * FROM Person";
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(query);

        List<Person> personen = new ArrayList<Person>();
        while(rs.next()){
            personen.add(new Person(rs.getInt(1), rs.getString(2), rs.getString(3)));
        }
        return personen;
    }

}
