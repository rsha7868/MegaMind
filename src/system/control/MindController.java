package system.control;

import table.mode.MindFrame;
import table.mode.MindPanel;

import java.util.ArrayList;

public class MindController
{
	private MindPanel appFrame;

	public MindController()
	{
	appFrame = new MindPanel(this);
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
