package table.mode;

import javax.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

import system.control.MindController;
import table.mode.MindPanel;

public class MindFrame extends JFrame
{
	private MindFrame brainFrame;
	private MindController appController;
	private MindPanel appPanel;
	public MindFrame()
	{
		super();
		brainFrame = new MindFrame();
		this.appController = appController;
		this.appPanel = new MindPanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(brainFrame);
		this.setTitle("MegaMind");
	}
	public void start()
	{
		this.setTitle("MegaMind");
		this.setSize(400, 1000);
		this.setResizable(false);
		this.setVisible(true);
	}
}
