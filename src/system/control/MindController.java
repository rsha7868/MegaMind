package system.control;

import table.mode.MindFrame;
import table.mode.MindPanel;

import java.awt.SystemColor;
import java.util.ArrayList;

public class MindController
{
	private MindFrame appFrame;

	public MindController()
	{
		appFrame = new MindFrame(this);
		
	}
	public void start()
	{
	ArrayList<String> colors = new ArrayList<>();
	
	//Adding the colors to the class methad.
	colors.add("Blue");
	colors.add("Red");
	colors.add("Green");
	colors.add("Yellow");
	colors.add("White");
	colors.add("Orange");
	
	}
}
