
/**
 * This LinkedStack object represents a Stack ADT implemented as
 * a LinkedList using the StackInterface.
 * 
 * @author
 * @version
 */
public class LinkedStack<T> implements StackInterface<T>
{
    private LLNode<T> top;
    private int size;

    public LinkedStack()
    {
        top = null; 
        size = 0; 
    }

    // returns the logical size of the stack
    public int size()    
    {
        return size;
    }

    // tests if this stack is empty
    public boolean empty()
    {
       if (size==0){
           return true; 
        }
        return false; 
    }

    // looks at the object at the top of this stack
    // without removing it from the stack
    public T peek()
    {
        if (empty()){
           throw new StackUnderflowException(); 
        }
        return top.getInfo(); 
    }

    // removes the object at the top of this stack 
    // and returns that object as the value of this function
    public T pop()
    {
        if (empty()){
           throw new StackUnderflowException(); 
        }
        
        T result = peek(); 
        top = top.getLink(); 
        size--; 
        return result; 
        
    }

    // pushes an item onto the top of this stack
    public T push(T item)
    {
        LLNode<T> newNode = new LLNode<T>(item); 
        newNode.setLink(top);
        top = newNode; 
        size++; 
        return item; 
    }

    // removes all of the elements from this stack
    public void clear()
    {
        top = null;
        size = 0; 
    }

    // returns the 1 based position where an object is on this stack
    // note: when the method ends, the stack is the same as it was at the start
    public int search(Object o)
    {
        LLNode<T> curr = top;
        int index = 1;
        while(curr != null){
            if(curr.getInfo().equals((T)o)){
                return index; 
            }
            index++; 
            curr = curr.getLink(); 
        }
        return -1; 
    }
}
