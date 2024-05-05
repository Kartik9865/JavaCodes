package collectionsConcept;

import java.util.*;

public class Arraylist{
	public static void main(String[] args) {
		List<String> list =  new ArrayList<String>(); 
		list.add("KA");
		list.add(null);
		
		System.out.println(list);
		
//		List<Object> list1 = List.of("KA", "KB", 10,  10, 10);
//		System.out.println(list1);
		
		List nglist =  new ArrayList(); 
		nglist.add("KA");
		nglist.add(10);
		nglist.add("KA");
		nglist.add(null);
		
		System.out.println(nglist);
		
// outputs of both arrayLists are same 
//As generics is a compile time concept	and checks for type references only at compile time	
//At run time, generics semantics is removed and AL object is created which is llar to nglist as list		
	}
}
