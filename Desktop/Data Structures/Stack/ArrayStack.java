
/**
 * This ArrayStack object represents a Stack ADT implemented as
 * an array using the StackInterface
 * 
 * @author  
 * @version 
 */
public class ArrayStack<T> implements StackInterface<T>
{
    private int size;
    private T[] stack;

    public ArrayStack()
    {
       stack = (T[]) new Object[1];
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
        if(size==0){ 
            return true;
        }
        return false; 
    }

    // looks at the object at the top of this stack
    // without removing it from the stack
    public T peek()
    {
        if(empty()){
            return null; 
        }
        else{
        return stack[size()-1]; 
       }
    }
    
    // removes the object at the top of this stack 
    // and returns that object as the value of this function
    public T pop()
    {
         if(!empty()){ 
            T popped = null; 
             for(int i = stack.length-1 ; i >= 0; i--){
                 if(stack[i] != null){
                     popped = stack[i]; 
                     stack[i] = null; 
                     break; 
                    }
                }
            size--; 
            if(stack.length > size()*4){
              T[] stack2 = (T[]) new Object[stack.length]; 
              for(int i = 0; i < stack.length; i++){
                   stack2[i] = stack[i]; 
              }
             stack = (T[]) new Object[(int)(stack2.length/2)]; 
              for(int i = 0; i < stack.length; i++){
                   stack[i] = stack2[i]; 
                } 
            }
            return popped;
            } 
           return null; 
    }

    // pushes an item onto the top of this stack
    public T push(T item)
    {
         for(int i = 0; i < stack.length; i++){
             if(stack[i] == null){
                 stack[i] = item;
                 break;
                }
            }
         size++; 
         int height = stack.length; 
         if(stack.length == size()){
              T[] stack2 = (T[]) new Object[height]; 
              for(int i = 0; i < height; i++){
                   stack2[i] = stack[i]; 
              }
            
             stack = (T[]) new Object[(int)(height*2)]; 
              for(int i = 0; i < height; i++){
                   stack[i] = stack2[i]; 
                } 
              
            }
         return item; 
       
    }

    // removes all of the elements from this stack
    public void clear()
    {
        for(int i =0; i < stack.length; i++){
            stack[i] = null; 
        }
        size = 0; 
    }

    // returns the 1 based position where an object is on this stack
    // note: when the method ends, the stack is the same as it was at the start
    public int search(Object o)
    {
      for(int i = stack.length-1; i >=0; i--){
            if(o.equals(stack[i])){
                return size()-i;
            }  
        }
        return -1;
    }
}
