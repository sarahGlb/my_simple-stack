package deqo.sgui;

/**
 * Created by 21305884 on 04/11/2016.
 */
public class Item {
    private Object value;

    Item(Object value) {
        setValue(value);
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
