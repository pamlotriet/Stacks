public class TestStackAsMyLinkedList {
  public static void main(String[] args) {
	 Integer top = null;
	 StackAsMyLinkedList<Integer> myStack = new StackAsMyLinkedList<Integer>();

	 System.out.println("\nInitial stack: ");
	 System.out.println(myStack +"\n");


	 System.out.println("\nAdd One item: ");// Add item to Empty stack
	 myStack.push(new Integer(3));
	 System.out.println(myStack +"\n");

	 System.out.println("\nAdd a few more:");
	 myStack.push(new Integer(2));
	 myStack.push(new Integer(9));
	 myStack.push(new Integer(5));
	 System.out.println(myStack +" ");


	 System.out.println("\nPop one");
	 top = (Integer) myStack.pop();
	 if (top != null)
		System.out.println("Top is: " + top.intValue() +"\n");
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +" ");

	 System.out.println("\nPop one");
	 top = (Integer) myStack.pop();
	 if (top != null)
		System.out.println("Top is: " + top.intValue() +"\n");
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +" ");

	 System.out.println("\nPop one");
	 top = (Integer) myStack.pop();
	 if (top != null)
		System.out.println("Top is: " + top.intValue() +"\n");
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +" ");

	 System.out.println("\nPop one");
	 top = (Integer) myStack.pop();
	 if (top != null)
		System.out.println("Top is: " + top.intValue() +"\n");
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +" ");

	 System.out.println("\nPop one");
	 top = (Integer) myStack.pop();
	 if (top != null)
		System.out.println("Top is: " + top.intValue() +"\n");
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +"\n ");


	}
}
