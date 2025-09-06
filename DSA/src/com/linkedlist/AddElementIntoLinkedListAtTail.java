package com.linkedlist;

import java.util.Random;

class Node{
	private int data;
	private Node next;
	
	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
	
}


class LinkedList{
	private Node head;
	private Node tail;
	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}
	
	// ADD ELEMENTS AT THE END OF THE LINKED LIST
	
	public void addElementAtTail(int data) {
		// CREATE A NODE
		Node node = new Node(data);
		
		
		// IF LINKEDLIST IS EMPTY 
		if(this.head == null) {
			this.head = node;
			this.tail = node;
		}
		else {
			this.tail.setNext(node);
			this.tail = node;
		}
	}
	
	// DISPLAY OF LINKED LIST
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.getData() + " --> ");
			temp = temp.getNext();
			
		}
		
	}
	
	
}

public class AddElementIntoLinkedListAtTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		LinkedList list = new LinkedList();
		
		for(int i = 0; i < 7; i++) {
			Random rand = new Random();

	        int randomInt = rand.nextInt(100);
	        
	        
	        list.addElementAtTail(randomInt);
	        
	        System.out.println("Linnked List After adding " + randomInt + " :" );
	        
	        list.display();
	        System.out.println();
	        
		}

	}

}
