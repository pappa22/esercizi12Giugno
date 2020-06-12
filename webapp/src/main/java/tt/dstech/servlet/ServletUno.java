package tt.dstech.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.dstech.gestione.Controller;

@WebServlet (urlPatterns = "/aggiungi")
public class ServletUno  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/Homepage.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Controller gestione = new Controller();
		String nome = req.getParameter("nome");
		String cognome = req.getParameter("cognome");
		long numero = Long.parseLong(req.getParameter("numero"));
	
		gestione.salvaUtente(nome, cognome, numero);
		req.setAttribute("listaUtenti", gestione.stampaListaUtenti());
		req.getRequestDispatcher("Homepage.jsp").forward(req, resp);
	
}
}
