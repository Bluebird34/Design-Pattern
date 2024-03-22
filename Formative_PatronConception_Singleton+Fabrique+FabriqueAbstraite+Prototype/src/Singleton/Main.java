package Singleton;

import java.sql.*;

public class Main {

    private static final String URL = "jdbc:mysql://localhost/design_pattern?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Statement statement;


    //https://stackoverflow.com/questions/17484764/java-lang-classnotfoundexception-com-mysql-jdbc-driver-mysqlconnector-j

/*    public class MySingleTon {
        String url = "jdbc:mysql://localhost:3306/"; ---------//Attention!! when you download sql.
        String dbName = "test";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";*/

    public static void main(String[] args) throws Exception {
        Connection con = Connexion.getInstance().getConnecMySQL(URL,USER,PASSWORD);
        statement = con.createStatement();

        String sql1 = "DROP TABLE IF EXISTS `clients`";
        String sql2 = "CREATE TABLE clients " +
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " +
                " last VARCHAR(255), " +
                " age INTEGER, " +
                " PRIMARY KEY ( id ))";

        //  statement.executeQuery(sql); //wrong method
        statement.executeUpdate(sql1);
        statement.executeUpdate(sql2);
    }
}
