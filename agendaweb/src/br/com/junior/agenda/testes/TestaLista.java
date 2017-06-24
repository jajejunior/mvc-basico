package br.com.junior.agenda.testes;

import java.util.List;

import br.com.junior.agenda.dao.ContatoDao;
import br.com.junior.agenda.modelo.Contato;
public class TestaLista {

	public static void main(String[] args) {
		/*1 - TestaLista tem um main;
		  2 - Instancia o dao
		  3 - Coloca getLista() dentro de uma lista
		  4 - Cria um for interando o contato com a lista
		  5 - imprime os atributos do contato
		*/
		ContatoDao dao = new ContatoDao();
		List<Contato> contatoList = dao.getList();
		for(Contato contato:contatoList){
			System.out.println("Id: "+contato.getId());
			System.out.println("Nome: "+contato.getNome());
			System.out.println("***");
		}
		
		

	}

}
