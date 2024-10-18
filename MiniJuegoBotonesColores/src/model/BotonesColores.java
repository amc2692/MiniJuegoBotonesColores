package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import javax.swing.JButton;

public class BotonesColores {
	ArrayList<Color> listaColores;
	ArrayList<JButton> listaBotones;
	
	public BotonesColores() {
		listaBotones = new ArrayList<JButton>();
		listaColores = new ArrayList<Color>();
	}
	
	private void cargarColroes() {
		listaColores.add(Color.blue);
		listaColores.add(Color.red);
		listaColores.add(Color.pink);
		listaColores.add(Color.green);
		listaColores.add(Color.yellow);
	}
	
	private void sortearColores() {
		ArrayList<Color> setColores = new ArrayList<Color>();
		Random rand = new Random();
		
		int num = rand.nextInt(listaColores.size());
		
		
	}
}
