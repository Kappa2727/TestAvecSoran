package truc;

import java.awt.Color;
import java.util.Observable;

public class Modele extends Observable {


	public Color[] tabcouleur= {Color.yellow,Color.green,Color.blue,Color.magenta,Color.red,Color.pink,Color.black,Color.white};
	public int N_TENTATIVES = 10;
	
	public int DIFFICULTE;
	public enum Etat {
		EN_COURS,
		GAGNE,
		PERDU;
	}
}
