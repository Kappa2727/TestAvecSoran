package truc;

import java.awt.Color;

public class Rang�e {
	public Color[] jeton;
	public int indiceJeton = 0;
	public int[] resultat = new int[2];
	
	public Modele modlRang;
	
	public Rang�e() {
		this.modlRang=new Modele();
		this.jeton = new Color[this.modlRang.DIFFICULTE];
	}
}
