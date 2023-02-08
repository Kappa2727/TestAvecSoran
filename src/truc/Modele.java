package truc;

import java.awt.Color;
import java.util.Observable;

public class Modele extends Observable {
	public static Color COULEURS[] = {Color.black, Color.blue, Color.green, Color.magenta, Color.red, Color.orange, Color.white, Color.yellow};
	static int N_TENTATIVES = 10;
	public static int DIFFICULTE = 4;
	public enum Etat {
		EN_COURS,
		GAGNE,
		PERDU;
		
	public Etat etat;
	public Rangée combinaison;
	public Rangée[] proposition;
	public int tentative;
	}	
	public Modele() {
		
	}
}
