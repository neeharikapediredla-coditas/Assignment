
/**
 10. Problem : You are required to implement a Producer-Consumer system using two
 threads. The Producer thread should generate items (in this case, integers) and the
 Consumer thread should consume these items. The producer should wait if the buffer
 (queue) is full, and the consumer should wait if the buffer is empty.
 */

import java.util.LinkedList;
import java.util.Queue;

class SharedBufferManager {

    private final Queue<Integer> itemQueue = new LinkedList<>();
    private final int bufferCapacity;

    public SharedBufferManager(int bufferCapacity) {
        this.bufferCapacity = bufferCapacity;
    }

    public synchronized void produceItem(int producedValue) {
        try {
            while (itemQueue.size() == bufferCapacity) {
                System.out.println("Buffer full. Producer waiting...");
                wait();
            }

            itemQueue.add(producedValue);
            System.out.println("Produced: " + producedValue);

            notifyAll();

        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    public synchronized void consumeItem() {
        try {
            while (itemQueue.isEmpty()) {
                System.out.println("Buffer empty. Consumer waiting...");
                wait();
            }

            int consumedValue = itemQueue.poll();
            System.out.println("Consumed: " + consumedValue);

            notifyAll();

        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}

public class Ten {

    public static void main(String[] args) {

        SharedBufferManager bufferController = new SharedBufferManager(5);

        Thread producerWorker = new Thread(() -> {
            for (int value = 1; value <= 10; value++) {
                bufferController.produceItem(value);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        }, "Producer-Worker");

        Thread consumerWorker = new Thread(() -> {
            for (int iteration = 1; iteration <= 10; iteration++) {
                bufferController.consumeItem();
                try {
                    Thread.sleep(700);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        }, "Consumer-Worker");

        producerWorker.start();
        consumerWorker.start();
    }
}
