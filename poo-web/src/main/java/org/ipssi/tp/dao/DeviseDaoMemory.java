package org.ipssi.tp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ipssi.tp.entity.Devise;


public class DeviseDaoMemory implements DeviseDAO {
	
	private Map<String,Devise> deviseMap = new HashMap<>();
	
	//code classique du "design pattern SINGLETON" sans s'appuyer sur spring:
		private static DeviseDaoMemory uniqueInstance = null;
		
		public  static DeviseDaoMemory getInstance()	{ 
			if (uniqueInstance == null) {
		         uniqueInstance = new DeviseDaoMemory();
		     }
		return uniqueInstance; // instance nouvellement ou anciennement créée .
		}

	private DeviseDaoMemory() {
	    //jeux de données initial:
		createDevise(new Devise("EUR","euro",1.0));
		createDevise(new Devise("USD","dollar",1.1));
		createDevise(new Devise("GBP","livre",0.9));
		createDevise(new Devise("JPY","yen",123.6));
	}

	@Override
	public Devise createDevise(Devise d) {
		this.deviseMap.put(d.getCode(), d);
		return d;
	}

	@Override
	public void updateDevise(Devise d) {
		this.deviseMap.put(d.getCode(), d);
	}

	@Override
	public Devise getDeviseByCode(String code) {
		return this.deviseMap.get(code);
	}

	@Override
	public List<Devise> getAllDevises() {
		return new ArrayList<Devise>(this.deviseMap.values());
	}

	@Override
	public void deleteDevise(String code) {
		this.deviseMap.remove(code);
	}

}
