package Sprint2Git;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DrinkMenu {
	static Map<String,Double> hmap=new HashMap<String,Double>();
	public static void menu_item()
	{
	 hmap=new HashMap<String,Double>();
	hmap.put("Coffee",2.00);
	hmap.put("Capachinno",4.00);
	hmap.put("Latte",3.00);
	hmap.put("Lemonade",3.50);
	hmap.put("MangoSmoothie",6.00);
	hmap.put("Mintcooler",5.20);
	

}
	public static void display_menu() {
		System.out.println("Drink"+"      "+"prize");
		for(Map.Entry<String,Double> m:hmap.entrySet())
		System.out.println(m.getKey() +"--->"+m.getValue());
	}
	
	public static Double calculateamount(Map<String, Integer> order_map)
	{ double total=0.0;
	
		for(Map.Entry<String,Integer> m:order_map.entrySet())
		{
			String s = m.getKey();
			Integer i=m.getValue();
			total=total+hmap.get(s)*i;
			
		}
		return total;
	}
}
