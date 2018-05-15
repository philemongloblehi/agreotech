package com.agreotech.objis;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 17/12/2017
 * @version 1.0
 * 
 * Cette classe dénommée "Parcelle" permettra
 * L'enregistrement et l'affichage la parcelle agricole ou
 * ferme de l'utilsateur
 *
 */
public class Parcelle implements IAfficher {
	
	/**
	 * Déclaration des propriétés
	 */	
	private String designation;
	private String activite;
	private String observation;
	
	
	
	/**
	 * Déclaration du constructeur avec 3 paramètres
	 * @param designation
	 * @param activite
	 * @param observation
	 */	
	public Parcelle(String designation, String activite, String observation) {
		
		super();
		this.designation = designation;
		this.activite = activite;
		this.observation = observation;
		
		System.out.println(" (******* Votre parcelle a été enregistrée avec succès ************) ");
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
	public String getActivite() {
		return activite;
	}

	/**
	 * Déclaration du mutateur
	 * @param activite
	 */
	public void setActivite(String activite) {
		this.activite = activite;
	}

	/**
	 * Déclaration de l'accesseur
	 * @return String
	 */
	public String getObservation() {
		return observation;
	}

	/**
	 * Déclaration du mutateur
	 * @param observation
	 */
	public void setObservation(String observation) {
		this.observation = observation;
	}

	/**
	 * Implémentation de la méthode afficher de l'interface IAfficher
	 */	
	@Override
	public void afficher() {
		
		
		System.out.println("Designation: " + getDesignation() + "\nActivité: " + getActivite() + "\nObservation: " + getObservation());
		
	}
	
	

}
