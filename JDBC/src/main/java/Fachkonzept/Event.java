package Fachkonzept;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Event{
    private int id;
    private Date date;
    private String title;
    private String text;
    private String location;
    private Map<Person, Role> relations;

    public Event(int id, Date date, String title, String text, String location) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.text = text;
        this.location = location;
        relations = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getLocation() {
        return location;
    }

    public Map<Person, Role> getRelations() {
        return relations;
    }

    public void addRelation(Person person, Role role){
        relations.put(person, role);

    }
}
