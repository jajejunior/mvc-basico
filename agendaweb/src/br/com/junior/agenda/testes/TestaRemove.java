package br.com.junior.agenda.testes;

import br.com.junior.agenda.dao.ContatoDao;
import br.com.junior.agenda.modelo.Contato;

public class TestaRemove {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setId((long)4);
		ContatoDao dao = new ContatoDao();
		dao.removeContato(contato);
		System.out.println("Teste de remoção executado");
		
		

	}

}
