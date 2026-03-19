package projet;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class FenetreAvecBouton extends JFrame{
	/**
	 * Método que visualiza botones para guiar al usuario
     * @author HatemHamdi
	 */
	

	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
 
		JButton bouton = new JButton("Cliquez ici !");
		panel.add(bouton);
 
		JButton bouton2 = new JButton("Ou l� !");
		panel.add(bouton2);
 
		return panel;
	}
}