package megaMind.name;

import java.util.ArrayList;
import java.util.List;
import table.mode.MindPanel;

public class MegaMind
{
	private List<String> colorList;
	
	public MegaMind(String username)
	{
		this.colorList = new ArrayList<String>();
		
		buildColorList();
	}
	private void buildColorList()
	{
		colorList.add("Blue");
		colorList.add("Red");
		colorList.add("Green");
		colorList.add("Yellow");
		colorList.add("White");
		colorList.add("Orange");
	}
	public String colorList(boolean Button)
	{
//		while(colorList < 6)
		for(String s : colorList)
		{
			if(colorList == "Blue")
			{
				return String = "True";
			}
			else
			{
				return String = "Wrong";
			}
			else if(Button == "Red")
			{
				return true;
			}
			else if(Button == "Green")
			{
				return true;
			}
			else if(Button== "Yellow")
			{
				return true;
			}
			else if(Button == "White")
			{
				return true;
			}
			else if(Button == "Orange")
			{
				return true;
			}
			return false;
		}
		//for(int index = 0; index < colorList.length; index++)
		{
//			if(colorList == "Blue")
//			{
//				return true;
//			}
//			else if(Button == "Red")
//			{
//				return true;
//			}
//			else if(Button == "Green")
//			{
//				return true;
//			}
//			else if(Button== "Yellow")
//			{
//				return true;
//			}
//			else if(Button == "White")
//			{
//				return true;
//			}
//			else if(Button == "Orange")
//			{
//				return true;
//			}
//			return false;
		}
	}
}
