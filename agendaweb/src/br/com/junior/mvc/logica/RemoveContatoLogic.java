package br.com.junior.mvc.logica;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.junior.agenda.dao.ContatoDao;
import br.com.junior.agenda.modelo.Contato;

public class RemoveContatoLogic implements Logica {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		long id = Long.parseLong(request.getParameter("id"));// é long não Long
		
		Contato contato = new Contato();
		contato.setId(id);
		
		ContatoDao dao = new ContatoDao();
		dao.removeContato(contato);
		System.out.println("Excluindo contato... ");
		
		//return "mvc?logica=ListContatoLogic";
		RequestDispatcher rd = request.getRequestDispatcher("mvc?logica=ListContatoLogic");
		rd.forward(request, response);
				
				
				
	}

}
