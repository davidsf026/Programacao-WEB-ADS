package br.uniceub.classe;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGetPost
 */
@WebServlet("/ServletGetPost")
public class ServletGetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	PrintWriter saida = resp.getWriter();
    	
		saida.write("<HTML><BODY>Ol�! <br>");
		saida.write("Respota do m�todo GET");
		saida.write("</BODY></HTML>");
		
		saida.close();
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	PrintWriter saida = resp.getWriter();
    	
		saida.write("<HTML><BODY>Ol�! <br>");
		saida.write("Respota do m�todo POST");
		saida.write("</BODY></HTML>");
		
		saida.close();
    }
	
}
