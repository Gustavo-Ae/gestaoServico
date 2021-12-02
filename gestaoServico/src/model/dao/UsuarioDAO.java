
package model.dao;

import connection.ConnectionFactory;
import controller.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
                usu.setUsuario(rs.getString(6));
                
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
