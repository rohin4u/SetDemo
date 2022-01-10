package com;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		ArrayList list =  new ArrayList();
		
		list.add("p");
		list.add("l");
		list.add("n");
		list.add("m");
		list.add("o");
		list.add("a");
		
		System.out.println(list);
		
		TreeSet set = new TreeSet(list);
		
		System.out.println(set);
		

	}

}
