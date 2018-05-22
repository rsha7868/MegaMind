package table.mode;

import javax.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

import system.control.MindController;
import table.mode.MindPanel;

public class MindDisplay extends JFrame
{
	private MindController appController;
	private MindPanel appPanel;
	
	{
		super();
		this.appController = appController;
		this.appPanel = new MindPanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("MegaMind");
		this.setSize(500, 500);
		this.setResizable(false);
		this.setVisible(true);
	}
}
