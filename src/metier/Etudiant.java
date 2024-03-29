package metier;

public class Etudiant {
	private String numEtudiant;
	private String prenom;
	private String nom;
	
	private Ecole ecole;
	
	// Constructeur
	public Etudiant(String numEtudiant, String prenom, String nom) {
		super();
		this.numEtudiant = numEtudiant;
		this.prenom = prenom;
		this.nom = nom;
	}
	
	public String faireExamen() {
		return prenom + " " + nom + " a fait l'examen";
	}
	
	public boolean inscrire() {
		return true;
	}

	public String getNumEtudiant() {
		return numEtudiant;
	}

	public void setNumEtudiant(String numEtudiant) {
		this.numEtudiant = numEtudiant;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Ecole getEcole() {
		return ecole;
	}

	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}

	@Override
	public String toString() {
		return "Etudiant [numEtudiant=" + numEtudiant + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
}
