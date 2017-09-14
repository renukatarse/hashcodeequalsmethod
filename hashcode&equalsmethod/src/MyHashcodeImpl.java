import java.util.HashMap;
 

public class MyHashcodeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Price, String> hm = new HashMap<Price, String>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        //creating new object to use as key to get value
        Price key = new Price("Banana", 20);
        System.out.println("Hashcode of the key: "+key.hashCode());
        System.out.println("Value from map: "+hm.get(key));
    }


	}


