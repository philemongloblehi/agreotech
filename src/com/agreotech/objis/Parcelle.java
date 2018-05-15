package com.agreotech.objis;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 17/12/2017
 * @version 1.0
 * 
 * Cette classe d�nomm�e "Parcelle" permettra
 * L'enregistrement et l'affichage la parcelle agricole ou
 * ferme de l'utilsateur
 *
 */
public class Parcelle implements IAfficher {
	
	/**
	 * D�claration des propri�t�s
	 */	
	private String designation;
	private String activite;
	private String observation;
	
	
	
	/**
	 * D�claration du constructeur avec 3 param�tres
	 * @param designation
	 * @param activite
	 * @param observation
	 */	
	public Parcelle(String designation, String activite, String observation) {
		
		super();
		this.designation = designation;
		this.activite = activite;
		this.observation = observation;
		
		System.out.println(" (******* Votre parcelle a �t� enregistr�e avec succ�s ************) ");
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
	public String getActivite() {
		return activite;
	}

	/**
	 * D�claration du mutateur
	 * @param activite
	 */
	public void setActivite(String activite) {
		this.activite = activite;
	}

	/**
	 * D�claration de l'accesseur
	 * @return String
	 */
	public String getObservation() {
		return observation;
	}

	/**
	 * D�claration du mutateur
	 * @param observation
	 */
	public void setObservation(String observation) {
		this.observation = observation;
	}

	/**
	 * Impl�mentation de la m�thode afficher de l'interface IAfficher
	 */	
	@Override
	public void afficher() {
		
		
		System.out.println("Designation: " + getDesignation() + "\nActivit�: " + getActivite() + "\nObservation: " + getObservation());
		
	}
	
	

}
