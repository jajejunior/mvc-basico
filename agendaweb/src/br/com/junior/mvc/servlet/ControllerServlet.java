package br.com.junior.mvc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.junior.mvc.logica.Logica;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/mvc")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parametro = request.getParameter("logica");//passado na interface
		String nomeDaClasse = "br.com.junior.mvc.logica."+parametro;
		try {
			// nome da classe que foi passada
			Class<?> classe = Class.forName(nomeDaClasse);
			
			Logica logica = (Logica) classe.newInstance();
			
			logica.executa(request, response);
			System.out.println("Controle executado");
			
		} catch (Exception e) {
			throw new ServletException("O controle causou um erro: "+e);
		}
	}

}
