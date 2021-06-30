package supermarket;
import java.util.*;
import java.util.Map.Entry;

public class ShoppingApp 
{
	int gps;
	Scanner sc = new Scanner(System.in);
	ArrayList<SuperMarket> shops = new ArrayList<>();
	ArrayList<String> userList = new ArrayList<>();
	UserDetails user = new UserDetails(userList, gps);
	public ShoppingApp()
	{
		HashMap<String, Boolean> slist1 = new HashMap<>();
		slist1.put( "Rice", true);
		slist1.put( "Wheat", true);
		slist1.put( "Sugar", true);
		slist1.put( "Dal", true);
		slist1.put( "Bread", true);
		slist1.put( "Jam", true);
		slist1.put( "Sauce", false);
		slist1.put( "Butter", false);
		slist1.put( "Milk", false);
		slist1.put( "Ghee", true);
		slist1.put( "Soap", true);
		slist1.put( "Powder", false);

		HashMap<String, Boolean> slist2 = new HashMap<>();
		slist2.put( "Rice", true);
		slist2.put( "Wheat", true);
		slist2.put( "Sugar", true);
		slist2.put( "Dal", false);
		slist2.put( "Bread", false);
		slist2.put( "Jam", true);
		slist2.put( "Sauce", true);
		slist2.put( "Butter", true);
		slist2.put( "Milk", false);
		slist2.put( "Ghee", true);
		slist2.put( "Soap", false);
		slist2.put( "Powder", true);
		
		HashMap<String, Boolean> slist3 = new HashMap<>();
		slist3.put( "Rice", true);
		slist3.put( "Wheat", true);
		slist3.put( "Sugar", false);
		slist3.put( "Dal", true);
		slist3.put( "Bread", false);
		slist3.put( "Jam", true);
		slist3.put( "Sauce", false);
		slist3.put( "Butter", true);
		slist3.put( "Milk", true);
		slist3.put( "Ghee", true);
		slist3.put( "Soap", false);
		slist3.put( "Powder", false);
		
		HashMap<String, Boolean> slist4 = new HashMap<>();
		slist4.put( "Rice", true);
		slist4.put( "Wheat", false);
		slist4.put( "Sugar", true);
		slist4.put( "Dal", true);
		slist4.put( "Bread", true);
		slist4.put( "Jam", false);
		slist4.put( "Sauce", false);
		slist4.put( "Butter", false);
		slist4.put( "Milk", false);
		slist4.put( "Ghee", true);
		slist4.put( "Soap", true);
		slist4.put( "Powder", true);

		HashMap<String, Boolean> slist5 = new HashMap<>();
		slist5.put( "Rice", false);
		slist5.put( "Wheat", true);
		slist5.put( "Sugar", false);
		slist5.put( "Dal", true);
		slist5.put( "Bread", true);
		slist5.put( "Jam", true);
		slist5.put( "Sauce", false);
		slist5.put( "Butter", true);
		slist5.put( "Milk", false);
		slist5.put( "Ghee", true);
		slist5.put( "Soap", true);
		slist5.put( "Powder", true);

		SuperMarket shop1 = new SuperMarket("aaa", 20, slist1);		// Shop name, location, items map
		SuperMarket shop2 = new SuperMarket("bbb", 24, slist2);
		SuperMarket shop3 = new SuperMarket("ccc", 28, slist3);
		SuperMarket shop4 = new SuperMarket("ddd", 32, slist4);
		SuperMarket shop5 = new SuperMarket("eee", 36, slist5);
		
		shops.add(shop1);
		shops.add(shop2);
		shops.add(shop3);
		shops.add(shop4);
		shops.add(shop5);
	}
	
	
	public void findShopPath(List<SuperMarket> shops)
	{
		for(SuperMarket sm : shops)
		{
			for(Entry<String, Boolean> entry : sm.slist.entrySet())
			{
				if(entry.getValue())
				{
					
				}
			}
			
			
		}
	}


	public void getUserInput()
	{
		int choice = 1;
		while(choice != 0)
		{
			System.out.println("Enter a grocery item : ");
			userList.add(sc.nextLine());
        	System.out.println("Enter another?  1 : Yes, 0 : No");
        	choice = sc.nextInt();
        	sc.nextLine(); // Eat empty line.
		}		
		System.out.println("Enter your GPS location : ");
		gps=sc.nextInt();
				
		for(SuperMarket s : shops)
		{
			System.out.println(s);
		}
		findShopPath(shops);
	}
	

	public static void main(String[] args) 
	{
		ShoppingApp sa = new ShoppingApp();
		sa.getUserInput();
		
	}

}
