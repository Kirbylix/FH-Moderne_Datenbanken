package dao;

import Fachkonzept.Event;

import java.sql.Connection;


public class EventDao{


    public void initTable(Connection connection) throws Exception {
        String dropSql = "DROP TABLE IF EXISTS Ereignis";
        String createSql = "CREATE  TABLE IF NOT EXISTS Ereignis (" + "idEreignis INT NOT NULL ,"
                + "Ort VARCHAR(45) NULL ," + "Datum DATE NULL ," + "Lebensbereich_idLebensbereich INT NULL ,"
                + "Überschrift VARCHAR(100) NULL ," + "Text VARCHAR(250) NULL ," + "PRIMARY KEY (idEreignis) ,"
                + "CONSTRAINT fk_Ereignis_Lebensbereich1" + " FOREIGN KEY (Lebensbereich_idLebensbereich)"
                + "  REFERENCES Lebensbereich (idLebensbereich)" + "  ON DELETE NO ACTION" + "  ON UPDATE NO ACTION)";
        connection.createStatement().executeUpdate(dropSql);
        connection.createStatement().executeUpdate(createSql);
    }


    public void create(Event obj, Connection connection) throws Exception {
        // TODO Auto-generated method stub

    }


    public void update(Event obj, Connection connection) throws Exception {
        // TODO Auto-generated method stub

    }


    public void delete(Event obj, Connection connection) throws Exception {
        // TODO Auto-generated method stub

    }

    public Event select(Event obj, Connection connection) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}
