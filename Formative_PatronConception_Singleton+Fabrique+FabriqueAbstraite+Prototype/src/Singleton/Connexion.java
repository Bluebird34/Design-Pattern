package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    private Connection link ;
    private static Connexion instance = new Connexion(); //the teacher's code way is better, will improve at CRUD project

    private Connexion(){}

    public static Connexion getInstance() {
        return instance;
    }

    public Connection getConnecMySQL(String url,String user, String password) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            link = DriverManager.getConnection(url, user, password);
        }catch(SQLException e){
            System.out.println("Erreur SQL lors de la connection au serveur");
            link = null;
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return link;    }
}
