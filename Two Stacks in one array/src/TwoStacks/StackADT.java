package TwoStacks;

public interface StackADT<T>
{
  /**  Adds one element to the top of this stack. 
   *   @param element element to be pushed onto stack
   */
  public void push (T element);
  public void push2 (T element);
  
  /**  Removes and returns the top element from this stack. 
   *   @return T element removed from the top of the stack
   */
  public T pop();
  public T pop2();

  /**  Returns without removing the top element of this stack. 
   *   @return T element on top of the stack
   */
  public T peek();
  public T peek2();
  
  /**  Returns true if this stack contains no elements. 
   *   @return boolean whether or not this stack is empty
   */
  public boolean isEmpty();
  public boolean isEmpty2();

  /**  Returns the number of elements in this stack. 
   *   @return int number of elements in this stack
   */
  public int size();
  public int size2();

  /**  Returns a string representation of this stack. 
   *   @return String representation of this stack
   */
  public String toString();
}
