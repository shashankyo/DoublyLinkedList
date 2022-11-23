package doublylinkedlist;

import java.util.Scanner;

public class DoublyLinkedListApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	DoublyLinkedList dll = new DoublyLinkedList();
	while(true)
	{
		System.out.println("Press 1 --------> INSERT REAR");
		System.out.println("Press 2 --------> DELETE REAR");
		System.out.println("Press 3 --------> INSERT FONT");
		System.out.println("Press 4 --------> DELETE FRONT");
		System.out.println("Press 5 --------> DISPLAY FORWARD");
		System.out.println("Press 6 --------> DISPLAY REVERSE");
		System.out.println("Any Other Number --------> STOP");
	
		System.out.println("Enter the choice");
		int choice = scan.nextInt();
			switch(choice) 
			{
			case 1 :
					dll.insertrear();
					break;
			case 2 :
					dll.deleterear();
					break;
			case 3:
					dll.insertfront();
					break;
			case 4:
					dll.deletefront();
					break;
			case 5:
					dll.displayforward();
					break;
			case 6:
					dll.displayreverse();
					break;
			default :
					System.exit(0);
			}
	}
}
}
