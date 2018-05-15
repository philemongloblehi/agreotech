package com.agreotech.objis;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 17/12/2017
 * @version 1.0
 * 
 * Cette classe d�nomm�e "Engin" permettra
 * L'enregistrement et l'affichage d'un engin m�canique
 * utilis� sur la parcelle agricole de l'utilsateur
 *
 */
public class Engin implements IAfficher {
	
	/**
	 * D�claration des propri�t�s
	 */	
	private String designation;
	private String etat;
	private int consoEssenceJour;
	
	/**
	 * D�claration des propri�t�s constances
	 */	
	final private int prixEssence = 600;
	

	/**
	 * D�claration du constructeur avec 3 param�tres
	 * @param designation
	 * @param etat
	 * @param consoEssanceJour
	 */	
	public Engin(String designation, String etat, int consoEssanceJour) {
		
		super();
		this.designation = designation;
		this.etat = etat;
		this.consoEssenceJour = consoEssanceJour;
		
		System.out.println(" (******* VOTRE ENGIN a �t� enregistr� avec succ�s ************) ");
	}

	/**
	 * D�claration de l'accesseur
	 * @return String
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * D�claration du mutateur
	 * @param designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * D�claration de l'accesseur
	 * @return String
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * D�claration du mutateur
	 * @param etat
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}

	/**
	* D�claration de l'accesseur
	 * @return int
	 */
	public int getConsoEssenceJour() {
		return consoEssenceJour;
	}

	/**
	 * D�claration du mutateur
	 * @param consoEssenceJour
	 */
	public void setConsoEssenceJour(int consoEssenceJour) {
		this.consoEssenceJour = consoEssenceJour;
	}

	/**
	 * Impl�mentation de la m�thode afficher de l'interface IAfficher
	 */	
	@Override
	public void afficher() {
		
		
		System.out.println("Designation: " + getDesignation() + "\nEtat: " + getEtat() + "\nObservation: " + getConsoEssenceJour());
		
	}
	
	public void coutTotalEssenceAnnuel() {
		
		System.out.println("Son cout total annuel en carburant est " + consoEssenceJour * prixEssence);
		
	}
	
	
	
	

}
