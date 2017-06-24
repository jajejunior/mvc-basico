package br.com.junior.mvc.logica;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.junior.agenda.dao.ContatoDao;
import br.com.junior.agenda.modelo.Contato;

public class AdicionaContatoLogic implements Logica {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String nome = request.getParameter("nome");
		
		Contato contato = new Contato();
		contato.setNome(nome);
		
		ContatoDao dao = new ContatoDao();
		dao.adicionaContato(contato);
		System.out.println("Contato Adicionado");
		
		RequestDispatcher rd = request.getRequestDispatcher("/contato-lista.jsp");
		rd.forward(request, response);
	}

}
