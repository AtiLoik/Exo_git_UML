package metier;

import java.util.List;

public class Ecole {
	private String nomEcole;
	private String adresse;
	
	List<Etudiant> listeEtudiants;
	
	// Constructeur
	public Ecole(String nomEcole, String adresse, List<Etudiant> listeEtudiants) {
		super();
		this.nomEcole = nomEcole;
		this.adresse = adresse;
		this.listeEtudiants = listeEtudiants;
	}

	public String getNomEcole() {
		return nomEcole;
	}

	public void setNomEcole(String nomEcole) {
		this.nomEcole = nomEcole;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Etudiant> getListeEtudiants() {
		return listeEtudiants;
	}

	public void setListeEtudiants(List<Etudiant> listeEtudiants) {
		this.listeEtudiants = listeEtudiants;
	}

	@Override
	public String toString() {
		return "Ecole [nomEcole=" + nomEcole + ", adresse=" + adresse + ", listeEtudiants=" + listeEtudiants + "]";
	}
}
