package org.ipssi.tp.web;

import javax.servlet.http.HttpServletRequest;

public abstract class WsDeco implements AbstractWs {
	
	private AbstractWs sous_ws=null;
	
	public WsDeco(AbstractWs ws) {
		this.sous_ws =ws;
	}

	@Override
	public Object doAction(HttpServletRequest request) {
		return sous_ws.doAction(request);
	}

}
