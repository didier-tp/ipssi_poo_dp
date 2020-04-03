package org.ipssi.tp.web;

import javax.servlet.http.HttpServletRequest;

public class TokenWsDeco extends WsDeco {

	public TokenWsDeco(AbstractWs ws) {
		super(ws);
	}

	@Override
	public Object doAction(HttpServletRequest request) {
		String authorization  = request.getHeader("Authorization");
		String token =null;
		if(authorization!=null && authorization.length()>=7) {
			token = authorization.substring(7);//apres "Bearer "
			if(JwtUtil.validateToken(token,"jwtSecret")==false) {
				throw new RuntimeException("invalid token");
			}
		}
		System.out.println("authorization="+authorization);
		Object res = super.doAction(request);
		
		return res;
	}

}
