
package model.dao;

import connection.ConnectionFactory;
import controller.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
     
      public void update(Cliente cliente){
        
        Connection con = ConnectionFactory.getConexao();
       
        PreparedStatement acessoBD = null;
        
        try{
            acessoBD = con.prepareStatement("UPDATE tbclientes SET nomeCliente = ?, enderecoCliente = ?, foneCliente = ?, emailCliente = ? WHERE idCliente = ?");
            
            acessoBD.setString(1, cliente.getNome());
            acessoBD.setString(2, cliente.getEndereco());
            acessoBD.setString(3, cliente.getFone());
            acessoBD.setString(4, cliente.getEmail());
            acessoBD.setInt(5, cliente.getId());
            
            acessoBD.executeUpdate();
            
            JOptionPane.showMessageDialog(null, cliente.getNome()+" atualizado com sucesso","Aviso", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o banco de dados","ERRO",JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Houve um erro no método update() :",e);    
        }finally{
            ConnectionFactory.fecharConexao(con, acessoBD);
        }   
    }
      
       public void delete(Cliente cliente){
        
        Connection con = ConnectionFactory.getConexao();
            
        PreparedStatement acessoBD = null;
        
        try{
            acessoBD = con.prepareStatement("DELETE FROM tbclientes WHERE idCliente = ?");
            
            acessoBD.setInt(1, cliente.getId());
            
            acessoBD.executeUpdate();
            
            JOptionPane.showMessageDialog(null, cliente.getNome()+" foi deletado da lista","Aviso", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null,"Erro ao deletar o cliente no banco de dados", "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Houve um erro no método delete() :",sql);
        }finally{
            ConnectionFactory.fecharConexao(con, acessoBD);
        }
    }
        
    public void pesquisarCliente(String letra){
        
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement acessoBD = null;
        ResultSet rs = null;
                
        try{
            acessoBD = con.prepareStatement("SELECT idCliente as id , nomeCliente as nome , enderecoCliente as endereco, foneCliente as fone , emailCliente as email FROM tbclientes WHERE nomeCliente LIKE ?");
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
