
package model.dao;

import connection.ConnectionFactory;
import controller.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class ClienteDAO{
    
     public void insert(Cliente cliente){
        
        Connection con = ConnectionFactory.getConexao();
       
        PreparedStatement acessoBD = null;
        
        try{
            acessoBD = con.prepareStatement("INSERT INTO tbclientes(nomeCliente,enderecoCliente,foneCliente,emailCliente) values(?,?,?,?)");
            
            acessoBD.setString(1, cliente.getNome());
            acessoBD.setString(2, cliente.getEndereco());
            acessoBD.setString(3, cliente.getFone());
            acessoBD.setString(4, cliente.getEmail());
            
            acessoBD.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso","Aviso",JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){
            System.out.println("Erro no método insert() -> "+e.getMessage());
            e.printStackTrace();
        }finally{
            ConnectionFactory.fecharConexao(con, acessoBD);
        }   
    }
     
}
