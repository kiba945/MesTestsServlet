package org.afpa59.patrice.donnees;

public class Article extends Entite{

	/****************************************/
	/* D�claration des variables d'instance */
	/****************************************/


	private String designation;


	private float prix;

	/************************************/
	/*	D�claration des constructeurs	*/
	/************************************/
	/** 1er constructeur
	 * 
	 */
	public Article(){}

	/** 2�me constructeur avec des param�tres
	 * 
	 * @param Integer code
	 * @param String designation
	 * @param Float prix
	 */
	public Article(int code, String designation, float prix){
		super(code);
		this.designation=designation;
		this.prix=prix;
	}

	/** 3�me constructeur avec des param�tres
	 * 
	 * @param String designation
	 * @param Float prix
	 */
	public Article(String designation, float prix){
		this.designation=designation;
		this.prix=prix;
	}


	/************************************/
	/*		D�claration des GETTEURS	*/
	/************************************/	
	/**
	 * @return String designation
	 */
	public String getDesignation(){return designation;}
	
	/**
	 * @return Float prix
	 */
	public float getPrix(){return prix;}

	/************************************/
	/*		D�claration des SETTEURS	*/
	/************************************/
	/**
	 * @param designation
	 */	
	public void setDesignation(String designation){this.designation=designation;}	
	
	/**
	 * @param prix
	 */
	public void setPrix(float prix){this.prix=prix;}	
	
	

	/************************************/
	/*		D�claration des m�thodes	*/
	/************************************/
	/*** M�thode toString() retourne une cha�ne de caract�re  ***/
	public String toString(){return (super.toString()+" Designation: "+designation+
			" Prix: "+prix);}

	//	@Override
	//	public int hashCode() {
	//		final int prime = 31;
	//		int result = 1;
	//		result = prime * result
	//				+ ((designation == null) ? 0 : designation.hashCode());
	//		return result;
	//	}
	//
	//	@Override
	//	public boolean equals(Object obj) {
	//		if (this == obj)
	//			return true;
	//		if (obj == null)
	//			return false;
	//		if (getClass() != obj.getClass())
	//			return false;
	//		Article other = (Article) obj;
	//		if (designation == null) {
	//			if (other.designation != null)
	//				return false;
	//		} else if (!designation.equals(other.designation))
	//			return false;
	//		return true;
	//	}
	//


}
