package br.com.junior.mvc.logica;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.junior.agenda.dao.ContatoDao;
import br.com.junior.agenda.modelo.Contato;

public class ListContatoLogic implements Logica {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<Contato> contatos = new ContatoDao().getList();
		request.setAttribute("contatos", contatos);
		//return "lista.jsp";
		RequestDispatcher rd = request.getRequestDispatcher("/contato-lista.jsp");
		rd.forward(request, response);
	}

}
