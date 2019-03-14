package tp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperature extends JFrame implements ActionListener{
	//Creation des panel pour la presentation de la fenetre ainsi que du bonton pour convertir et du champ de saisie
	//Creation des label pour le texte
	private JPanel panel = new  JPanel();
	private JButton convert = new JButton("Convert");
	private JLabel cel = new JLabel("Celsius");
	private JLabel far = new JLabel("Fahrenheit");
	private TextField temp = new TextField();
	private JPanel south = new JPanel();
	private JPanel north = new JPanel();
	
	public Temperature() {
		super();
		build();
	}
	
	public void build(){
			
		//Initialistaion des parametre principaux de la page taille, nom,... etc	
		
			setTitle("Temperature");
			setSize(220,150);
			setLocationRelativeTo(null);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
	
			
			setContentPane(buildContentPane());
		}
	
public JPanel buildContentPane() {
	
	//Ajout d'un ActionListener au bouton
	
	convert.addActionListener(this);
	
	//Ajout des objet au panel
	
	south.add(convert, BorderLayout.WEST);
	south.add(far, BorderLayout.EAST);
	north.add(temp, BorderLayout.WEST);
	north.add(cel, BorderLayout.EAST);
	panel.add(north, BorderLayout.NORTH);
	panel.add(south, BorderLayout.SOUTH);
	
	return panel;
	
}

//Action a realiser lorsque que l'on appuie sur le boutton

	@Override
	public void actionPerformed(ActionEvent arg0) {
		double celsius;
		celsius = Double.parseDouble(temp.getText());//Recuperation de la valeur dans le champ de texte
		celsius = (celsius * (1.8)) + 32;//Conversion celsius a fahrenheit
		far.setText(""+celsius+" Fahrenheit");
	//Modifie le texte Fahrenheit pou le modifier et afficher la temperature en Fahrenheit
		
	}
	
}
