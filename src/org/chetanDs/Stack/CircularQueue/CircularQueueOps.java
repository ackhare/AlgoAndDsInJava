package Stack.CircularQueue;

/**
 * Created by chetan on 30/9/16.
 */
public class CircularQueueOps {

        // Add a value to the queue.
      static  private void enqueue(int value, CircularQueue TheQueue)
        {
            try
            {
                TheQueue.Enqueue(value);
            }
            catch (Exception ex)
            {

            }
        }

    static private void dequeue(CircularQueue TheQueue)
        {
            try
            {
                TheQueue.Dequeue();
            }
            catch (Exception ex)
            {

            }
        }

        // Show the queue's values.
       static private void showQueue( CircularQueue TheQueue)
        {

            for (int i = 0; i < TheQueue.Count; i++)
            {
                int index = (TheQueue.Bottom + i) % TheQueue.Values.length;
                System.out.println("values of queue "+TheQueue.Values[index]);
            }
        }


    public static void main(String[] args) {
         CircularQueue TheQueue = new CircularQueue(10);
        enqueue(1,TheQueue);

        enqueue(2,TheQueue);
        enqueue(3,TheQueue);
        enqueue(4,TheQueue);
        enqueue(5,TheQueue);
showQueue(TheQueue);

        dequeue(TheQueue);
        dequeue(TheQueue);
        showQueue(TheQueue);
    }
}
