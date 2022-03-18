package br.uniceub.classe;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDataHora
 */
@WebServlet("/ServletDataHora")
public class ServeltDataHora extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	log("A servelt iniciou em: " + format.format(new Date()));
    	super.init();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter saida = response.getWriter();
		
		saida.write("<HTML><BODY>Olá! <br>");
		saida.write("A data e hora atual é "+format.format(new Date()));
		saida.write("</BODY></HTML>");
		
		saida.close();
	}
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.doPost(req, resp);
    }
    
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	log("A servelt se destruiu em: " + format.format(new Date()));
    	super.destroy();
    }
}
