package br.com.junior.agenda;
/**
 * @author Junior
 * @version 1.0
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				return DriverManager.getConnection("jdbc:mysql://localhost/testes","root","root");
			} catch (SQLException | ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
		
	}
}
