package aug3;
/*3)Work on Queue interface, do research and get the difference between LinkedList and PriorityQueue with code example
also do check on blocking and non blocking Queue, based on your interest go ahead and also explore Dequeue interface if you wish to.*/

/*java.util.LinkedList is a doubly-linked list implementation of the List and Deque interfaces.
 *  Implements all optional list operations, and permits all elements (including null).

java.util.PriorityQueue is an unbounded priority queue based on a priority heap.
 The elements of the priority queue are ordered according to their natural ordering, 
 or by a Comparator provided at queue construction time, depending on which constructor is used. 
 A priority queue does not permit null elements. 
 A priority queue relying on natural ordering also does not permit insertion of non-comparable objects (doing so may result in ClassCastException).*/


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
public class Task3 {
	public static void main(String[] args) {

        int len = 5;
        Random random = new Random();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(len);
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Random number generated:");
        for (int i = 0; i < len; i++) {
            Integer randomNumber = new Integer(random.nextInt(100));
            linkedList.add(randomNumber);
            priorityQueue.add(randomNumber);
            System.out.println(i + ": " + randomNumber);
        }
        linkedList.add(0);
        priorityQueue.add(0);
        System.out.println("Number in linkedList:");
        for (int i = 0; i <=len; i++) {
            Integer item = linkedList.poll();
            System.out.println(i + ": " + item);
        }
        System.out.println("Number in priorityQueue:");
        for (int i = 0; i <=len; i++) {
            Integer item = priorityQueue.poll();
            System.out.println(i + ": " + item);
        }
    }
	
}
