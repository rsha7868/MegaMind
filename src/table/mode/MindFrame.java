package table.mode;

import javax.swing.JFrame;

import system.control.MindController;
import table.mode.MindPanel;

public class MindFrame extends JFrame
{
	private MindController appController;
	private MindPanel appPanel;
	
	public MindFrame(MindController appController)
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
