package truc;

import java.awt.Color;
import java.util.Observable;

public class Modele extends Observable {
	public Color[] tabcouleur= {Color.yellow,Color.green,Color.blue,Color.magenta,Color.red,Color.pink,Color.black,Color.white};
	static int N_TENTATIVES = 10;
	public int DIFFICULTE = 4 ;
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
