package org.ipssi.tp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ipssi.tp.dto.ResConv;
import org.ipssi.tp.service.ServiceConversion;
import org.ipssi.tp.service.ServiceConversionImpl;

import com.fasterxml.jackson.databind.ObjectMapper;


//@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyServlet() {
        super();
    }
    
    protected void doGetV1Html(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String source = request.getParameter("source");
		String cible = request.getParameter("cible");
		String montant = request.getParameter("montant");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>resServlet</title></head>");
		out.println("<body>");
		//ServiceConversion serviceConv = new ServiceConversionImpl();
		ServiceConversion serviceConv = ServiceConversionImpl.getInstance();
		double resConv =serviceConv.convertir(Double.parseDouble(montant), source, cible);
		out.println("somme convertie <b>"+resConv+"</b>");
		out.println("</body></html>");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//AbstractWs ws = new WsBasic();
		AbstractWs ws = new PerfWsDeco(new LogWsDeco(new WsBasic()));
		Object resConv = ws.doAction(request);
		
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		//jackson = libraie java open source qui gère le format json
		ObjectMapper objMapperJackson = new ObjectMapper();
		String resConAsJsonString = objMapperJackson.writeValueAsString(resConv);
		out.println(resConAsJsonString);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
