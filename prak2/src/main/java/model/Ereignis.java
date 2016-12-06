package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Ereignis {

    @Id
    @GeneratedValue
    @Column(name = "idEreignis")
    private int id;
    @Column(name = "Ueberschrieft")
    private String Ueberschrift;
    @Column(name = "text")
    private String text;
    @Column(name = "ort")
    private String ort;
    @Column(name = "date")
    private Date date;
    @Column
    @OneToOne
    private Lebensbereich lebensbereich;





    public Ereignis(String ueberschrift, String text, String ort, Date date) {
        Ueberschrift = ueberschrift;
        this.text = text;
        this.ort = ort;
        this.date = date;
//        beziehung = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUeberschrift() {
        return Ueberschrift;
    }

    public void setUeberschrift(String ueberschrift) {
        Ueberschrift = ueberschrift;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
/*
    public Map<Person, Rolle> getBeziehung() {
        return beziehung;
    }

    public void addBeziehung(Person person, Rolle rolle){
        beziehung.put(person, rolle);

    }*/
}
