package org.jointheleague.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {

	@Test
	public void testDefaultConstructor() {
		Node node = new Node();
		assertNotNull(node);
	}

	@Test
	public void testConstructor() {
		Node node = new Node("ABC", null);
		assertNotNull(node);
	}
	
	@Test
	public void testGetData() {
		Node node = new Node("ABC", null);
		assertEquals("ABC", node.getData());
	}
	
	//Add more tests ...

}
