package graphics.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import graphics.controller.GraphController;

public class FirstFrame extends JFrame
{
	private GraphController baseController;
	private FirstPanel appPanel;
	
	public FirstFrame(GraphController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new FirstPanel(baseController);
		getBaseController();
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("OMG - WINDOWS!!!");
		this.setSize(new Dimension(600, 400));
		this.setVisible(true);
	}
	
	public GraphController getBaseController()
	{
		return baseController;
	}
}
