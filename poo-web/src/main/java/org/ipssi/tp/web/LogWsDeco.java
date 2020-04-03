package org.ipssi.tp.web;

import javax.servlet.http.HttpServletRequest;

public class LogWsDeco extends WsDeco {

	public LogWsDeco(AbstractWs ws) {
		super(ws);
	}

	@Override
	public Object doAction(HttpServletRequest request) {
		Object res = super.doAction(request);
		System.out.println("res="+res.toString());
		return res;
	}

}
