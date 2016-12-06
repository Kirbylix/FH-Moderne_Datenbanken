package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Person")
public class Person {

    @DatabaseField(columnName = "personId", id = true)
    private int id;
    @DatabaseField(columnName="Nachname")
    private String name;
    @DatabaseField(columnName="Vorname")
    private String vorname;
    @ForeignCollectionField(eager = false)
    ForeignCollection<Person> personen;

    public Person(){}



    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
        //beziehung = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /*public Map<Person, RelationshipType> getBeziehung() {
        return beziehung;
    }*/

    /*public void addBeziehung(Person person, RelationshipType beziehung){
        this.beziehung.put(person, beziehung);
    }*/

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Person))
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
