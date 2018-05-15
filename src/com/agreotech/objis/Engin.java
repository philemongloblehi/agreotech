package com.agreotech.objis;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 17/12/2017
 * @version 1.0
 * 
 * Cette classe dénommée "Engin" permettra
 * L'enregistrement et l'affichage d'un engin mécanique
 * utilisé sur la parcelle agricole de l'utilsateur
 *
 */
public class Engin implements IAfficher {
	
	/**
	 * Déclaration des propriétés
	 */	
	private String designation;
	private String etat;
	private int consoEssenceJour;
	
	/**
	 * Déclaration des propriétés constances
	 */	
	final private int prixEssence = 600;
	

	/**
	 * Déclaration du constructeur avec 3 paramètres
	 * @param designation
	 * @param etat
	 * @param consoEssanceJour
	 */	
	public Engin(String designation, String etat, int consoEssanceJour) {
		
		super();
		this.designation = designation;
		this.etat = etat;
		this.consoEssenceJour = consoEssanceJour;
		
		System.out.println(" (******* VOTRE ENGIN a été enregistré avec succès ************) ");
	}

	/**
	 * Déclaration de l'accesseur
	 * @return String
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * Déclaration du mutateur
	 * @param designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * Déclaration de l'accesseur
	 * @return String
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * Déclaration du mutateur
	 * @param etat
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}

	/**
	* Déclaration de l'accesseur
	 * @return int
	 */
	public int getConsoEssenceJour() {
		return consoEssenceJour;
	}

	/**
	 * Déclaration du mutateur
	 * @param consoEssenceJour
	 */
	public void setConsoEssenceJour(int consoEssenceJour) {
		this.consoEssenceJour = consoEssenceJour;
	}

	/**
	 * Implémentation de la méthode afficher de l'interface IAfficher
	 */	
	@Override
	public void afficher() {
		
		
		System.out.println("Designation: " + getDesignation() + "\nEtat: " + getEtat() + "\nObservation: " + getConsoEssenceJour());
		
	}
	
	public void coutTotalEssenceAnnuel() {
		
		System.out.println("Son cout total annuel en carburant est " + consoEssenceJour * prixEssence);
		
	}
	
	
	
	

}
