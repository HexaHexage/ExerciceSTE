package menu;

public class MenuItem 
{
	private String label;
	private MenuAction action;
	
	public MenuItem(String label, MenuAction action) 
	{
		this.label = label;
		this.action = action;
	}
	
	public String getLabel()
	{
		return label;
	}

	public MenuAction getAction() 
	{
		return action;
	}
}
