package day11;

import java.util.LinkedList;

public class LinkedLIistExample {
	
	public static void main(String[] args) {
		LinkedList<Integer> lm = new LinkedList<>();
		lm.add(10);
		lm.add(20);
		for (Integer ele :lm) {
			System.out.println(ele);
		
		}
			lm.addFirst(30);
			lm.addLast(50);
			for(Integer ele:lm) {
				System.out.println(ele);
			}
			lm.set(2, 400);
			for(Integer ele:lm) {
				System.out.println(ele);
			}
			lm.remove(2);
			for(Integer ele:lm) {
				System.out.println(ele);
			}
	}

}
