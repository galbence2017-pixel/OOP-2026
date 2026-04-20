import java.util.ArrayList;

public class ArrayListQueue implements IQueue{
    private final int Capacity;
    private ArrayList<Object> items;

    public ArrayListQueue(int capacity) {
        Capacity=capacity;
        items=new ArrayList<>(Capacity);
    }

    @Override
    public boolean isEmpty() {
        return items.size()==0;
    }

    @Override
    public boolean isFull() {
        return items.size()==Capacity;
    }

    @Override
    public void enQueue(Object o) {
        if(items.size()==Capacity){
            System.out.println("A sor tele van");
            return;
        }
        items.add(o);
    }

    @Override
    public Object deQueue() {
        if(items.size()==0) {
            System.out.println("A sor ures");
            return null;
        }
        return items.remove(0);
    }

    @Override
    public void printQueue() {
        System.out.println(items);
    }
}
