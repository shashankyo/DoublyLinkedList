package doublylinkedlist;

import java.util.Scanner;

public class DoublyLinkedList {
class Node
{
	Node  prelink;
	int data;
	Node nextlink;
}

private Node first;
private Scanner scan = new Scanner(System.in);
public void insertrear()
{
	Node temp;  
	System.out.println("Enter an element");
	int elem = scan.nextInt();
	Node newnode = new Node();
	newnode.data = elem;
	newnode.prelink = null;
	newnode.nextlink = null;
	
	if(first == null)
	{
		first = newnode;
	}
	
	else
	{
		temp = first;
		while(temp.nextlink != null)
		{
			temp = temp.nextlink;
		}
		
		temp.nextlink = newnode;
		
		newnode.prelink = temp;
	}
	
}
public void insertfront()
{
	System.out.println("Enter an element");
	int elem = scan.nextInt();
	Node newnode = new Node();
	newnode.data = elem;
	newnode.prelink = null;
	newnode.nextlink = null;
	
	if(first == null)
	{
		first = newnode;
	}
	else
	{
		newnode.nextlink = first;
		first.prelink = newnode;
		first = newnode;
	}
}
public void deletefront()
{
	if(first == null)
	{
		System.out.println("Deletion is not possible");
	}
	else if(first.nextlink == null)
	{
		System.out.println("Element deleted is "+ first.data);
		first = null;
	}
	else
	{
		first = first.nextlink;
		first.prelink = null;
	}
}
public void deleterear()
{
	if(first == null)
	{
		System.out.println("Deletion is not possible");
	}
	else if (first.nextlink == null)
	{
		System.out.println("Element deleted is" + first.data);
	}
	else
	{
		Node temp = first;
		while(temp.nextlink.nextlink != null)
		{
			temp = temp.nextlink;
			
		}
		System.out.println("Element deleted is " + temp.nextlink.data);
		temp.nextlink = null;
	}
}
public void displayforward()
{
	if(first == null)
	{
		System.out.println("Display is not possible");
	}
	else if(first.nextlink == null)
	{
		System.out.println(first.data);
	}
	else
	{
		Node temp = first;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.nextlink;
		}
	}
	System.out.println();
}

public void displayreverse()
{
	Node temp;
	if(first == null)
	{
		System.out.println("Display not possible");
	}
	else if(first.nextlink == null)
	{
		System.out.println(first.data);
	}
	else
	{
		temp = first;
		while(temp.nextlink != null)
		{
			temp = temp.nextlink;
		}
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.prelink;
		}
	}
	System.out.println();
}
}
