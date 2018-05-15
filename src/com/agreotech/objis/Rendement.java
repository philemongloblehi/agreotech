package com.agreotech.objis;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 17/12/2017
 * @version 1.0
 * 
 * Cette classe d�nomm�e "Rendement" permettra
 * L'enregistrement et l'affichage du rendement
 * de l'utilsateur sur la parcelle agricole
 *
 */
public class Rendement implements IAfficher {
	
	/**
	 * D�claration des propri�t�s
	 */	
	private String designation;
	private String annee;
	private double totalRecolte;

	
	/**
	 * D�claration du constructeur avec 3 param�tres
	 * @param designation
	 * @param annee
	 * @param totalRecolte
	 */
	public Rendement(String designation, String annee, double totalRecolte) {
		
		super();
		this.designation = designation;
		this.annee = annee;
		this.totalRecolte = totalRecolte;
		
		System.out.println(" (******** Votre rendement a �t� enregistr� avec succ�s *********) ");
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
		
		
		System.out.println("Designation: " + getDesignation() + "\nActivit�: " + getAnnee() + "\nObservation: " + getTotalRecolte());
		
	}
	
	
	
	
	
	

}
