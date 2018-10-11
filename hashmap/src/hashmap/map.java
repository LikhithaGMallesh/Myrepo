package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class map {
	
	
	public static void main(String[] args) {
		
		//adding
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(15, "likhitha");
     hm.put(21, "anu");
     hm.put(7, "vani");
     hm.put(9, "manu");
     hm.put(3, "leesha");
     
     String val=hm.get(4);
     System.out.println("The Value of Key 2"+ val);
   //retriving  
     Set set2 = hm.entrySet();
     Iterator iterator2 = set2.iterator();
     while(iterator2.hasNext()) {
         Map.Entry mentry2 = (Map.Entry)iterator2.next();
         System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
         System.out.println(mentry2.getValue());
      }
     System.out.println("Size of HashMap : " + hm.size());

    //clearing the hashmap 
     hm.clear();
     System.out.println(" after clear: " + hm);
     
     
     //set key and value 
     hm.put(12, "leesha");
     hm.put(2, "Dhghg");
     hm.put(7, "Kavya");
     hm.put(49, "Ajeet1");
     hm.put(3, "fhgv");
     Set<Integer> keys = hm.keySet();
     for(Integer key: keys){
         System.out.println(key);
     }
     String value = (String)hm.get(3);

    
     System.out.println("Value: " + value);
     Map<Integer, String> map = new TreeMap<Integer, String>(hm); 
     
     Set set1 = map.entrySet();
     Iterator iterator21 = set1.iterator();
     while(iterator21.hasNext()) {
          Map.Entry me2 = (Map.Entry)iterator21.next();
          System.out.print(me2.getKey() + ": ");
          System.out.println(me2.getValue());
     }
   
     HashMap<MyString, String> hm1 = new HashMap<MyString, String>();
     hm1.put(new MyString ("hu"),"fyt");
     hm1.put(new MyString ("hku"),"fyjmkt");
   
     Set<Integer> key = hm.keySet();
     for(Integer key1: key){
         System.out.println(key);
      }
	}}



