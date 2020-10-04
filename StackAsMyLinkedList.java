
public class StackAsMyLinkedList<E>
{
	MyLinkedList<E> theStack;
    public StackAsMyLinkedList()
    {  theStack = new MyLinkedList<E>();
    }

    public void push(E newElement) //insert at head
    {
		   theStack.prepend(newElement);
    }

	public boolean isEmpty()
	{
		return theStack.isEmpty();
	}

	public StackAsMyLinkedList addingLargeNumbers(StackAsMyLinkedList param)
	{
		Integer carry = new Integer(0);
		Integer temp = new Integer(0);

		StackAsMyLinkedList<Integer> returnStack = new StackAsMyLinkedList<Integer>();

		if (this.isEmpty() && param.isEmpty())
		{
			return returnStack;
		}

		if (param.isEmpty())
		{
			while (!this.isEmpty())
			{
				carry = (Integer)this.pop();
				returnStack.push(carry);
			}
			return returnStack;
		}

		if (this.isEmpty())
		{
			while (!param.isEmpty())
			{
				carry = (Integer)param.pop();
				returnStack.push(carry);
			}
			return returnStack;
		}

		while (!this.isEmpty() && !param.isEmpty())
		{
			carry = (Integer)this.pop();
			carry = carry + (Integer)param.pop();

			if (temp == 1)
			{
				carry = carry + 1;
				temp = 0;
			}

			if (carry > 9)
			{
				carry = carry - 10;
				temp = 1;
			}

			returnStack.push(carry);
		}

		if (param.isEmpty())
		{
			while (!this.isEmpty())
			{
				carry = (Integer)this.pop();

				if (temp == 1)
				{
					carry = carry + 1;
					temp = 0;
				}

				returnStack.push(carry);
			}
			return returnStack;
		}

		if (this.isEmpty())
		{
			while (!param.isEmpty())
			{
				carry = (Integer)param.pop();

				if (temp == 1)
				{
					carry = carry + 1;
					temp = 0;
				}

				returnStack.push(carry);
			}
			return returnStack;
		}

		return returnStack;
	}

	public E pop() //remove from head
    {
		E temp = null;
		boolean isDone = false;

		temp = theStack.getFirst();
		if (temp != null)
		{
			isDone=theStack.delete(temp);
		}
		if (isDone)
			return temp;
		else
			return null;
    }
	public String toString()
	{
		return theStack.toString();
	}


}//end class
