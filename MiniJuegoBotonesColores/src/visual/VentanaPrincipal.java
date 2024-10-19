package visual;

import javax.swing.JFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class VentanaPrincipal {

	private JFrame frame;
	private JButton buttonComprobrar;
	private JButton buttonSalir;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	
	private JButton buttonGuess1;
	private JButton buttonGuess2;
	private JButton buttonGuess3;
	private JButton buttonGuess4;
	private JButton buttonGuess5;
	private JButton buttonGuess6;
	private JButton buttonGuess7;
	
	private ArrayList<JButton> buttonsUsuario;
	private ArrayList<JButton> buttonsGuessUsuario;
	private JLabel labelMovements;

	public VentanaPrincipal() {
		initialize();
		buttonsUsuario = new ArrayList<JButton>();
		buttonsGuessUsuario = new ArrayList<JButton>();
		buttonsUsuario.add(button1);
		buttonsUsuario.add(button2);
		buttonsUsuario.add(button3);
		buttonsUsuario.add(button4);
		buttonsUsuario.add(button5);
		buttonsUsuario.add(button6);
		buttonsUsuario.add(button7);
		
		buttonsGuessUsuario.add(buttonGuess1);
		buttonsGuessUsuario.add(buttonGuess2);
		buttonsGuessUsuario.add(buttonGuess3);
		buttonsGuessUsuario.add(buttonGuess4);
		buttonsGuessUsuario.add(buttonGuess5);
		buttonsGuessUsuario.add(buttonGuess6);
		buttonsGuessUsuario.add(buttonGuess7);
		
		JLabel lblNewLabel = new JLabel("MOVEMENTS: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 93, 23);
		frame.getContentPane().add(lblNewLabel);
		
		labelMovements = new JLabel("0");
		labelMovements.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelMovements.setBounds(103, 14, 29, 17);
		frame.getContentPane().add(labelMovements);
		
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 628, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		buttonSalir = new JButton("EXIT");
		buttonSalir.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonSalir.setBounds(241, 329, 128, 23);
		frame.getContentPane().add(buttonSalir);

		buttonComprobrar = new JButton("CHECK");
		buttonComprobrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonComprobrar.setBounds(241, 261, 128, 23);
		frame.getContentPane().add(buttonComprobrar);

		button1 = new JButton();
		button1.setBounds(10, 100, 76, 67);
		frame.getContentPane().add(button1);

		button2 = new JButton();
		button2.setBounds(96, 100, 76, 67);
		frame.getContentPane().add(button2);

		button3 = new JButton();
		button3.setBounds(182, 100, 76, 67);
		frame.getContentPane().add(button3);

		button4 = new JButton();
		button4.setBounds(268, 100, 76, 67);
		frame.getContentPane().add(button4);

		button5 = new JButton();
		button5.setBounds(354, 100, 76, 67);
		frame.getContentPane().add(button5);

		button6 = new JButton();
		button6.setBounds(440, 100, 76, 67);
		frame.getContentPane().add(button6);

		button7 = new JButton();
		button7.setBounds(526, 100, 76, 67);
		frame.getContentPane().add(button7);

		buttonGuess1 = new JButton();;
		buttonGuess1.setBounds(10, 196, 76, 23);
		frame.getContentPane().add(buttonGuess1);

		buttonGuess2 = new JButton();
		buttonGuess2.setBounds(96, 196, 76, 23);
		frame.getContentPane().add(buttonGuess2);

		buttonGuess3 = new JButton();
		buttonGuess3.setBounds(182, 196, 76, 23);
		frame.getContentPane().add(buttonGuess3);

		buttonGuess4 = new JButton();
		buttonGuess4.setBounds(268, 196, 76, 23);
		frame.getContentPane().add(buttonGuess4);

		buttonGuess5 = new JButton();
		buttonGuess5.setBounds(354, 196, 76, 23);
		frame.getContentPane().add(buttonGuess5);

		buttonGuess6 = new JButton();
		buttonGuess6.setBounds(440, 196, 76, 23);
		frame.getContentPane().add(buttonGuess6);

		buttonGuess7 = new JButton();
		buttonGuess7.setBounds(526, 196, 76, 23);
		frame.getContentPane().add(buttonGuess7);

		frame.setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}

	public JButton getButton1() {
		return button1;
	}

	public JButton getButton2() {
		return button2;
	}

	public JButton getButtonComprobrar() {
		return buttonComprobrar;
	}

	public JButton getButton3() {
		return button3;
	}

	public JButton getButton4() {
		return button4;
	}

	public JButton getButton5() {
		return button5;
	}

	public JButton getButtonSalir() {
		return buttonSalir;
	}

	public JButton getButton6() {
		return button6;
	}

	public JButton getButton7() {
		return button7;
	}

	public JButton getButtonGuess1() {
		return buttonGuess1;
	}

	public JButton getButtonGuess2() {
		return buttonGuess2;
	}

	public JButton getButtonGuess3() {
		return buttonGuess3;
	}

	public JButton getButtonGuess4() {
		return buttonGuess4;
	}

	public JButton getButtonGuess5() {
		return buttonGuess5;
	}

	public JButton getButtonGuess6() {
		return buttonGuess6;
	}

	public JButton getButtonGuess7() {
		return buttonGuess7;
	}
	
	public JLabel getLabelMovements() {
		return labelMovements;
	}
	
	public ArrayList<JButton> getButtonsUsuario() {
		return buttonsUsuario;
	}
	
	public ArrayList<JButton> getButtonsGuessUsuario() {
		return buttonsGuessUsuario;
	}
}
