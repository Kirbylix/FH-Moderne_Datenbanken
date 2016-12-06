package dao;

public class SQLiteDAO extends DAO{

    String driver = "org.sqlite.JDBC";

    public SQLiteDAO(String url) throws Exception {
        init(driver, "jdbc:sqlite:" + url);
        if(con != null){
            System.out.println("Connected OK using " + driver + " to " + url);
        }else{
        System.out.println("Connection failed");
        }
    }
}
