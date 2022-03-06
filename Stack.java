package com.bl;

public class Stack 
{
	
		MyNode head;

		/*
		 * 1. created addNode Method to add elements
		 */
		public void addNode(int data) {
			/*
			 * Created node Object of MyNode class
			 */
			MyNode node = new MyNode(data);

			/*
			 * If Stack is empty, head will point to the node
			 */
			if (head == null) {
				head = node;
			} else {
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

		/*
		 * Created Method Peak it will returns the value of what is on the top of the
		 * stack
		 */
		public void peak() {
			MyNode peakValue = head;
			System.out.println("Top element is :");
			System.out.println(head.data);
		}

		/*
		 * pop: Created Method deleteHead will remove the value of the stack and then
		 * return it
		 */
		public void deleteHead()
		{
			System.out.println("deleting top node");
			MyNode temp = head;
			if (temp != null) {
				head = temp.next;
			}

		
	}
	}


