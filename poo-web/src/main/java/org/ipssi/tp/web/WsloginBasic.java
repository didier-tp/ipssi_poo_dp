package org.ipssi.tp.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.ipssi.tp.dto.ResLogin;

public class WsloginBasic implements AbstractWs {

	@Override
	public Object doAction(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		ResLogin resLogin=new ResLogin();
		if(password!=null && password.equals("pwd"+username)) {
			//password correct en TP (V1) si password="pwd"+username
			List<String> roles= new ArrayList<>();
			roles.add("admin"); roles.add("user");
			String tokenJwt = 
					JwtUtil.buildToken(username , 900000 , 
	                "jwtSecret" , roles); 
			resLogin.setMessage("successful login");
			resLogin.setToken(tokenJwt);
		}else {
			resLogin.setMessage("error login");
			resLogin.setToken(null);
		}
		return resLogin;
	}

}
