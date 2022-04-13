package manipulacaoparametrosrequest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOiPersonalizado
 */
@WebServlet("/ServletListaNomeParametros")
public class ServletListaNomeParametros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListaNomeParametros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		
		saida.write("<HTML><BODY>");
		saida.write("Ol�, os par�metros recebidos por essa requisi��o s�o: <BR>");	
		
		Enumeration<String> nomesParametros = request.getParameterNames();
		
		while(nomesParametros.hasMoreElements()) {
			String parametro = nomesParametros.nextElement().toString();
			saida.write(parametro);
			saida.write("=");
			saida.write(request.getParameter(parametro));
			saida.write(", ");
		}
		
		saida.write("</BODY></HTML>");		
		saida.close();
	}
}
