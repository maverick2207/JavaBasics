package data_structure_basics.priority_queue;

class PQUsingArray2 {

    int[] arr;
    int capacity;
    int size;

    PQUsingArray2(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    boolean isEmpty(){
        return size == 0;
    }

    void enqueue(int value) {
        if (size == capacity) {
            System.out.println("PriorityQueue is full!");
            return;
        }
        arr[size++] = value;
    }

    int dequeue(){
        if(size == 0){
            System.out.println("PriorityQueue is empty!");
            return -1;
        }

        int topIndex = getHighestPriorityIndex();
        int topValue = arr[getHighestPriorityIndex()];

        for(int i = topIndex; i<size-1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return topValue;

    }

    int peek(){
        if(size == 0){
            System.out.println("PriorityQueue is empty!");
            return -1;
        }
        return arr[getHighestPriorityIndex()];
    }

    private int getHighestPriorityIndex() {
        int highestPriorityIndex = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[highestPriorityIndex]) {
                highestPriorityIndex = i;
            }
        }

        return highestPriorityIndex;
    }

    void display(){
        System.out.println("Values available in priorityqueue is : ");

        for(int value:arr){
            System.out.print(value+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        PQUsingArray2 pq = new PQUsingArray2(6);

        pq.enqueue(5);
        pq.enqueue(4);
        pq.enqueue(3);
        pq.enqueue(6);
        pq.enqueue(8);
        pq.enqueue(1);

        System.out.println("Top Item: "+pq.peek());

        System.out.println("Removing Top Item: "+pq.dequeue());

    }
}
