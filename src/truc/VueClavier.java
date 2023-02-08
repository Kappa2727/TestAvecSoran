package truc;

import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;

public class VueClavier extends Panel{
	
	public Modele modlVueClavier;
	
	public Button bJAUNE=new Button();
	public Button bVERT=new Button();
	public Button bBLEU=new Button();
	public Button bMAGENTA=new Button();
	public Button bROUGE=new Button();
	public Button bORANGE=new Button();
	public Button bBLANC=new Button();
	public Button bNOIR=new Button();
	
	public Button[] tabBouton= {bJAUNE,bVERT,bBLEU,bMAGENTA,bROUGE,bORANGE,bNOIR,bBLANC};
	
	public VueClavier() {
		
		this.modlVueClavier=new Modele();
		
		this.setBackground(Color.gray);
		this.setBounds(50, 10, 200, 200);
		
		for(int i=0; i<this.modlVueClavier.tabcouleur.length;i++) {
			tabBouton[i].setBounds((10*i)+2, 10, 10, 10);
			tabBouton[i].setBackground(this.modlVueClavier.tabcouleur[i]);
		}
		
		
		for(int i=0; i<tabBouton.length;i++) {
			this.add(tabBouton[i]);
		}
	}

}
