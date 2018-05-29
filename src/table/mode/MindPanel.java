package table.mode;

import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import system.control.MindController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.SystemColor;
import javax.swing.UIManager;

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
	
	
	
	
	public MindPanel(MindController appController)
	{
		
		super();
		appLayout = new SpringLayout();
		this.appController = appController;
		
		BlueButton = new JButton("Blue");
		BlueButton.setForeground(Color.BLUE);
		BlueButton.setBackground(Color.BLUE);
		
		RedButton = new JButton("Red");
		RedButton.setForeground(Color.RED);
		RedButton.setBackground(Color.RED);
		
		GreenButton = new JButton("Green");
		GreenButton.setForeground(Color.GREEN);
		GreenButton.setBackground(Color.GREEN);
		
		YellowButton = new JButton("Yellow");
		YellowButton.setForeground(new Color(255, 255, 0));
		YellowButton.setBackground(UIManager.getColor("Button.background"));
		
		WhiteButton = new JButton("White");
		WhiteButton.setForeground(Color.WHITE);
		WhiteButton.setBackground(Color.WHITE);
		
		OrangeButton = new JButton("Orange");
		OrangeButton.setForeground(Color.ORANGE);
		OrangeButton.setBackground(Color.ORANGE);
		
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
		this.setBackground(Color.GRAY);
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
		appLayout.putConstraint(SpringLayout.WEST, RedButton, 0, SpringLayout.WEST, BlueButton);
		appLayout.putConstraint(SpringLayout.SOUTH, RedButton, -6, SpringLayout.NORTH, BlueButton);
		appLayout.putConstraint(SpringLayout.NORTH, WhiteButton, 6, SpringLayout.SOUTH, OrangeButton);
		appLayout.putConstraint(SpringLayout.SOUTH, OrangeButton, -45, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, BlueButton, -6, SpringLayout.NORTH, OrangeButton);
		appLayout.putConstraint(SpringLayout.WEST, OrangeButton, 0, SpringLayout.WEST, BlueButton);
		appLayout.putConstraint(SpringLayout.EAST, BlueButton, -18, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, WhiteButton, -13, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, YellowButton, 0, SpringLayout.WEST, BlueButton);
		appLayout.putConstraint(SpringLayout.WEST, GreenButton, 0, SpringLayout.WEST, BlueButton);
		appLayout.putConstraint(SpringLayout.SOUTH, GreenButton, -6, SpringLayout.NORTH, RedButton);
		appLayout.putConstraint(SpringLayout.SOUTH, YellowButton, -2, SpringLayout.NORTH, GreenButton);
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
