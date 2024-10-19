package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ColorModel;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.BotonesColores;
import visual.VentanaPrincipal;

public class Controller {

	private VentanaPrincipal interfazUsuario;
	private BotonesColores juegoBotones;
	private boolean buttonPressed;
	private int indexButtonPressed;
	private int contadorMov;
	
	public Controller() {
		interfazUsuario = new VentanaPrincipal();
		juegoBotones = new BotonesColores();
		indexButtonPressed = 0;
		contadorMov = 0;
		darFuncionalidadToBotones();
		comprobarColoresPosicionados();
	}

	private void darFuncionalidadToBotones() {
		setearBotones();
			
		interfazUsuario.getButtonSalir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfazUsuario.getFrame().dispose();
			}
		});
		
		interfazUsuario.getButtonComprobrar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprobarColoresPosicionados();
				if(juegoCompleto()) {
					JOptionPane.showMessageDialog(null, "YOU WON!!! \nIn "+ contadorMov + " movements");
				}
			}
		});
		
		for(JButton button: interfazUsuario.getButtonsUsuario()) {
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!buttonPressed) {
						indexButtonPressed = interfazUsuario.getButtonsUsuario().indexOf(button);
						buttonPressed = true;
					}
					else {
						interCambiarColores(button);
						indexButtonPressed = 0;
						buttonPressed = false;
						contadorMov ++;
						interfazUsuario.getLabelMovements().setText(contadorMov +"");
					}
				}

			});
		}
	}
	
	private void setearBotones() {
		juegoBotones.setearColoresToBotones(interfazUsuario.getButtonsUsuario());
	}
	
	private void interCambiarColores(JButton buttonPressed) {
		Color colorAux = buttonPressed.getBackground();
		buttonPressed.setBackground(interfazUsuario.getButtonsUsuario().get(indexButtonPressed).getBackground());
		interfazUsuario.getButtonsUsuario().get(indexButtonPressed).setBackground(colorAux);
		
	}
	
	private boolean juegoCompleto() {
		boolean flag = true;
		int index = 0;
		for(JButton button : interfazUsuario.getButtonsUsuario()) {
			flag &= button.getBackground().equals(juegoBotones.getListaColoresGuess().get(index));
			index ++;
		}
		return flag;
	}
	
	private void comprobarColoresPosicionados() {
		int index = 0;
		for(JButton button : interfazUsuario.getButtonsUsuario()) {
			if(button.getBackground().equals(juegoBotones.getListaColoresGuess().get(index))) {
				interfazUsuario.getButtonsGuessUsuario().get(index).setBackground(Color.green);
			}
			else {
				interfazUsuario.getButtonsGuessUsuario().get(index).setBackground(Color.RED);
			}
			index ++;
		}
	}
	
}
