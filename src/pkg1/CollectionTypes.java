package pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTypes 
{
public static void main(String[] args) 
{
	TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
	hm.put(123,"priyanka");
	hm.put(222, "teena");
	hm.put(456, "tina");
	hm.put(789, "deepanshu");
	hm.put(458, "preeti");
	hm.put(741, "sandeep");
	hm.put(745, "sandeep");
	hm.put(123, "deeepa");
	Set<Integer> allKeys=hm.keySet();
  
	for(Integer i: allKeys)
	{ 
		System.out.println("key is="+i);
		  String s=hm.get(i);
		System.out.println("value is "+s);
		
	}
}
	
}
