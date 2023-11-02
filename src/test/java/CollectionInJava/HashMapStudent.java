package CollectionInJava;

import java.util.*;
import java.util.Map.Entry;

public class HashMapStudent {
	
	//student hashmap
    //store roll no and mark in it
    //find who is topper of the batch
    
    //hashmap with city name and its  temp
    //how many city having temparature more than 30

	public static void main(String[] args) {
		
		HashMapStudent ab = new HashMapStudent();
		ab.maximumvalue();
		ab.CityWeather();
	}
	
	public void maximumvalue() {
		HashMap<String,Integer> map=new HashMap<String,Integer>();          
	      map.put("Amit",434);    
	      map.put("Vijay",324);    
	      map.put("Rahul",543);  
	      map.put("Ravi", 533);  
	      int maxValueInMap = (Collections.max(map.values()));
	      System.out.println( " highest value: "+ maxValueInMap);
	}
	
	
	public void CityWeather() {
		HashMap<String,Integer> map=new HashMap<String,Integer>();          
	      map.put("Benglore",34);    
	      map.put("SreeNagar",24);    
	      map.put("Kolkata",43);  
	      map.put("Delhi", 23);  
	    
	      for(Entry<String, Integer> m : map.entrySet()){    
	      
	    	  if(m.getValue()>30) {
	      System.out.println( " This Town: "+ m.getKey()+ "  Highest Temp: "+m.getValue());	
	    	  }
	    	  
	}
	}
}
