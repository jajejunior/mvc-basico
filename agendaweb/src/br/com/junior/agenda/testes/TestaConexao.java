package br.com.junior.agenda.testes;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.junior.agenda.ConnectionFactory;

/**
 * @author Junior
 * @version 1.0
 * */
public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		try {
			connection = new ConnectionFactory().getConnection();
			System.out.println("Conectado");
		}
		catch (RuntimeException e) {
			System.out.println("Não Conectado"+e);
		}
		finally{
			connection.close();
			System.out.println("Conexão encerrada");
		}
	}
}
