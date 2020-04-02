package org.ipssi.tp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ipssi.tp.entity.Devise;

public class DeviseDaoJdbc implements DeviseDAO {
	
	Connection etablirConnection() {
		Connection cn=null;
		try {
			Class.forName("org.h2.Driver");
			String url="jdbc:h2:~/deviseDB";
			String user="sa";
			String password="";
			cn=DriverManager.getConnection(url, user, password);
		}  catch (Exception e) {
			e.printStackTrace();
		}
		return cn;
	}

	public DeviseDaoJdbc() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Devise createDevise(Devise d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDevise(Devise d) {
		// TODO Auto-generated method stub

	}

	@Override
	public Devise getDeviseByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Devise> getAllDevises() {
		List<Devise> listeDev = new ArrayList<>();
		Connection cn = null;
		try {
			cn = this.etablirConnection();
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Devise");
			while(rs.next()) {
			    listeDev.add(
				  new Devise(rs.getString("code"),rs.getString("nom"),
				           rs.getDouble("eChange"))
				);
			}
			rs.close();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try{cn.close();}
			catch(Exception ex) { 
				System.err.println(ex.getMessage());
			}
		}
		return listeDev;
	}

	@Override
	public void deleteDevise(String code) {
		// TODO Auto-generated method stub

	}

}
