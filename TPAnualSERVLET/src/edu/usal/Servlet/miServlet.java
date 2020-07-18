package edu.usal.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.usal.dao.interfaces.AeropuertoDAO;
import edu.usal.dao.negocio.Aeropuerto;
import edu.usal.dao.negocio.Pais;
import edu.usal.dao.negocio.Provincia;
import edu.usal.factory.FactoryGeneralJDBC;

/**
 * Servlet implementation class miServlet
 */
//@WebServlet("/miServlet")
public class miServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public miServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		if ("QuispeAlexander".equals(request.getParameter("CampodeTexto")) && "12345".equals(request.getParameter("Contrasenia")))
    	{
    		
    		request.getRequestDispatcher("AltadeAeropuerto.html").forward(request, response);
    	
    	}
    	else {
    		
    		response.getWriter().println("<html>");
			response.getWriter().println("<head>");
			response.getWriter().println("</head>");
			response.getWriter().println("<body>");
			response.getWriter().println("Datos Incorrectos!!!!!! Login Invalido !! por favor Paciencia macrino , necesito Aprobar jaja");
			response.getWriter().println("</body>");
			response.getWriter().println("</html>");
    		
    	}
    	
	}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Integer.valueOf(request.getParameter("IDAeropuerto"))
		
		AeropuertoDAO aeropuertoDAO = FactoryGeneralJDBC.GetAeropuertoImplementacion("sql");
		
		Aeropuerto aeropuerto = new Aeropuerto (
				request.getParameter("CodigodeAeropuerto")
				,request.getParameter("Ciudad")
						, new Pais (request.getParameter("Pais"))
						, new Provincia (request.getParameter("Provincia")));
	      		
		
		aeropuertoDAO.AltadeAeropuerto(aeropuerto);
		
		
	}
	
}
