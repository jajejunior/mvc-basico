package br.com.junior.agenda.testes;

import br.com.junior.agenda.dao.ContatoDao;
import br.com.junior.agenda.modelo.Contato;

/**
 * @author Junior
 * @version 1.0
 * */
public class TestaInsere {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Fl�via Dias da Concei��o");
		
		ContatoDao dao = new ContatoDao();
		dao.adicionaContato(contato);

	}

}
