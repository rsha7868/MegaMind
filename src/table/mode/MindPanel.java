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
	private JButton firstButton;
	private SpringLayout appLayout;
	public MindPanel(MindController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Click on  the button");
		
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
		this.setBackground(Color.BLUE);
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
		firstButton.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent click)
				{
					changeScreenColor();
				}
			
			});
	}
	private void changeScreenColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
		
	}
}
