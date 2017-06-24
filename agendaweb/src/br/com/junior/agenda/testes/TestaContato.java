package br.com.junior.agenda.testes;

import br.com.junior.agenda.dao.ContatoDao;
import br.com.junior.agenda.modelo.Contato;

public class TestaContato {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setId((long)1);
		contato.setNome("Antonia Pereira da Silva");
		ContatoDao dao = new ContatoDao();
		dao.alteraContato(contato);
		System.out.println("Contato adulterado com sucesso");
	}

}
