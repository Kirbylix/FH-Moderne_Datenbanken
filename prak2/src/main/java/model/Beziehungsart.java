package model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Beziehungsart {

    @Id
    @Column(name = "bKürzel")
    private String kuerzel;
    @Column(name = "bText")
    private String text;
}
