package org.ipssi.tp;

import javax.servlet.http.HttpServlet;

import org.ipssi.tp.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
   @Bean	
   public ServletRegistrationBean<HttpServlet> countryServlet() {
	   ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
	   servRegBean.setServlet(new MyServlet());
	   servRegBean.addUrlMappings("/MyServlet");
	   servRegBean.setLoadOnStartup(1);
	   return servRegBean;
   }
}
