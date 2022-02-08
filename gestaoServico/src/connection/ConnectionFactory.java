
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionFactory{
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    private static final String URL = "jdbc:mysql://localhost/dbinfo";

    private static final String USER = "root"; 

    private static final String PASS = ""; 
        
    public static Connection getConexao(){
        try{
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
        }catch(Exception erro){
            System.out.println(erro.getMessage()); // mostra o erro;
            erro.printStackTrace(); // mostra a linha que está o erro;
            return null;
        }      
    }
    
    public static void fecharConexao(Connection con){
        try{
            if(con != null){       
                con.close();
            }
        }catch(SQLException sql){
            throw new RuntimeException("Houve um erro no SQL, no método closeConnection() :",sql); 
        }
    }
    
    public static void fecharConexao(Connection con, PreparedStatement acessoBD){
         
        fecharConexao(con);
         
        try {
             if(acessoBD != null){       
                acessoBD.close();
            }
        }catch (SQLException sql){
            throw new RuntimeException("Houve um erro no SQL, no método closeConnection() :",sql); 
        }
    }
    
    public static void fecharConexao(Connection con, PreparedStatement acessoBD, ResultSet rs){
         
        fecharConexao(con,acessoBD);
         
        try {
            if(rs != null){       
                rs.close();
            }
        }catch (SQLException sql){
            throw new RuntimeException("Houve um erro no SQL, no método closeConnection() :",sql); 
        }
    }
}

