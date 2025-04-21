package CollectionFramework.CH05_Queue.CH05_02_BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(5);
        /*
        A bounded, blocking queue backed by an circular array
        low memory overhead
        uses a single lock for both enqueue and dequeue operation
        more threads --> problem
        */



        /*

        Thread safe queue
        wait for queue to become non-empty / wait for space
        simplify concurrency problems like producer-consumer
        standard queue -> immediately
        empty --> remove (no waiting)
        full --> add(no waiting)

        Blocking queue
        put --> block if the queue is full until space becomes available
        take --> block if the queue is empty until an element becomes available
        offer --> waits for space to become available, up to the specified timeout




         */
    }
}
