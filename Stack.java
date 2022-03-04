package com.bl;

public class Stack 
{
		MyNode head;


		/*
		 * 1. created addNode Method to add elements
		 */
		public void addNode(int data) 
		{
			/*
			 * Created node Object of MyNode class
			 */
			MyNode node = new MyNode(data);
			
			/*
			 * If Stack is empty, head will point to the node
			 */
			if (head == null) 
			{
				head = node;
			} else 
			{
				/*
				 * node will be added after head such that head's next will point to Node
				 */
				node.next = head;
				head = node;
			}
			printList();
		}

		/*
		 * Created Method PrintList to Print OutPut of the pushed element of the stack
		 */
		public void printList() {
			MyNode temp = head;
			while (temp != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println("");
		}
	}


