public interface IQueue {
    boolean isEmpty();
    boolean isFull();
    void enQueue(Object s);
    Object deQueue();
    void printQueue();
}
