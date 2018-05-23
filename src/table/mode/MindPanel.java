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

public class MindPanel extends JPanel
{
	private MindController appController;
	
	private JButton BlueButton;
	private JButton YellowButton;
	private JButton GreenButton;
	private JButton WhiteButton;
	private JButton OrangeButton;
	private JButton RedButton;
	
	private SpringLayout appLayout;
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
		
		appLayout = new SpringLayout();
		
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
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(appLayout);
		this.add(BlueButton);
		this.add(RedButton);
		this.add(GreenButton);
		this.add(YellowButton);
		this.add(WhiteButton);
		this.add(OrangeButton);
		
	}
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, OrangeButton, 6, SpringLayout.SOUTH, OrangeButton);
		appLayout.putConstraint(SpringLayout.EAST, OrangeButton, 0, SpringLayout.EAST, OrangeButton);
		appLayout.putConstraint(SpringLayout.NORTH, WhiteButton, 6, SpringLayout.SOUTH, WhiteButton);
		appLayout.putConstraint(SpringLayout.WEST, WhiteButton, 0, SpringLayout.WEST, WhiteButton);
		appLayout.putConstraint(SpringLayout.NORTH, YellowButton, 6, SpringLayout.SOUTH, YellowButton);
		appLayout.putConstraint(SpringLayout.WEST, YellowButton, 0, SpringLayout.WEST, YellowButton);
		appLayout.putConstraint(SpringLayout.NORTH, GreenButton, 6, SpringLayout.SOUTH, GreenButton);
		appLayout.putConstraint(SpringLayout.WEST, GreenButton, 0, SpringLayout.WEST, GreenButton);
		appLayout.putConstraint(SpringLayout.SOUTH, RedButton, 6, SpringLayout.SOUTH, RedButton);
		appLayout.putConstraint(SpringLayout.EAST, RedButton, 0, SpringLayout.EAST, RedButton);
		appLayout.putConstraint(SpringLayout.NORTH, BlueButton, 6, SpringLayout.SOUTH, BlueButton);
		appLayout.putConstraint(SpringLayout.WEST, BlueButton, 0, SpringLayout.WEST, BlueButton);
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
