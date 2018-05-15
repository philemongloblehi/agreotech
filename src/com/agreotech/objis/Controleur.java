package com.agreotech.objis;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 17/12/2017
 * @version 1.0
 * 
 * Cette classe d�nomm�e "Controleur" permettra
 * L'enregistrement et l'affichage du controleur
 * de la parcelle agricole ou ferme de l'utilsateur
 *
 */
public class Controleur extends Employe {
	

	/**
	 * D�claration du constructeur avec 6 param�tres
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
		
		System.out.println(" (******* Votre controleur a �t� enregistr� avec succ�s ************) ");		
		
	}

	/**
	 * Impl�mentation de la m�thode afficher de la classe m�re Employe
	 */
	@Override
	public void afficher() {
		
		
		
		System.out.println("Matricule " + getMatricule() + "\nNom " + getNom() + "\nPrenom " + getPrenom() + "\nFonction " + getFonction() + "\nTarif horaire " + getTarifHoraire() + "\nhoraire de travail " + getHoraireDeTravail() + "\n\n");
		
	}

	
}
