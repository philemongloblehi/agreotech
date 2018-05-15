package com.agreotech.objis;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 17/12/2017
 * @version 1.0
 * 
 * Cette classe abstraite dénommée "Employe" permettra
 * L'enregistrement et l'affichage l'employe de la ferme agricole
 *
 */
public abstract class Employe {
	
	/**
	 * Déclaration des propriétés
	 */
	private String matricule;
	private String nom;
	private String prenom;
	private int horaireDeTravail;
	private int tarifHoraire;
	private String fonction;

	
	/**
	 * Déclaration du constructeur avec 6 paramètres
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param horaireDeTravail
	 * @param tarifHoraire
	 * @param fonction
	 */
	public Employe(String matricule, String nom, String prenom, int horaireDeTravail, int tarifHoraire, String fonction ) {
		
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.horaireDeTravail = horaireDeTravail;
		this.tarifHoraire = tarifHoraire;
		this.fonction = fonction;
		
		
	}
	
	
	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getHoraireDeTravail() {
		return horaireDeTravail;
	}


	public void setHoraireDeTravail(int horaireDeTravail) {
		this.horaireDeTravail = horaireDeTravail;
	}


	public int getTarifHoraire() {
		return tarifHoraire;
	}


	public void setTarifHoraire(int tarifHoraire) {
		this.tarifHoraire = tarifHoraire;
	}


	public String getFonction() {
		return fonction;
	}


	public void setFonction(String fonction) {
		this.fonction = fonction;
	}


	public abstract void afficher();
	
	
	public void calculerSalaire(int horaireTravail, int tarifHoraire) {
		
		System.out.println("Son salaire est de " +  horaireTravail * tarifHoraire + " XOF");
	}
	
	

}
