package CollectionInJava;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        System.out.println(set);
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
	}
}
