package com.bl;

public class Stack 
{

    MyNode head;

    /*
     *  create method addNode and adding element to the queue
     */
    public void addNode(int data) {
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
            MyNode temp=head;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=node;
        }

    }

    /*
	 * Created Method PrintList to Print OutPut of the Enqueued element to the queue
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
    * create Method deleteHead to dequeue element from queue means deleting element 
    * from beginning of the queue
    */
    public void deleteHead() {
        System.out.println("deleting head ");
        MyNode temp=head;
        if(temp!=null) {
            head=temp.next;
        }
    }
}
