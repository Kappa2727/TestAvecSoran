package truc;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Application extends Frame implements WindowListener {
	
	public VueClavier vc;
	
	public Canvas Propositions;
	

	public static void main(String[] args) {
		new Application();
	}

	public Application() {
		super();
		
		
		this.setSize(1000,1000);
		this.setBackground(Color.white);
		
		this.setLayout(new BorderLayout());
		
		Modele modl = new Modele();
		//Controleur ctrl = new Controleur(modl); 
		
		this.vc=new VueClavier();
		
		this.add(vc,BorderLayout.SOUTH);
		
		
		/*
		Vue vue = new Vue();
		modl.addObserver(vue);
		vue.addActionListener(ctrl);
		
		setLocationRelativeTo(null);
		this.setTitle("MasterMind");
		*/
		this.addWindowListener(this);
		/*
		this.add(vue);
		*/
		
		
		
		
		this.setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
		
	}

}
