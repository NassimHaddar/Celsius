package tp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperature extends JFrame implements ActionListener{
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
			
			setTitle("Ma première fenêtre");
			setSize(220,150);
			setLocationRelativeTo(null);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
	
			
			setContentPane(buildContentPane());
		}
	
public JPanel buildContentPane() {
		
	convert.addActionListener(this);
	
	south.add(convert, BorderLayout.WEST);
	south.add(far, BorderLayout.EAST);
	north.add(temp, BorderLayout.WEST);
	north.add(cel, BorderLayout.EAST);
	panel.add(north, BorderLayout.NORTH);
	panel.add(south, BorderLayout.SOUTH);
	
	return panel;
	
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		double celsius;
		celsius = Double.parseDouble(temp.getText());
		celsius = (celsius * (1.8)) + 32;
		far.setText(""+celsius+" Fahrenheit");
		
	}
	
}
