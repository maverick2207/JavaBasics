package data_structure_basics.priority_queue;

class Item {
    int value;
    int priority;

    Item(int value, int priority) {
        this.value = value;
        this.priority = priority;

    }
}

public class PQUsingArray {

    Item[] pq;
    int size;
    int capacity;

    PQUsingArray(int capacity) {
        this.capacity = capacity;
        this.pq = new Item[capacity];
        this.size = 0;
    }


    int getHighestPriorityIndex() {
        int highestPriorityIndex = 0;
        for (int i = 1; i < size; i++) {
            if (pq[i].priority < pq[highestPriorityIndex].priority) {
                highestPriorityIndex = i;
            }
        }
        return highestPriorityIndex;
    }

    void enqueue(int value, int priority) {
        if (size == capacity) {
            System.out.println("Priority Queue is full!");
            return;
        }
        pq[size] = new Item(value, priority);
        size++;
    }

    int peek() {

        if (size == 0) {
            System.out.println("Priorityqueue is Empty!");
            return -1;
        }
        return pq[getHighestPriorityIndex()].value;
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("Priorityqueue is Empty!");
            return -1;
        }
        int topIndex = getHighestPriorityIndex();
        int topValue = pq[topIndex].value;

        for (int i = topIndex; i < size - 1; i++) {
            pq[i] = pq[i + 1];
        }
        size--;
        return topValue;

    }

    boolean isEmpty() {
        return size == 0;
    }

    void display() {
        if (size == 0) {
            System.out.println("Priorityqueue is Empty!");
            return;
        }
        System.out.print("Priority Queue (Value, Priority): ");
        for(Item item:pq){
            System.out.print("("+item.value+", "+item.priority+") ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        PQUsingArray priorityQueue = new PQUsingArray(6);
        System.out.println("Is priority queue is empty: "+priorityQueue.isEmpty());
        priorityQueue.enqueue(10,2);
        priorityQueue.enqueue(3,5);
        priorityQueue.enqueue(7,0);
        priorityQueue.enqueue(5,3);
        priorityQueue.enqueue(9,1);
        priorityQueue.enqueue(8,4);

        priorityQueue.display();

        System.out.println("top priority element in priority queue right now is: "+priorityQueue.peek());
        System.out.println("removing top priority element in priority queue: " + priorityQueue.dequeue());
    }


}
