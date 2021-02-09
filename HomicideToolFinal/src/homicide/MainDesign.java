/**
 * Main GUI for Homicide Search Tool.
 * 
 * Version 1.0
 * @author Neil Doherty
 * 
 */

package homicide;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainDesign implements ActionListener {
	
	
	//Create main frame
	JFrame openingFrame;
	JPanel searchPanel;

	Dimension screenSize = new Dimension(500, 225);
	Dimension buttonSize = new Dimension(100, 50);

	//Logo
	String logoPath = "assets/logo.png";
	ImageIcon logo = new ImageIcon(logoPath);
	
	//Array of buttons
	JButton[] buttons = new JButton[4];
	
	
	//Array of fields
	JTextField[] fields = new JTextField[3];
	
	
	//Array of labels
	JLabel[] labels = new JLabel[3];
	
	String userBeneInput;
	String userInsuredInput;
	String userDateInput;
	String userCityInput;
	
	
	
	public void mainDesign() {
		
		buttons[0] = new JButton("Begin Search");
		buttons[1] = new JButton("Print Results");
		buttons[2] = new JButton("Clear Data");
		buttons[3] = new JButton("Quit");
		
		
		fields[0] = new JTextField(36); //Bene name
	    fields[1] = new JTextField(36); //Insured name
	    fields[2] = new JTextField(36); //Homicide date
	    
	    labels[0] = new JLabel("Enter Beneficiary Name: ");
	    labels[1] = new JLabel("Enter Insured's Name: ");
	    labels[2] = new JLabel("Enter date of the homicide: ");
	    
	    
		//Create opening Frame and Panel
		openingFrame = new JFrame("Homicide Search Tool");
		openingFrame.setLayout(new BorderLayout());
		openingFrame.setPreferredSize(screenSize);
		openingFrame.setIconImage(logo.getImage());
		openingFrame.setVisible(true);
		openingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		searchPanel = new JPanel();
		
	  
		
        //Add labels and text fields
		for (int i = 0; i < labels.length; i++) {
			searchPanel.add(labels[i], BorderLayout.SOUTH);
			searchPanel.add(fields[i], BorderLayout.SOUTH);
		}
		
		//Add buttons
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(this);
			buttons[i].setFont(new Font("Arial", Font.BOLD, 12));
			buttons[i].setForeground(Color.BLACK);
			searchPanel.add(buttons[i]);
		}
		
	
		openingFrame.add(searchPanel);
		searchPanel.setVisible(true);
		openingFrame.pack();

	}

	public void actionPerformed(ActionEvent userChoice){
		
		HomicideSearch search = new HomicideSearch();
		
		//Begin search button is pushed
		if (userChoice.getSource() == buttons[0]) {
							
			userBeneInput = fields[0].getText();
			userInsuredInput = fields[1].getText();
			userDateInput = fields[2].getText();

			search.chromeSearch(userBeneInput, userInsuredInput, userDateInput);
				
		}
		
		//Print Results
		if (userChoice.getSource() == buttons[1]) {
			
			String searchResults = "Online search conducted for \"" + userInsuredInput + " murdered by " + userBeneInput + 
					   "\", \"Homicide involving " + userInsuredInput + " and " + userBeneInput + "\", and \"" +
					   userInsuredInput + " murdered by " + userBeneInput + " on " + userDateInput + "\" returned" +
					   " no relevant results.";

			search.outputSearchDataToFile(searchResults);
		}
		
		//Clear Data
		if (userChoice.getSource() == buttons[2]) {
 			for (int i = 0; i < fields.length; i++) {
    		fields[i].setText("");
 			}
		}
		
		//Quit program
		if (userChoice.getSource() == buttons[3]) {
			System.exit(0);
		}
	
	}
	
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			@Override public void run() {				
				MainDesign gui = new MainDesign();
				gui.mainDesign();
			
			}	
		});
		
		
	}
}
