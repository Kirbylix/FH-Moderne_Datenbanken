package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Lebensbereich {

    @Id
    @GeneratedValue
    @Column(name = "idLebensbereich")
    private int id;
    @Column(name = "TextLebensbereich")
    private String textLebensbereich;



}
