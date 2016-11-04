import java.util.EmptyStackException;

/**
 * Created by 21305884 on 04/11/2016.
 */
public interface SimpleStack {
    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty();
    /**
     * Return the number of items in this stack.
     */
    public int getSize();

    public void push(Item item);

    public Item peek() throws EmptyStackException;

    public Item pop() throws EmptyStackException;

}
