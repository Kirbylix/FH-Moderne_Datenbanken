package model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Rolle {

    @Id
    @Column(name = "rKürzel")
    private String kuerzel;
    @Column(name = "rText")
    private String text;
}