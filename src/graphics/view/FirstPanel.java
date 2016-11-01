package graphics.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import graphics.controller.GraphController;

public class FirstPanel extends JPanel
{
	private GraphController baseController;
	private JButton colorButton;
	private JButton randomButton;
	
	public FirstPanel(GraphController baseController)
	{
		super();
		this.baseController = baseController;
		
		this.colorButton = new JButton("Colors!");
		this.randomButton = new JButton("Randon Colors!!");
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.DARK_GRAY);
		this.add(colorButton);
		this.add(randomButton);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
