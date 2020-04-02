package org.ipssi.tp.dao;

import java.util.List;

import org.ipssi.tp.entity.Devise;

//DAO = Data Access Object (cas particuliers du DP "Stratégie" )
//avec méthodes CRUD (Create , Rechercher , Update , Delete)
//avec throws RuntimeException implicites
public interface DeviseDAO {
	Devise createDevise(Devise d);
	void updateDevise(Devise d);
	Devise getDeviseByCode(String code);
	List<Devise> getAllDevises();
	void deleteDevise(String code);
}
