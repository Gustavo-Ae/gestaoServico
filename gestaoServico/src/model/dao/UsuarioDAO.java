
package model.dao;

import connection.ConnectionFactory;
import controller.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UsuarioDAO {
    
     public void insert(Usuario usuario){
        
        Connection con = ConnectionFactory.getConexao();
       
        PreparedStatement acessoBD = null;
        
        try{
            acessoBD = con.prepareStatement("INSERT INTO tbusuario(nome,fone,usuario,senha,perfil) values(?,?,?,?,?)");
            
            acessoBD.setString(1,usuario.getNome());
            acessoBD.setString(2,usuario.getFone());
            acessoBD.setString(3, usuario.getUsuario());
            acessoBD.setString(4, usuario.getSenha());
            acessoBD.setString(5, usuario.getPerfil());
            
            acessoBD.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso","aviso",JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){
            System.out.println("Erro no método insert() -> "+e.getMessage());
            e.printStackTrace();
        }finally{
            ConnectionFactory.fecharConexao(con, acessoBD);
        }   
    }
     
    public void update(Usuario usuario){
        
        Connection con = ConnectionFactory.getConexao();
       
        PreparedStatement acessoBD = null;
        
        try{
            acessoBD = con.prepareStatement("UPDATE tbusuario SET nome = ?, fone = ?, usuario = ?, senha = ?, perfil = ? WHERE idUser = ?");
            
            acessoBD.setString(1, usuario.getNome());
            acessoBD.setString(2, usuario.getFone());
            acessoBD.setString(3, usuario.getUsuario());
            acessoBD.setString(4, usuario.getSenha());
            acessoBD.setString(5, usuario.getPerfil());
            acessoBD.setInt(6, usuario.getId());
            
            acessoBD.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso","Aviso", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o banco de dados","ERRO",JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Houve um erro no método update() :",sql);    
        }finally{
            ConnectionFactory.fecharConexao(con, acessoBD);
        }   
    }
     
      public Usuario consulta(String id){ 
        
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement acessoBD = null;
        ResultSet rs = null;
                
        try {
            acessoBD = con.prepareStatement("SELECT * FROM tbusuario WHERE idUser=?");
            acessoBD.setString(1, id);
            rs = acessoBD.executeQuery();
            
            if(rs.next()){
                Usuario usuario = new Usuario();
                
                usuario.setId(rs.getInt(1));
                usuario.setNome(rs.getString(2));
                usuario.setFone(rs.getString(3));
                usuario.setUsuario(rs.getString(4));
                usuario.setSenha(rs.getString(5));
                usuario.setPerfil(rs.getString(6));
                
                return usuario; 
            }else{
                return null;
            }
            
        }catch(Exception e){
            throw new RuntimeException("Erro no método consulta():",e);
        }finally{
            ConnectionFactory.fecharConexao(con, acessoBD, rs);
        }        
    }
    
      public void delete(Usuario usuario){
        
        Connection con = ConnectionFactory.getConexao();
            
        PreparedStatement acessoBD = null;
        
        try{
            acessoBD = con.prepareStatement("DELETE FROM tbusuario WHERE idUser = ?");
            
            acessoBD.setInt(1, usuario.getId());
            
            acessoBD.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso","Aviso", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null,"Erro ao deletar o usuario no banco de dados", "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Houve um erro no método delete() :",sql);
        }finally{
            ConnectionFactory.fecharConexao(con, acessoBD);
        }
    }
      
    public Usuario login(String usuario , String senha){
        
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement acessoBD = null;
        ResultSet rs = null;
                
        try{
            acessoBD = con.prepareStatement("SELECT * FROM tbusuario WHERE usuario = ? AND senha = ?");
            
            acessoBD.setString(1, usuario);
            acessoBD.setString(2, senha);
            
            rs = acessoBD.executeQuery();
            
            if(rs.next()){
                
                Usuario usu = new Usuario();
                
                usu.setId(rs.getInt(1));
                usu.setNome(rs.getString(2));
                usu.setFone(rs.getString(3));
                usu.setUsuario(rs.getString(4));
                usu.setSenha(rs.getString(5));
                usu.setPerfil(rs.getString(6));
                
                return usu;
                
            }
                     
        }catch(Exception e){
            System.out.println("Erro no método login() -> "+e.getMessage());
            e.printStackTrace();
        }finally{
            ConnectionFactory.fecharConexao(con, acessoBD, rs);
        }
        return null;
    }
}
