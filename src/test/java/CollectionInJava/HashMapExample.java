package CollectionInJava;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		 HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");   
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		   
		//   System.out.println(map.get(3));
		  // System.out.println(map.containsValue("Banana"));


		   for(Entry<Integer, String> m : map.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }  
		 
		   for(Integer key:map.keySet()) {
			   System.out.println("key:"+key);
		   }
	}
}
