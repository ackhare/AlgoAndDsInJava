package Stack.LinkedListQueue;

/**
 * Created by chetan on 30/9/16.
 */
public class LinkedListQueueOps {

    // Add a value to the queue.
    static private void enqueue(int value, LinkedListQueue TheQueue) {
        TheQueue.Enqueue(value);
    }

    // Remove a value from the queue.
    static private void dequeue(LinkedListQueue TheQueue) {
        try {
            TheQueue.Dequeue();


        } catch (Exception ex) {

        }
    }

    // Show the queue's values.
    static private void showQueue(LinkedListQueue TheQueue) {

        for (QueueCell cell = TheQueue.TopSentinel.Next;
             cell != TheQueue.BottomSentinel; cell = cell.Next) {
            System.out.println("showing queue value " + cell.Value);
        }
    }

    public static void main(String[] args) {

        // The queue.
        LinkedListQueue TheQueue = new LinkedListQueue();
        enqueue(1, TheQueue);
        enqueue(2, TheQueue);
        enqueue(3, TheQueue);
        enqueue(4, TheQueue);

        enqueue(5, TheQueue);

        enqueue(6, TheQueue);

        showQueue(TheQueue);
        dequeue(TheQueue);
        dequeue(TheQueue);
        showQueue(TheQueue);

    }
}



