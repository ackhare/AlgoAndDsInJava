package Stack.CircularQueue;

/**
 * Created by chetan on 30/9/16.
 */
public class CircularQueue
    {
        // The array to hold values.
        public int[] Values;

        // The next open position.
        public int Top = 0;

        // The index of the oldest item in the queue.
        public int Bottom = 0;

        // The number if items currently in the queue.
        public int Count = 0;

        // Allocate the Values array.
        public CircularQueue(int size)
        {
            Values = new int[size];
        }

        // Add an item to the queue.
        public void Enqueue(int value) throws Exception {
            if (Count == Values.length) throw new Exception("The queue is full.");
            Values[Top] = value;
            Top = (Top + 1) % Values.length;
            Count++;
        }

        // Remove the oldest item from the queue.
        public int Dequeue() throws Exception {
            if (Count == 0) throw new Exception("The queue is empty.");
            int result = Values[Bottom];
            Bottom = (Bottom + 1) % Values.length;
            Count--;
            return result;
        }
    }
