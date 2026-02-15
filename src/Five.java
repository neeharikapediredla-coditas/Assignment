
/** 5. Problem: Create a program that processes a list of tasks (e.g., file downloads, image processing) using a thread pool. The program should dynamically allocate a fixed
 number of worker threads to complete the tasks.
 Objective: Implement a thread pool using ExecutorService and understand the
 benefits of reusing threads for multiple tasks.*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class TaskProcessor implements Runnable {
    private final String taskDescription;
    public TaskProcessor(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " started processing: " + taskDescription);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()
                + " completed processing: " + taskDescription);
    }
}
public class Five {
    public static void main(String[] args) {
        ExecutorService workerPool = Executors.newFixedThreadPool(3);
        String[] pendingTasks = {
                "Download File A",
                "Resize Image B",
                "Upload Report C",
                "Compress Video D",
                "Generate Thumbnail E"
        };
        for (String taskItem : pendingTasks) {
            workerPool.submit(new TaskProcessor(taskItem));
        }
        workerPool.shutdown();
    }
}
