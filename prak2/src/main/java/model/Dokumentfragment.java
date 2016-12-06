package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Kai on 18.04.2016.
 */
public class Dokumentfragment {

    @Id
    @GeneratedValue
    @Column(name = "idDokumentfragment")
    private int id;
    @Column(name = "Beschreibung")
    private String beschreibung;

}
