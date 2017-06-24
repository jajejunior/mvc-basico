package br.com.junior.mvc.logica;
/**
 * @author Junior
 * @version 1.0
 * */
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkAdicionaContatoLogic implements Logica {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		RequestDispatcher rd = request.getRequestDispatcher("/contato-adiciona.jsp");
		rd.forward(request, response);
	}
}
