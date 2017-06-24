
package br.com.junior.agenda.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.junior.agenda.ConnectionFactory;
import br.com.junior.agenda.modelo.Contato;

/**
 * @author Junior
 *
 */
public class ContatoDao {
	
	Connection connection;
	
	public ContatoDao(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adicionaContato(Contato contato){
		String sql = "insert into contatos(nome) values(?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, contato.getNome());
			
			stmt.execute();
			stmt.close();
			System.out.println("Contato adicionado");
		} catch (SQLException e) {
			System.out.println("erro ao adicionar"+e);
			throw new RuntimeException(e);
		}	
	}
	
	
	public List<Contato> getList(){
		try{
				String sql = "select * from contatos";
				List<Contato> contatoList = new ArrayList<>();
				PreparedStatement stmt = this.connection.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
				
				while(rs.next()){
					Contato contato = new Contato();
					contato.setId(rs.getLong("id"));
					contato.setNome(rs.getString("nome"));
					contatoList.add(contato);
				}
				rs.close();
				stmt.close();
				return contatoList;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void removeContato(Contato contato){
		String sql = "delete from contatos where id=?";
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, contato.getId());
			stmt.execute();
			System.out.println("Dados removidos com sucesso");
			stmt.close();
			
		}catch(SQLException e){
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public void alteraContato(Contato contato){
		
		String sql = "update contatos set nome=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setLong(2, contato.getId());
			
			stmt.execute();
			System.out.println("Atualizando contatos...");
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
