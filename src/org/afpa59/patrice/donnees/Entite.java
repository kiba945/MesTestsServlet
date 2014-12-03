package org.afpa59.patrice.donnees;

public class Entite {
	
	/****************************************/
	/* Déclaration des variables d'instance */
	/****************************************/
	private int code;
	
	/************************************/
	/*	Déclaration des constructeurs	*/
	/************************************/
	/*** 1er constructeur ***/
	public Entite(){}
	/*** 2ème constructeur avec des paramètres ***/
	public Entite(int code){
		this.code=code;
	}
	
	/************************************/
	/*		Déclaration des GETTEURS	*/
	/************************************/
	public int getCode(){return code;}
	
	/************************************/
	/*		Déclaration des SETTEURS	*/
	/************************************/
	public void setCode(int code){this.code=code;}
	
	/************************************/
	/*		Déclaration des méthodes	*/
	/************************************/
	/*** Méthode toString() retourne une chaîne de caractère  ***/
	public String toString(){return ("Code: "+code);}
}
