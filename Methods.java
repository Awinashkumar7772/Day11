package day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


class Book{
	
	int id;
	String name;
	public Book(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}	
	

}

public class Methods {
	ArrayList<Book> al = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	HashSet<String> h = new HashSet<>();
	
	public ArrayList<Book> getDetails() {
		
		System.out.println("Enter the number of books");
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			Book b = new Book(s.nextInt(), s.next());
			al.add(b);
			h.add(b.name);
			
		}
		s.close();
		return al;
	}
	
	public void display() {
		for(Book ele : al) {
			System.out.println(ele.toString());
		}
	}
	
	public void displayUnique() {
		for(String t : h) {
			System.out.println(t);
		}
	}

}
