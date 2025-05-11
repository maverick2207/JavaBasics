package data_structure_basics.queue;

public class UsingArray {

    private int[] arr;
    private int rear, front, size, capacity;

    public UsingArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        for(int item : arr){
            System.out.print(item + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        UsingArray queue = new UsingArray(5);

        System.out.println("Is queue empty: "+queue.isEmpty());

        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(18);

//        System.out.println("Elements available in queue are: ");

//        queue.printQueue();

        System.out.println("Top Element in Queue is: "+queue.peek());

        queue.enqueue(20);

        System.out.println("Top Element in Queue is: "+queue.peek());

        System.out.println("Dequeued element is: "+queue.dequeue());

        System.out.println("Top Element in Queue is: "+queue.peek());

        queue.enqueue(25);

        System.out.println("Top Element in Queue is: "+queue.peek());

        System.out.println("Dequeued element is: "+queue.dequeue());

        System.out.println("Top Element in Queue is: "+queue.peek());

        queue.enqueue(25);
        queue.enqueue(30);

        System.out.println("Is queue full: "+queue.isFull());
        queue.enqueue(35);
        System.out.println("Top Element in Queue is: "+queue.peek());

    }
}
