package dao;

import model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    List<Person> personen;

    public PersonDaoImpl(){
        personen = new ArrayList<Person>();
        Person person1 = new Person("P.", "Sarah");
        Person person2 = new Person("D.", "Mimi");
        personen.add(person1);
        personen.add(person2);
    }


    @Override
    public List<Person> getAllPerson() {
        return personen;
    }

    @Override
    public Person getPerson(int id) {
        return personen.get(id);
    }

    @Override
    public void updatePerson(Person person) {
        personen.get(person.getId()).setName(person.getName());
        System.out.println("PersonDaoImpl UPDATE");
    }

    @Override
    public void deletePerson(Person person) {
        personen.remove(person.getId());
        System.out.println("Person: Id " + person.getId() + ", wurde gelöscht");
    }
}
