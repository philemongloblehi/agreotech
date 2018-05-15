package com.agreotech.objis;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 17/12/2017
 * @version 1.0
 * 
 * Cette classe dénommée "Manoeuvre" permettra
 * L'enregistrement et l'affichage du manoeuvre
 * de la parcelle agricole ou ferme de l'utilsateur
 *
 */
public class Manoeuvre extends Employe {

	/**
	 * Déclaration du constructeur avec 6 paramètres
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param horaireDeTravail
	 * @param tarifHoraire
	 * @param fonction
	 */
	public Manoeuvre(String matricule, String nom, String prenom, int horaireDeTravail,
			int tarifHoraire, String fonction) {
		super(matricule, nom, prenom, horaireDeTravail, tarifHoraire, "Manoeuvre");
		
		System.out.println(" (******* Votre manoeuvre a été enregistré avec succès ************) ");		
		
	}

	
	/**
	 * Implémentation de la méthode afficher de la classe mère Employe
	 */
	@Override
	public void afficher() {
	
		
		
		
		System.out.println("Matricule " + getMatricule() + "\nNom " + getNom() + "\nPrenom " + getPrenom() + "\nFonction " + getFonction() + "\nTarif horaire " + getTarifHoraire() + "\nhoraire de travail " + getHoraireDeTravail());
		
	}

	

}
