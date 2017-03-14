package ExempleEnum;

public enum Genre
{
 HORREUR("Horreur et épouvante"), 
 COMEDIE("Commedie"), 
 ROMANCE("Romance et amour"), 
 SF("Science fiction");
	
	String def;
	Genre(String s)
	{
		this.def=s;
	}
	@Override
	public String toString()
	{
		return this.def;
	}
	public String getDef()
	{
		return this.def;
	}
	public void setDef(String d)
	{
		this.def=d;
	}
	
}
