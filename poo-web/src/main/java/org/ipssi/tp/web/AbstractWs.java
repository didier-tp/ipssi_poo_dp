package org.ipssi.tp.web;

import javax.servlet.http.HttpServletRequest;

public interface AbstractWs {
		Object doAction(HttpServletRequest request);
		//...
}
