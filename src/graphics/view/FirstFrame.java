package graphics.view;

import javax.swing.JFrame;
import graphics.controller.GraphController;

public class FirstFrame extends JFrame
{
	private GraphController baseController;
	
	public FirstFrame(GraphController baseController)
	{
		super();
		this.baseController = baseController;
	}
}
