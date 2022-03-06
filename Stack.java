package com.bl;

public class Stack 
{
	MyNode head;

	/*
	 * 1. created enqueue Method to add elements in the Queue
	 */
	public void enqueue(int data) {
		/*
		 * Created node Object of MyNode class
		 */
		MyNode node = new MyNode(data);

		/*
		 * If Queue is empty, head will point to the node
		 */
		if (head == null) {
			head = node;
		} else {
			MyNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}

	/*
	 * Created Method PrintList to Print OutPut
	 */
	public void printList() 
	
	{
		MyNode temp = head;
		while (temp != null) 
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("");
	}

	public void addNode(int i) {
		// TODO Auto-generated method stub
		
	}
}
