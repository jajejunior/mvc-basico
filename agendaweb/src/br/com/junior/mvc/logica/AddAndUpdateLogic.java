package br.com.junior.mvc.logica;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.junior.agenda.dao.ContatoDao;
import br.com.junior.agenda.modelo.Contato;

public class AddAndUpdateLogic implements Logica {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Contato contato = new Contato();
		ContatoDao dao = new ContatoDao();
		String idString = request.getParameter("id");
		contato.setNome(request.getParameter("nome"));
		RequestDispatcher rd;
		
			
		if(idString != null){	//É um alterar
			long id = Long.parseLong(idString);
			contato.setId(id);
			dao.alteraContato(contato);
			
			rd = request.getRequestDispatcher("contato-alterado.jsp");
			System.out.println("Contato alterado");
			
		}else{	//É adicionar
			dao.adicionaContato(contato);
			
			rd = request.getRequestDispatcher("contato-adicionado.jsp");
			System.out.println("Contato adicionado");
		}
		rd.forward(request, response);
		
		
		
	}

}
