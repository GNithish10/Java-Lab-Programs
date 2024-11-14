import java.util.Scanner;

//stack class (ss1)
class ss1 {
 private int top = -1;
 private  int max_size = 10;
 private int[] stack = new int[max_size];

 Scanner input = new Scanner(System.in);

 // push method to add an element to the stack
 public void push() {
     if (top == (max_size - 1)) 
         System.out.println("Stack overflow");                                  //single statement for IF(), so no opening and closing braces { }
     else {
         System.out.println("Enter the item to be pushed:");
         int item = input.nextInt();
         stack[++top] = item;
     }
 }

 // pop method to remove and print the top element
 public void pop() {
     if (top == -1) 
         System.out.println("Stack underflow");
      else {
         int item = stack[top--];
         System.out.println("Popped element: " + item);
     }
 }

 // display method to show all elements in the stack
 public void display() {
     if (top == -1) 
         System.out.println("Stack is empty ");
      else {
         System.out.println("elements are: ");
         for (int i = top; i >= 0; i--) {
             System.out.printf("%d  ", stack[i]);
         }
         System.out.println();                                              // for a new line after the stack elements
     }
 }
}

public class Stack_L2 {

	public static void main(String[] args) {
	ss1 stack1 = new ss1();                                                                          // Create an instance of the stack class
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("1. Push  2. Pop  3. Display  4. Quit");
            System.out.println("Enter your choice: ");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    stack1.push();
                    break;
                case 2:
                    stack1.pop();
                    break;
                case 3:
                    stack1.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    input.close();
                    System.exit(0);                                                    // Exit the program
                default:  
                    System.out.println("Wrong choice! ");
                    
            }
            
        }

    }
    
}

