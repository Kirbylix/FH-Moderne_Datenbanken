package Datenhaltung;

import Fachkonzept.Event;
import Fachkonzept.Person;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kai on 24.04.2016.
 */
public class DBEvent {

    public List<Event> getAllFrom(Person person, Connection con){

        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(query);

        List<Person> personen = new ArrayList<Person>();
        while(rs.next()){
            personen.add(new Person(rs.getInt(1), rs.getString(2), rs.getString(3)));
        }


        String query = "SELECT * FROM Ereignis FROM ";





        List<Event> events = new ArrayList<Event>();
        while(rs.next()){
            events.add(new Person(rs.getInt(1), rs.getString(2), rs.getString(3)));
        }

        return events;
    }




    public void initTable(){
        /*
        INSERT INTO `Ereignis` (`idEreignis`, `Ort`, `Datum`, `Lebensbereich_idLebensbereich`, `Überschrift`, `Text`) VALUES (2, 'Camp Crystel Lake', '2014-02-24', 1, 'Ferienlager', 'Heute gab es im Ferienlager eine große Sauerei...');
        INSERT INTO `Ereignis` (`idEreignis`, `Ort`, `Datum`, `Lebensbereich_idLebensbereich`, `Überschrift`, `Text`) VALUES (3, 'Elm-Street', '2014-01-22', 1, 'Besuch bei Freunden', 'Heute habe ich zusammen mit Mimi unsere Freundin Tina besucht...');
        INSERT INTO `Ereignis` (`idEreignis`, `Ort`, `Datum`, `Lebensbereich_idLebensbereich`, `Überschrift`, `Text`) VALUES (4, 'Bochum', '2013-12-24', 1, 'Weihnachten', 'Heute habe ich von Mimi eine schöne Puppe zu Weihnachten bekommen blabla');
        INSERT INTO `Ereignis` (`idEreignis`, `Ort`, `Datum`, `Lebensbereich_idLebensbereich`, `Überschrift`, `Text`) VALUES (5, 'Haddonfield', '2013-10-31', 1, 'Halloween', 'Heute verbringe ich mit Sarah ein wirklich aufregendes Halloween blabla');
        */
    }
}
