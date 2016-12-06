import Datenhaltung.DBPerson;
import Datenhaltung.DBZugriff;
import Fachkonzept.Person;

import java.sql.SQLException;
import java.util.List;

public class main {

    public static void main(String args[]){
        System.out.println("START");

        DBZugriff db = DBZugriff.getInstance();
        db.verbinden();

        //Person hinzufügen
        Person p1 = new Person("Kai", "Kappis");
        try {
            int anzahl = DBPerson.insert(p1, db.con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Personen anzeigen
        List<Person> personen = null;
        try {
            personen = DBPerson.getAll(db.con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for(Person p: personen){
            System.out.println(p.toString());
        }

        db.schliessen();
        System.out.println("ENDE");
    }
}