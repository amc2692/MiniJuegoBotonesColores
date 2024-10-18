package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.VentanaPrincipal;

public class Controller {

	VentanaPrincipal interfazUsuario;
	
	public Controller() {
		interfazUsuario = new VentanaPrincipal();
		inicializarBotones();
	}

	private void inicializarBotones() {
		interfazUsuario.getButtonSalir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfazUsuario.getFrame().dispose();
			}
		});
	}
}
