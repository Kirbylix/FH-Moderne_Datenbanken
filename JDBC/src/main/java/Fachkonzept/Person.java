package Fachkonzept;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kai on 18.04.2016.
 */
public class Person {
    private int id;
    private String firstname;
    private String name;
    private Map<Person, RelationshipType> relations;

    public Person(){}

    public Person(int id, String firstname, String name){
        this.id = id;
        this.firstname = firstname;
        this.name = name;
        relations = new HashMap<>();
    }

    public Person(String firstname, String name){
        this.firstname = firstname;
        this.name = name;
        relations = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getName() {
        return name;
    }

    public Map<Person, RelationshipType> getRelations() {
        return relations;
    }

    public void addRelation(Person person, RelationshipType relation){
        relations.put(person, relation);
    }

    public void addBidirectionalRelation(Person person, RelationshipType relation){
        relations.put(person, relation);
        person.addRelation(this, relation);
    }

    public void addBidirectionalRelation(Person person, RelationshipType relation, RelationshipType backRelation){
        relations.put(person, relation);
        person.addRelation(this, backRelation);
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
