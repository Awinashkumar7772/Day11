package day11;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<>();
		
		h.put(1, "Hello");
		h.put(2, "hey");
		h.put(3, "Bye");
		
		for(Map.Entry<Integer, String> m : h.entrySet()) {
			System.out.println(m.getValue() + m.getKey());
		}
		
		
		
	}

}
