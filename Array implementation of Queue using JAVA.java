//Array implementation of Queue using JAVA 02
class ArrayQueue{
    private int[]array;
    private int front,rear,size,capacity;

    public ArrayQueue(int capacity)
    {
        this.capacity = capacity;
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void enqueue(int item){
        if(size == capacity){
            System.out.println("Queue is full.");
            return;
        }
        rear =(rear + 1)% capacity;
        array[rear]=item;
        size++;
    }
    public int dequeue(){
        if(size==0){
            System.out.println("Queue is empty.");
            return -1;
        }
        int item = array[front];
        front = (front+1)% capacity;
        size--;
        return item;
    }
    public void display(){
        if(size ==0){
            System.out.println("Queue is empty.");
            return;
        }
        for(int i=0;i<size;i++){
            System.out.println(array[(front+i) %capacity]+"");
        }
            System.out.println();
        }
        public int peek(){
            if (size ==0){
                System.out.println("Queue is empty.");
                return -1;
            }
            return array[front];
        }
        public int getSize(){
            return size;
        }
    }
    public class Main{
        public static void main(String[]args){
            ArrayQueue queue = new ArrayQueue(5);

            
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);

            queue.display();// Output:12345

            System.out.println("Front element:"+queue.peek()); // Output:1

            queue.dequeue();
            queue.dequeue();

            queue.display(); // output:3 4 5
            System.out.println("Queue size:"+queue.getSize());// Output:3
        }
    }