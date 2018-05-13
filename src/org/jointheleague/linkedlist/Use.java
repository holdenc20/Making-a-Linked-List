package org.jointheleague.linkedlist;

import java.util.LinkedList;

public class Use {
	public static void main(String[] args) {
			
	LinkedList singly =  new LinkedList();
	singly.add("a");
	singly.add("b");
	singly.addLast("e");
	singly.removeFirst();
	System.out.println(singly.toString());
}
}