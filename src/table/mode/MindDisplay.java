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
	public MindDisplay(MindController appController)
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
		this.setSize(1000, 200);
		this.setResizable(false);
		this.setVisible(true);
	}
}
