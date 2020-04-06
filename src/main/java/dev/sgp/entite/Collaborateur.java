package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	/** Matricule */
	Double matricule;
	/** nom */
	String nom;
	/** prenom */
	String prenom;
	/** date de Naissance */
	LocalDate dateNaissance;
	/** adresse */
	String adresse;
	/** numéro de sécurité socialle */
	String numSecu;
	/** email professionnel */
	String emailPro;
	/** photo */
	String photo;
	/** date et heure de creation */
	ZonedDateTime dateHeureCreation;
	/** actif */
	Boolean actif;
	
	
	/** Constructeur d'un coollaborateur
	 * @param matricule2 du collaborateur
	 * @param nom du collaborateur
	 * @param prenom du collaborateur
	 * @param dateNaissance2 du collaborateur
	 * @param adresse du collaborateur
	 * @param numSecu du collaborateur
	 * @param emailPro du collaborateur
	 * @param dateHeureCreation du collaborateur
	 * @param actif 
	 */
	public Collaborateur(Double matricule, String nom, String prenom, LocalDate dateNaissance, String adresse,
			String numSecu, String emailPro, ZonedDateTime dateHeureCreation, Boolean actif) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.numSecu = numSecu;
		this.emailPro = emailPro;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}


	public Double getMatricule() {
		return matricule;
	}


	public void setMatricule(Double matricule) {
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


	public LocalDate getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getNumSecu() {
		return numSecu;
	}


	public void setNumSecu(String numSecu) {
		this.numSecu = numSecu;
	}


	public String getEmailPro() {
		return emailPro;
	}


	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}


	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}


	public Boolean getActif() {
		return actif;
	}


	public void setActif(Boolean actif) {
		this.actif = actif;
	}


	@Override
	public String toString() {
		return "Collaborateur [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
				+ dateNaissance + ", adresse=" + adresse + ", numSecu=" + numSecu + ", emailPro=" + emailPro
				+ ", photo=" + photo + ", dateHeureCreation=" + dateHeureCreation + ", actif=" + actif + "]";
	}
}
