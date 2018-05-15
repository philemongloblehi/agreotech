package com.agreotech.objis;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 17/12/2017
 * @version 1.0
 * 
 * Cette classe dénommée "Rendement" permettra
 * L'enregistrement et l'affichage du rendement
 * de l'utilsateur sur la parcelle agricole
 *
 */
public class Rendement implements IAfficher {
	
	/**
	 * Déclaration des propriétés
	 */	
	private String designation;
	private String annee;
	private double totalRecolte;

	
	/**
	 * Déclaration du constructeur avec 3 paramètres
	 * @param designation
	 * @param annee
	 * @param totalRecolte
	 */
	public Rendement(String designation, String annee, double totalRecolte) {
		
		super();
		this.designation = designation;
		this.annee = annee;
		this.totalRecolte = totalRecolte;
		
		System.out.println(" (******** Votre rendement a été enregistré avec succès *********) ");
	}

	
	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getAnnee() {
		return annee;
	}


	public void setAnnee(String annee) {
		this.annee = annee;
	}


	public double getTotalRecolte() {
		return totalRecolte;
	}


	public void setTotalRecolte(double totalRecolte) {
		this.totalRecolte = totalRecolte;
	}


	/**
	 * 
	 */
	@Override
	public void afficher() {
		
		
		System.out.println("Designation: " + getDesignation() + "\nActivité: " + getAnnee() + "\nObservation: " + getTotalRecolte());
		
	}
	
	
	
	
	
	

}
