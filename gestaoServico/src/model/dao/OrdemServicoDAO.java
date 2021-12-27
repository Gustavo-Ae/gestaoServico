
package model.dao;

import connection.ConnectionFactory;
import controller.OrdemServico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            acessoBD = con.prepareStatement("SELECT * FROM tb_ordemservico WHERE codigo = ?");
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
    
}
