package Datenhaltung;

import java.sql.*;

public class DBZugriff {

    private static final DBZugriff db = new DBZugriff();
    public static Connection con = null;
    private static final String DBPATH ="Z:/Dropbox/Repository/FH/Moderne_Datenbanken/DBs/SQLLite/tagebuch.db";

    /**
     * Konstruktor
     */
    public DBZugriff(){
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex){
            System.out.println("*** ClassNotFoundException:\n" + ex);
            ex.printStackTrace();
        }
        System.out.println("DBPATH:" + DBPATH);
    }

    public static DBZugriff getInstance(){
        return db;
    }

    /**
     * Datenbank Verbindung aufbauen
     */
    public void verbinden(){
        try {
            if(con != null){
                return;
            }
            System.out.println("Verbindung zur DB wird aufgebaut....");
            con = DriverManager.getConnection("jdbc:sqlite:" + DBPATH);

            if(!con.isClosed()){
                System.out.println("...Verbindung aufgebaut!");
            }
        }catch (SQLException ex){
            System.out.println("*** SQLException:\n" + ex);
            ex.printStackTrace();
        }
    }

    /**
     * Datenbank Verbindung schliessen
     */
    public void schliessen(){
        if(con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("*** SQLException:\n" + ex);
                ex.printStackTrace();
            }
        }
    }

    public void createDatabase(Connection con) throws Exception {
        DBPerson.initTable(con);
    }
}
