package day11;

import java.util.PriorityQueue;

public class QueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(20);
		p.add(40);
		p.add(90);
		p.poll();
		System.out.println(p);

}

}
