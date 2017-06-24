package br.com.junior.agenda.servlet;
/**
 * @author Junior
 * */
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.junior.agenda.dao.ContatoDao;
import br.com.junior.agenda.modelo.Contato;

/**
 * Servlet implementation class AdicionaContatoServlet
 */
@WebServlet("/adicionaContatoServlet")
public class AdicionaContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Recebe os parametros pela request
		String nome = request.getParameter("nome");
		
		//Monta o contato
		Contato contato = new Contato();
		contato.setNome(nome);
		
		//Coloca o contato no dao
		ContatoDao dao = new ContatoDao();
		dao.adicionaContato(contato);
		
		RequestDispatcher rs = request.getRequestDispatcher("/contato-adicionado.jsp");
		rs.forward(request, response);
		
	}

}
