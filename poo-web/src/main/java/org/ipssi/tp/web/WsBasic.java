package org.ipssi.tp.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;

import org.ipssi.tp.dto.ResConv;
import org.ipssi.tp.service.ServiceConversion;
import org.ipssi.tp.service.ServiceConversionImpl;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WsBasic implements AbstractWs {

	@Override
	public Object doAction(HttpServletRequest request) {
		String source = request.getParameter("source");
		String cible = request.getParameter("cible");
		String montant = request.getParameter("montant");
		
		ServiceConversion serviceConv = ServiceConversionImpl.getInstance();
		double montantConv =serviceConv.convertir(Double.parseDouble(montant), source, cible);
		ResConv resConv = new ResConv(Double.parseDouble(montant),
				                      source,
				                      cible,
				                      montantConv);
		return resConv;
	}

}
