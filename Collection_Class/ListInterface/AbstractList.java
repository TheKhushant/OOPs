import java.util.*; 
public class Abstract { 
	public static void main(String args[]) 
	{ 
		AbstractList<String> list = new LinkedList<String>(); 
        list.add("Geeks"); 
		list.add("for"); 
		list.add("Geeks"); 
		list.add("10"); 
		list.add("20"); 
        System.out.println();
		System.out.println("AbstractList: " + list); 
		list.remove(3); 
		System.out.println("Final AbstractList: " + list); 
        System.out.println();
		int lastindex = list.lastIndexOf("A"); 
		System.out.println("Last index of A : "+ lastindex);
        System.out.println();
        System.out.println("element at index 3 : " + list.get(3));
        System.out.println("element at index 2 : " + list.get(2));
        System.out.println();
        System.out.println("before inserting 'YASH' at index 2"+list);
        list.set(2, "Yash");
        System.out.println("after inserting 'YASH' at index 2"+list);
        System.out.println();
        list.clear();
        System.out.println("after clear command : "+ list);
        System.out.println();
	} 
}
