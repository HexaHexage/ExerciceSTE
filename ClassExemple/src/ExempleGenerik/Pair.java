package ExempleGenerik;

public class Pair<k,v> 
{
 k var1;
 v var2;
 
 public Pair(k var1, v var2)
 {
	 this.var1=var1;
	 this.var2=var2;
	 
 }

public k getVar1()
{
	return var1;
}

public void setVar1(k var1)
{
	this.var1 = var1;
}

public v getVar2()
{
	return var2;
}

public void setVar2(v var2)
{
	this.var2 = var2;
}


 
 
 
 
 
 
}
