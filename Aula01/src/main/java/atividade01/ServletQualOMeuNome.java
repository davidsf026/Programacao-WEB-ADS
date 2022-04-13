package atividade01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QualOMeuNome
 */
@WebServlet("/QualOMeuNome")
public class ServletQualOMeuNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletQualOMeuNome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		
		saida.write("<HTML><BODY>");
		saida.write("<a href=/ProgamacaoWebProjeto01/ServletMeuNome>Qual o meu nome?</a>");	
		saida.write("</BODY></HTML>");		
		saida.close();
	}
}
