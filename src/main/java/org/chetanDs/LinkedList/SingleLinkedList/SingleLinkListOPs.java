package org.chetanDs.LinkedList.SingleLinkedList;

/**
 * Created by chetan on 1/9/16.
 */
public class SingleLinkListOPs {

	// The top of the list.
	private static Node head = null;
	private static Node current = null;

	public static void main(String[] args) {

		SingleLinkListOPs singleLinkListOPs = new SingleLinkListOPs();
		singleLinkListOPs.addItemAtTop(100);
		singleLinkListOPs.addItemAtTop(200);
		singleLinkListOPs.addItemAtTop(300);
		singleLinkListOPs.addItemAtTop(400);
		singleLinkListOPs.addItemAtTop(500);
		singleLinkListOPs.addItemAtBottom(600);
		singleLinkListOPs.addItemAtBottom(700);
		singleLinkListOPs.addItemAtBottom(800);
		singleLinkListOPs.addItemAtBottom(900);
		singleLinkListOPs.addItemAtBottom(1000);

		//showValues();
		/*
		 * 500 400 300 200 100 600 700 800 900 1000
		 */

		//removeFormTop();
		 //showValues();
		//removeFromBottom();
		 singleLinkListOPs.deleteNode(786);
		 showValues();
		 
	}

	void addItemAtTop(int value) {

		Node newCell = new Node(value);
		if (current != null)// condition when list is not empty that is has some
							// elements
		{
			current.next = newCell;
		}

		else {
			head = newCell;
		}
		current = newCell;

		System.out.println("current value" + current.value);

	}

	void addItemAtBottom(int value) {
		// Find the bottom of the list
		if (current != null) {
			while (current.next != null)
				current = current.next;
		}
		Node newCell = new Node(value);
		newCell.next = null;
		if (current != null)
			current.next = newCell;
		else
			head = newCell;
		current = newCell;

		// showValues();

	}

	// Remove the top item.
	static void removeFormTop() {
		head = head.next;

	}

	// Remove the bottom item.
	static void removeFromBottom() {
		// Find the bottom of the list.
		Node before = head;
		while (before.next.next != null) {
			before = before.next;
		}
		// Remove the item after before.
		before.next = null;

	}
	/* Given a key, deletes the first occurrence of key in linked list */
    void deleteNode(int key) {
        // Store head node
        Node temp = head, before = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.value == key) {//we need to keep checking of null
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.value != key) {
        	before = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        before.next = temp.next;

    }
	static void showValues() {
		if (head != null) {
			Node top1 = head;
			do {
				System.out.println(head.value);
				head = head.next;
			} while (head != null);

			head = top1;
		}
	}

}
