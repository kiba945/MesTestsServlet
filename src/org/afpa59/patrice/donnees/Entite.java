package org.afpa59.patrice.donnees;

public class Entite {
	
	/****************************************/
	/* D�claration des variables d'instance */
	/****************************************/
	private int code;
	
	/************************************/
	/*	D�claration des constructeurs	*/
	/************************************/
	/*** 1er constructeur ***/
	public Entite(){}
	/*** 2�me constructeur avec des param�tres ***/
	public Entite(int code){
		this.code=code;
	}
	
	/************************************/
	/*		D�claration des GETTEURS	*/
	/************************************/
	public int getCode(){return code;}
	
	/************************************/
	/*		D�claration des SETTEURS	*/
	/************************************/
	public void setCode(int code){this.code=code;}
	
	/************************************/
	/*		D�claration des m�thodes	*/
	/************************************/
	/*** M�thode toString() retourne une cha�ne de caract�re  ***/
	public String toString(){return ("Code: "+code);}
}
