package supermarket;

import java.util.*;

public class SuperMarket
{
	String sName;
	int sgps; 
	HashMap<String, Boolean> slist;
	
	public SuperMarket(String sName, int sgps, HashMap<String, Boolean> slist)
	{
		this.sName = sName;
		this.sgps = sgps;
		this.slist = slist;
	}

	@Override
	public String toString() 
	{
		return "SuperMarket [sName=" + sName + ", sgps=" + sgps + ", slist=" + slist + "]";
	}
	
	
	


}
