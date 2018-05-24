package table.mode;

import javax.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

import system.control.MindController;
import table.mode.MindPanel;

public class MindDisplay extends JFrame
{
	private MindDisplay brainDisplay;
	private MindController appController;
	private MindPanel appPanel;
	public MindDisplay()
	{
		super();
		brainDisplay = new MindDisplay();
		this.appController = appController;
		this.appPanel = new MindPanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(brainDisplay);
		this.setTitle("MegaMind");
		this.setSize(400, 1000);
		this.setResizable(false);
		this.setVisible(true);
	}
}
