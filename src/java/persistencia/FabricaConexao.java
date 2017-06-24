/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author João
 */
public class FabricaConexao {
    
    private static Connection conexao;
    
    public static Connection getConexao() throws ClassNotFoundException, SQLException{       
        if (conexao == null){
            Class.forName("org.postgresql.Driver");       
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/estoque","postgres","postgres");       
        }
        return conexao; 
    }
    
    public static void fecharConexao() throws SQLException{       
        if (conexao != null)
            conexao.close();        
    }  
}
