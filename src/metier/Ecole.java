package metier;

import java.util.List;

public class Ecole {
	private String nomEcole;
	private String adresseEcole;
	
	private List<Etudiant> listeEtudiants;
	
	// Constructeurs
	public Ecole(String nomEcole, String adresse, List<Etudiant> listeEtudiants) {
		super();
		this.nomEcole = nomEcole;
		this.adresseEcole = adresse;
		this.listeEtudiants = listeEtudiants;
	}

	public Ecole(String nomEcole, String adresse) {
		super();
		this.nomEcole = nomEcole;
		this.adresseEcole = adresse;
	}

	public String getNomEcole() {
		return nomEcole;
	}

	public void setNomEcole(String nomEcole) {
		this.nomEcole = nomEcole;
	}

	public String getAdresse() {
		return adresseEcole;
	}

	public void setAdresse(String adresse) {
		this.adresseEcole = adresse;
	}

	public List<Etudiant> getListeEtudiants() {
		return listeEtudiants;
	}

	public void setListeEtudiants(List<Etudiant> listeEtudiants) {
		this.listeEtudiants = listeEtudiants;
	}

	@Override
	public String toString() {
		return "Ecole [nomEcole=" + nomEcole + ", adresse=" + adresseEcole + "]";
	}
}
