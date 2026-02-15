
/** 9.Problem: You are required to implement a Ping-Pong game using two threads. One
 thread should print "Ping" and the other should print "Pong" in a sequential and
 synchronized manner. Your program should ensure that "Ping" is printed, then "Pong"
 and so on, without any skipping or repeated prints.*/

class PingPongCoordinator {
    private boolean isPingTurn = true;

    public synchronized void printPing() {
        try {
            while (!isPingTurn) {
                wait();
            }

            System.out.println("Ping");
            isPingTurn = false;
            notifyAll();

        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    public synchronized void printPong() {
        try {
            while (isPingTurn) {
                wait();
            }

            System.out.println("Pong");
            isPingTurn = true;
            notifyAll();

        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}

public class PingPongGame {

    public static void main(String[] args) {

        PingPongCoordinator gameCoordinator = new PingPongCoordinator();
        int totalRounds = 5;

        Thread pingWorker = new Thread(() -> {
            for (int round = 1; round <= totalRounds; round++) {
                gameCoordinator.printPing();
            }
        }, "Ping-Thread");

        Thread pongWorker = new Thread(() -> {
            for (int round = 1; round <= totalRounds; round++) {
                gameCoordinator.printPong();
            }
        }, "Pong-Thread");

        pingWorker.start();
        pongWorker.start();
    }
}
