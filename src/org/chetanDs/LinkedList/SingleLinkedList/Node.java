package org.chetanDs.LinkedList.SingleLinkedList;

/**
 * Created by chetan on 1/9/16.
 */
public class Node {
	public int value;
	public Node next;

	Node(int value) {
		//LHS will always be associated with this 
		this.value = value;
		next = null;// As with all example it is intialiased to null
	} // Constructor
}
