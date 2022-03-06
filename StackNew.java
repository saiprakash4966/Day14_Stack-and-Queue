package com.bl;

public class StackNew 
{

	public static void main(String[] args) 
	{
		/**
			 * Main method for manipulation Queue Operation
			 * 
			 * @param args - Default Java param (Not used)
			 */

			/**
			 * PROCEDURE
			 * 1.creating Object 
			 * 2.Calling method to add value at first
			 * 3.calling method to display value of queue
			 */

			/*
			 * 1.creating an Object
			 */

			System.out.println("Deleting element from queue ::");
			Stack stack = new Stack();

			/*
			 * Adding element to the queue
			 */
			stack.addNode(56);
			stack.addNode(30);
			stack.addNode(70);
			stack.printList();

		}
	}