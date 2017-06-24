package br.com.junior.mvc.logica;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.junior.agenda.dao.ContatoDao;
import br.com.junior.agenda.modelo.Contato;

public class AlteraContatoLogic implements Logica {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		long id = Long.parseLong(request.getParameter("id"));
		String nome = request.getParameter("nome");
		
		Contato contato = new Contato();
		
		contato.setId(id);
		contato.setNome(nome);
		
		ContatoDao dao = new ContatoDao();
		dao.alteraContato(contato);
		
		System.out.println("Contato alterado pelo AlteraContatoLogic");
		//return "WEB-INF/jsp/contato-alterado.jsp";
		RequestDispatcher rs = request.getRequestDispatcher("/contato-alterado.jsp");
		rs.forward(request, response);
	}
}
