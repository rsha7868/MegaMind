package table.mode;
import system.control.MindRunner;

import javax.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

import system.control.MindController;
import javax.swing.SwingConstants;

public class MindPanel extends JPanel
{
	private MindController appController;
	private SpringLayout appLayout;
	
	private JButton BlueButton;
	private JButton YellowButton;
	private JButton GreenButton;
	private JButton WhiteButton;
	private JButton OrangeButton;
	private JButton RedButton;
	private JButton btnHelloBoss;
	
	
	public MindPanel(MindController appController)
	{
		super();
		this.appController = appController;
		
		BlueButton = new JButton("Blue");
		RedButton = new JButton("Red");
		GreenButton = new JButton("Green");
		YellowButton = new JButton("Yellow");
		WhiteButton = new JButton("White");
		OrangeButton = new JButton("Orange");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	/**
	 * Used to add all the components to the screen and install a layout manager.
	 * Also set Color.
	 */
	private void setupPanel()
	{
		this.setForeground(Color.BLACK);
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(appLayout);
		

		
		appLayout = new SpringLayout();
		
		add(BlueButton);
		add(RedButton);
		add(GreenButton);
		add(YellowButton);
		add(WhiteButton);
		add(OrangeButton);
		
		
		BlueButton.setBackground(Color.BLUE);
		RedButton.setBackground(Color.RED);
		GreenButton.setBackground(Color.GREEN);
		YellowButton.setBackground(Color.YELLOW);
		WhiteButton.setBackground(Color.WHITE);
		OrangeButton.setBackground(Color.ORANGE);
		
	}
	private void setupLayout()
	{
//		appLayout.putConstraint(SpringLayout.NORTH, OrangeButton, 10, SpringLayout.SOUTH, OrangeButton);
//		appLayout.putConstraint(SpringLayout.EAST, OrangeButton, 0, SpringLayout.EAST, OrangeButton);
//		appLayout.putConstraint(SpringLayout.NORTH, WhiteButton, 20, SpringLayout.SOUTH, WhiteButton);
//		appLayout.putConstraint(SpringLayout.WEST, WhiteButton, 10, SpringLayout.WEST, WhiteButton);
//		appLayout.putConstraint(SpringLayout.NORTH, YellowButton, 30, SpringLayout.SOUTH, YellowButton);
//		appLayout.putConstraint(SpringLayout.WEST, YellowButton, 20, SpringLayout.WEST, YellowButton);
//		appLayout.putConstraint(SpringLayout.NORTH, GreenButton, 40, SpringLayout.SOUTH, GreenButton);
//		appLayout.putConstraint(SpringLayout.WEST, GreenButton, 30, SpringLayout.WEST, GreenButton);
//		appLayout.putConstraint(SpringLayout.SOUTH, RedButton, 50, SpringLayout.SOUTH, RedButton);
//		appLayout.putConstraint(SpringLayout.EAST, RedButton, 40, SpringLayout.EAST, RedButton);
//		appLayout.putConstraint(SpringLayout.NORTH, BlueButton, 60, SpringLayout.SOUTH, BlueButton);
//		appLayout.putConstraint(SpringLayout.WEST, BlueButton, 50, SpringLayout.WEST, BlueButton);
	}
	private void setupListeners()
	{
//		firstButton.addActionListener(new ActionListener()
//			{
//			public void actionPerformed(ActionEvent click)
//				{
//					changeScreenColor();
//				}
//			
//			});
	}
}
