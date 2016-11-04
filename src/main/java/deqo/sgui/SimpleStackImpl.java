package deqo.sgui;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21305884 on 04/11/2016.
 */
public class SimpleStackImpl implements SimpleStack {

    Stack<Object> wrappepStack = new Stack<Object>();

    @Override
    public boolean isEmpty() {
        return wrappepStack.isEmpty();
    }

    @Override
    public int getSize() {
        return wrappepStack.size();
    }

    @Override
    public void push(Item item) {
        wrappepStack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) wrappepStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) wrappepStack.pop();
    }
}
