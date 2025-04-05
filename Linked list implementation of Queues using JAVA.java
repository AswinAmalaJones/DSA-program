// Linked list implementation of Queues using JAVA 04
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Queue
{
    private Node front;
    private Node rear;

    public Queue()
    {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(int data)
    {
        Node newNode = new Node(data);
        if(rear == null)
        {
            front = newNode;
            rear = newNode;
        }
        else
        {
            rear.next = newNode;
            rear =newNode;
        }
    }
    public int dequeue()
    {
        if(front==null)
        {
            throw new IllegalStateException("Queue is Empty");
        }
            int data = front.data;
            front = front.next;
            if(front == null)
            {
                rear = null;
            }
            return data;
        }
        public boolean isEmpty()
        {
            return front == null;
        }
        public int peek()
        {
            if(front == null)
            {
                throw new IllegalStateException("Queue is Empty");
            }
            return front.data;
        }
    }
    public class Main
    {
        public static void main(String[] args)
        {
            Queue queue = new Queue();

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            System.out.println("Dequeued:"+queue.dequeue());
            System.out.println("Dequeued:"+queue.dequeue());
            System.out.println("peek:"+queue.peek());
            //Trying to dequeue when queue is empty
            System.out.println("Dequeued:"+queue.dequeue());
        }
    }