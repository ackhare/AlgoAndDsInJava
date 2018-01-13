package org.chetanDs.Queue.geeks.ArrayImplOfQueue;

// Java program for array implementation of queue
/*
For implementing queue, we need to keep track of two indices, front and rear.
We enqueue an item at the rear and dequeue an item from front.
If we simply increment front and rear indices, then there may be problems,
front may reach end of the array. The solution to this problem is to increase
front and rear in circular manner
 */
// A class to represent a queue
class Queue {
    int front, rear, size;
    int capacity;
    int array[];

    //size will be the number of actual elements inside the array of n capacity
    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];

    }

    // Queue is full when size becomes equal to
    // the capacity
    boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }

    // Queue is empty when size is 0
    boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }

    // Method to add an item to the queue.
    // It changes rear and size
    void enqueue(int item) {
        if (isFull(this))
            return;
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item + " enqueued to queue");
    }

    // Method to remove an item from queue.
    // It changes front and size
    int dequeue() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    // Method to get front of queue
    int front() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.front];
    }

    // Method to get rear of queue
    int rear() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.rear];
    }
}


// Driver class
public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() +
                " dequeued from queue\n");

        System.out.println("Front item is " +
                queue.front());

        System.out.println("Rear item is " +
                queue.rear());
    }
}

//Output:
//10 enqueued to queue
//20 enqueued to queue
//30 enqueued to queue
//40 enqueued to queue
//10 dequeued from queue
//Front item is 20
//Rear item is 40
//Time Complexity: Time complexity of all operations like enqueue(), dequeue(),
// isFull(), isEmpty(), front() and rear() is O(1).
// There is no loop in any of the operations.
