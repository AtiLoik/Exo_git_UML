package Presentation;
import java.util.ArrayList;
import java.util.List;

import metier.*;

public class Lanceur {

	public static void main(String[] args) {
		List<Etudiant> etudiantsInscrits = new ArrayList<Etudiant>();
		
		Etudiant etudiant1 = new Etudiant("1", "Morgan", "Franca");
		Etudiant etudiant2 = new Etudiant("2", "Loik", "Breton");
		
		Ecole ecole = new Ecole("ENSUP", "1 bis Avenue du 8 mai 1945", new ArrayList<Etudiant>());

		if(etudiant1.inscrire())
			etudiantsInscrits.add(etudiant1);
		
		if(etudiant2.inscrire())
			etudiantsInscrits.add(etudiant2);
		
		ecole.setListeEtudiants(etudiantsInscrits);
		
		System.out.println(ecole.toString());
	}

}
