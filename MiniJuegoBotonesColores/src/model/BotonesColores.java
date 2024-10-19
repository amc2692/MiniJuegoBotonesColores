package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

public class BotonesColores {
	private ArrayList<Color> listaColores;
	private ArrayList<Color> listaColoresGuess;
	
	public BotonesColores() {
		
		listaColores = new ArrayList<Color>();
		listaColoresGuess = new ArrayList<Color>();
		
		cargarColores();
	}
	
	private void cargarColores() {
		listaColores.add(Color.blue);
		listaColores.add(Color.red);
		listaColores.add(Color.pink);
		listaColores.add(Color.green);
		listaColores.add(Color.yellow);
		listaColores.add(Color.CYAN);
		listaColores.add(Color.orange);
		setearListaColoresGuess();
	}
	
	
	public void setearColoresToBotones(ArrayList<JButton> botonesUsuario) {
		int index = 0;
		for(JButton button : botonesUsuario ) {
			button.setBackground(listaColores.get(index));
			index ++;
		}
	}

	public void setearListaColoresGuess() {
		ArrayList<Color> setColores = new ArrayList<Color>();
		Random rand = new Random();
		int indexLookup = 0;
		while(setColores.size() < listaColores.size()) {
			int ranIndex = rand.nextInt(listaColores.size());
			if(!setColores.contains(listaColores.get(ranIndex)) && indexLookup != ranIndex){
				setColores.add(listaColores.get(ranIndex));
				indexLookup ++;
			}
		}
		
		listaColoresGuess = setColores;
	}

	
	public ArrayList<Color> getListaColores() {
		return listaColores;
	}
	public ArrayList<Color> getListaColoresGuess() {
		return listaColoresGuess;
	}

	public String printListaColores() {
		StringBuilder sb = new StringBuilder();
		for(Color c: listaColores) {
			sb.append(c.getRGB() + " ");
		}
		return sb.toString();
	}
	
}
