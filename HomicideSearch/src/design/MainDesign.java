package design;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainDesign implements ActionListener {
	
	//Create main buttons
	JButton beginSearch;
	JButton printResults;
	JButton clearData;
	JButton quit;
	
	//Create main frame
	JFrame openingFrame;
	JFrame searchFrame;
	JFrame printFrame;
	JFrame clearDataFrame;
	
	//Create text area
	JTextArea searchArea;
	JTextArea printArea;
	JTextArea clearDataArea;
	JTextArea quitArea;

	Dimension screenSize = new Dimension(500, 500);
	Dimension buttonSize = new Dimension(125, 50);
	
	public MainDesign() {
		
		//Label buttons
		beginSearch = new JButton("Begin Search");
		printResults = new JButton("Print Results");
		clearData = new JButton("Clear Data");
		quit = new JButton("Quit");
		
		//Create opening Frame
		openingFrame = new JFrame("Homicide Search Tool");
		
		searchArea = new JTextArea(5, 40);
		printArea = new JTextArea(5, 40);
		clearDataArea = new JTextArea(5, 40);
		quitArea = new JTextArea(5, 40);
		
		//button action listeners
		beginSearch.addActionListener(this);
		printResults.addActionListener(this);
		clearData.addActionListener(this);
		quit.addActionListener(this);
		
		//Opening Frame design
		openingFrame.setLayout(new BorderLayout());

		openingFrame.setPreferredSize(screenSize);
		openingFrame.pack();
		
		//button design
		openingFrame.add(beginSearch, BorderLayout.EAST);
		beginSearch.setPreferredSize(buttonSize);
		openingFrame.add(printResults, BorderLayout.CENTER);
		printResults.setPreferredSize(buttonSize);
		openingFrame.add(clearData, BorderLayout.WEST);
		clearData.setPreferredSize(buttonSize);
		openingFrame.add(quit, BorderLayout.SOUTH);
		quit.setPreferredSize(buttonSize);
		
		openingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		openingFrame.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e){
		
		//Begin search button is pushed
		if (e.getSource() == beginSearch) {
			
			searchFrame = new JFrame("Search Tool");
	        searchFrame.setLayout(new BorderLayout());
	        searchFrame.setVisible(true);
	        
	        //set frame size
	        searchFrame.setPreferredSize(new Dimension(450, 300));
	        searchFrame.pack();
	        
	        //Text field labels
	        JLabel beneName = new JLabel("Enter Beneficiary Name: ");
	        JLabel insuredName = new JLabel("Enter Insured's Name: ");
	        JLabel date = new JLabel("Enter date of the homicide: ");
	        JLabel city = new JLabel("Enter the city where the homicide happened: ");
	        
	        //Text fields
	        JTextField beneField = new JTextField(36);
	        JTextField insuredField = new JTextField(36);
	        JTextField dateField = new JTextField(36);
	        JTextField cityField = new JTextField(36);
	        
	        //Search, print, clear, quit buttons
			beginSearch = new JButton("Begin Search");
			printResults = new JButton("Print Results");
			clearData = new JButton("Clear Data");
			quit = new JButton("Quit");
	        
	        //Panel for search data
	        JPanel searchPanel = new JPanel();
	        
	        //Implement labels and fields
	        searchPanel.add(beneName);
	        searchPanel.add(beneField);
	        searchPanel.add(insuredName);
	        searchPanel.add(insuredField);
	        searchPanel.add(date);
	        searchPanel.add(dateField);
	        searchPanel.add(city);
	        searchPanel.add(cityField);
	        searchPanel.add(beginSearch);
	        searchPanel.add(printResults);
	        searchPanel.add(clearData);
	        searchPanel.add(quit);
	        
	        searchFrame.add(searchPanel);
	        
	        
		
		}
		//FIXME implement print results button
		if (e.getSource() == printResults) {
			
		}
		//FIXME implement clear data button
		if (e.getSource() == clearData) {
			
		}
		//FIXME implement quit button
		if (e.getSource() == quit) {
			
		}
		
	}
	
	public static void main(String args[]) {
		MainDesign design = new MainDesign();
		
	}
}
