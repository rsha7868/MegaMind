package table.mode;
import system.control.MindRunner;

import javax.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

import system.control.MindController;

public class MindPanel
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
		this.add(firstButton);
		
	}
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, firstButton, 97, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, firstButton, 80, SpringLayout.WEST, this);
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
