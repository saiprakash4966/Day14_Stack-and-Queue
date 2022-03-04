package com.bl;

public class StackNew 
{
		public static void main(String[] args)
		{

			/*
			 * PROCEDURE :
			 * 
			 * 1.creating an Object of class Stack
			 * 2.Calling method to push value to stack
			 * 3.calling method to display value of stack
			 */

			/*
			 * 1.creating Object an Object
			 */
			System.out.println("inserting element into stack ::");
			Stack stack = new Stack();
			
			 /*
			 * 2.Calling add node method to push value to stack
			 */
			
			/*
			 * UC1:Ability to create a Stack of 56->30->70
			 */
				stack.addNode(70);
				stack.addNode(30);
				stack.addNode(56);

		}
	}


