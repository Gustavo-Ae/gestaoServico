
package model.dao;

import connection.ConnectionFactory;
import controller.OrdemServico;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
}
