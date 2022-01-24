
package model.dao;

import connection.ConnectionFactory;
import controller.OrdemServico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class OrdemServicoDAO {
    
    public void emitirOs(OrdemServico ordemServico){
        
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement acessoBD = null;
        
        try{
            acessoBD = con.prepareStatement("INSERT INTO tb_ordemservico(tipo,situacao,equipamento,defeito,servico,tecnico,valor,idCliente) values(?,?,?,?,?,?,?,?)");
            
            acessoBD.setString(1, ordemServico.getTipo());
            acessoBD.setString(2, ordemServico.getSituacao());
            acessoBD.setString(3, ordemServico.getEquipamento());
            acessoBD.setString(4, ordemServico.getDefeito());
            acessoBD.setString(5, ordemServico.getServico());
            acessoBD.setString(6, ordemServico.getTecnico());
            acessoBD.setDouble(7, ordemServico.getValor());
            acessoBD.setInt(8, ordemServico.getIdCliente());
            
            acessoBD.executeUpdate();
            
            JOptionPane.showMessageDialog(null, ordemServico.getTipo()+" emitido com sucesso","Aviso",JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){
            System.out.println("Erro no método emitirOs() -> "+e.getMessage());
            e.printStackTrace();
        }finally{
            ConnectionFactory.fecharConexao(con, acessoBD);
        }   
    }
    
    public OrdemServico pesquisarOs(String id){
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement acessoBD = null;
        ResultSet rs = null;
        
        try{
            acessoBD = con.prepareStatement("select codigo,date_format(data_hora,'%d/%m/%Y - %H:%i'),tipo,situacao,equipamento,defeito,servico,tecnico,valor,idCliente from tb_ordemservico where codigo = ?");
            acessoBD.setString(1, id);
            rs = acessoBD.executeQuery();
            
            if(rs.next()){
                OrdemServico ordemServico = new OrdemServico();
                
                ordemServico.setCodigo(rs.getInt(1));
                ordemServico.setData_hora(rs.getString(2));
                ordemServico.setTipo(rs.getString(3));
                ordemServico.setSituacao(rs.getString(4));
                ordemServico.setEquipamento(rs.getString(5));
                ordemServico.setDefeito(rs.getString(6));
                ordemServico.setServico(rs.getString(7));
                ordemServico.setTecnico(rs.getString(8));
                ordemServico.setValor(rs.getDouble(9));
                ordemServico.setIdCliente(rs.getInt(10));
                
                return ordemServico; 
            }else{
                return null;
            }
            
        }catch(Exception e){
            System.out.println("Erro no método pesquisarOs() -> "+e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }finally{
            ConnectionFactory.fecharConexao(con, acessoBD,rs);
        }
        return null;
    }
    
    public void updateOs(OrdemServico ordemServico){
        
        Connection con = ConnectionFactory.getConexao();
       
        PreparedStatement acessoBD = null;
        
        try{
            acessoBD = con.prepareStatement("UPDATE tb_ordemservico SET tipo = ?, situacao = ?, equipamento = ?, defeito = ?, servico = ?, tecnico = ?, valor = ? WHERE codigo = ?");
            
            acessoBD.setString(1, ordemServico.getTipo());
            acessoBD.setString(2, ordemServico.getSituacao());
            acessoBD.setString(3, ordemServico.getEquipamento());
            acessoBD.setString(4, ordemServico.getDefeito());
            acessoBD.setString(5, ordemServico.getServico());
            acessoBD.setString(6, ordemServico.getTecnico());
            acessoBD.setDouble(7, ordemServico.getValor());
            acessoBD.setInt(8, ordemServico.getCodigo());
            
            acessoBD.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso","Aviso", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o banco de dados","ERRO",JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(sql);    
        }finally{
            ConnectionFactory.fecharConexao(con, acessoBD);
        }   
    }
    
    public void deletar(OrdemServico ordemServico){
        
        Connection con = ConnectionFactory.getConexao();
            
        PreparedStatement acessoBD = null;
        
        try{
            acessoBD = con.prepareStatement("DELETE FROM tb_ordemservico WHERE codigo = ?");
            
            acessoBD.setInt(1, ordemServico.getCodigo());
            
            acessoBD.executeUpdate();
            
            JOptionPane.showMessageDialog(null, ordemServico.getTipo()+" deletado com sucesso","Aviso", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null,"Erro ao deletar "+ordemServico.getTipo()+" no banco de dados", "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Houve um erro no método deletar() :",sql);
        }finally{
            ConnectionFactory.fecharConexao(con, acessoBD);
        }
    }
    
}
