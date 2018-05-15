package com.agreotech.objis;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 17/12/2017
 * @version 1.0
 * 
 * Cette classe dénommée "Controleur" permettra
 * L'enregistrement et l'affichage du controleur
 * de la parcelle agricole ou ferme de l'utilsateur
 *
 */
public class Controleur extends Employe {
	

	/**
	 * Déclaration du constructeur avec 6 paramètres
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param fonction
	 * @param horaireDeTravail
	 * @param tarifHoraire
	 */
	public Controleur(String matricule, String nom, String prenom, int horaireDeTravail,
			int tarifHoraire, String fonction) {
		super(matricule, nom, prenom, horaireDeTravail, tarifHoraire, "Controleur");
		
		System.out.println(" (******* Votre controleur a été enregistré avec succès ************) ");		
		
	}

	/**
	 * Implémentation de la méthode afficher de la classe mère Employe
	 */
	@Override
	public void afficher() {
		
		
		
		System.out.println("Matricule " + getMatricule() + "\nNom " + getNom() + "\nPrenom " + getPrenom() + "\nFonction " + getFonction() + "\nTarif horaire " + getTarifHoraire() + "\nhoraire de travail " + getHoraireDeTravail() + "\n\n");
		
	}

	
}
