/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jhonatan
 */
public class ModuloConexao {
    
    public static Connection  conector(){
        
        Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/dbinfox";
        String user = "root";
        String password = "182050";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            //System.out.println(e);
            
            return null;
        }
        
    }
    
}
