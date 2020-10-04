public class addLargeNumbers
{
  public static void main(String[] args)
  {
    int pop1,pop2,carry,total,s3;

    StackAsMyLinkedList<Integer> myStack1 = new StackAsMyLinkedList<Integer>();
    StackAsMyLinkedList<Integer> myStack2 = new StackAsMyLinkedList<Integer>();
    StackAsMyLinkedList<Integer> myStack3 = new StackAsMyLinkedList<Integer>();


    myStack1.push(new Integer(5));
    myStack1.push(new Integer(9));
    myStack1.push(new Integer(2));

    myStack2.push(new Integer(3));
    myStack2.push(new Integer(7));
    myStack2.push(new Integer(8));
    myStack2.push(new Integer(4));

    System.out.println("\nWhen 2 stacks is counted: ");
		myStack3 = myStack1.addingLargeNumbers(myStack2);
		System.out.println(myStack3 +"\n");




  }


}
