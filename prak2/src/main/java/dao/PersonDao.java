package dao;

import model.Person;

import java.util.List;

public interface PersonDao {

    public List<Person> getAllPerson();
    public Person getPerson(int id);
    public void updatePerson(Person person);
    public void deletePerson(Person person);
}
