package visual;


import javax.swing.JFrame;

import javax.swing.JButton;

public class VentanaPrincipal {

	private JFrame frame;
	private JButton button1;
	private JButton button2;
	private JButton buttonComprobrar;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton buttonSalir;

	
	public VentanaPrincipal() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 539, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		buttonSalir = new JButton("SALIR");
		buttonSalir.setBounds(199, 329, 128, 23);
		frame.getContentPane().add(buttonSalir);
		
		buttonComprobrar = new JButton("COMPROBAR");
		buttonComprobrar.setBounds(199, 247, 128, 23);
		frame.getContentPane().add(buttonComprobrar);
		
		button1 = new JButton("");
		button1.setBounds(40, 120, 76, 67);
		frame.getContentPane().add(button1);
		
		button2 = new JButton("");
		button2.setBounds(126, 120, 76, 67);
		frame.getContentPane().add(button2);
		
		button3 = new JButton("");
		button3.setBounds(212, 120, 76, 67);
		frame.getContentPane().add(button3);
		
		button4 = new JButton("");
		button4.setBounds(298, 120, 76, 67);
		frame.getContentPane().add(button4);
		
		button5 = new JButton("");
		button5.setBounds(384, 120, 76, 67);
		frame.getContentPane().add(button5);
		
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
	
	
}
