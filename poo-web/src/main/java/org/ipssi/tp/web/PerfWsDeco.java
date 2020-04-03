package org.ipssi.tp.web;

import javax.servlet.http.HttpServletRequest;

public class PerfWsDeco extends WsDeco {

	public PerfWsDeco(AbstractWs ws) {
		super(ws);
	}

	@Override
	public Object doAction(HttpServletRequest request) {
		long td =System.nanoTime();
		Object res = super.doAction(request);
		long tf =System.nanoTime();
		System.out.println("execution en "+(tf-td) +  "ns");
		return res;
	}

}
