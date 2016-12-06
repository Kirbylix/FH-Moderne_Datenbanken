package dao;



import java.sql.*;

public class DAO {
    public String driver = "";
    public String url = "";
    public Connection con = null;
    public Statement stm = null;
    public  int timeout = 30;

    public DAO(){
    }

    public void init(String driver, String url)throws Exception{
        this.driver = driver;
        this.url = url;
        setConnection();
        setStatement();
    }

    private void setConnection()throws Exception{
        Class.forName(driver);
        con = DriverManager.getConnection(url);
    }

    private void setStatement() throws Exception{
        if(con == null){
            setConnection();
        }
        stm = con.createStatement();
        stm.setQueryTimeout(timeout);
    }

    public void executeStm(String instruction)throws Exception{
        stm.executeUpdate(instruction);
    }

    public void executeStm(String[] instruction)throws Exception{
        for(int i = 0; i < instruction.length; i++){
            executeStm(instruction[i]);
        }
    }

    public ResultSet executeQry(String instruction)throws SQLException{
        return stm.executeQuery(instruction);
    }

    public void closeConnection(){
        try{
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
