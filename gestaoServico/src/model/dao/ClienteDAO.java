
package model.dao;

import connection.ConnectionFactory;
import controller.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import view.TelaCliente;


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
     
    public void pesquisarCliente(String letra){
        
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement acessoBD = null;
        ResultSet rs = null;
                
        try{
            acessoBD = con.prepareStatement("SELECT * FROM tbclientes WHERE nomeCliente LIKE ?");
            acessoBD.setString(1, letra + "%");
            rs = acessoBD.executeQuery();
            
            TelaCliente.jTable_clientes.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            throw new RuntimeException("Erro no método pesquisarCliente():",e);
        }finally{
            ConnectionFactory.fecharConexao(con, acessoBD, rs);
        }   
    }     
}
