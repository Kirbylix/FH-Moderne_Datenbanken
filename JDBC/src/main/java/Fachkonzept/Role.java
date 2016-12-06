package Fachkonzept;

/**
 * Created by Kai on 18.04.2016.
 */
public class Role {
    public Role(String code, String designation)
    {
        this.code = code;
        this.designation = designation;
    }


    private String code;
    private String designation;


    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    //AUTHOR,	//'A', 'Autor'
    //involvedPerson,	//'BP', 'Beteiligte Person'

}
