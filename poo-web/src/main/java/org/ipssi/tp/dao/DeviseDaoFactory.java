package org.ipssi.tp.dao;

import java.io.InputStream;
import java.util.Properties;

public class DeviseDaoFactory {

	//méthode de fabrication
	public static DeviseDAO createDeviseDao() {
		DeviseDAO deviseDao=null;
		String deviseDaoClassName=null;
		InputStream inStream = 
				Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("application.properties");
		Properties props = new Properties();
		try {
			props.load(inStream);
			deviseDaoClassName=props.getProperty("deviseDao");
			System.out.println("deviseDaoClassName="+deviseDaoClassName);
			deviseDao = (DeviseDAO) 
				Class.forName(deviseDaoClassName).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deviseDao;
	}

}
