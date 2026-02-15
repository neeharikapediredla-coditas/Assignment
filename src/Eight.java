
/** 8.Problem: Create a traffic control system where only 3 cars can pass through a tunnel at
 the same time. Use a semaphore to limit the number of cars that can be in the tunnel
 concurrently.
 Objective: Learn how to use Semaphore to control access to a limited number of
 resources in a multithreaded environment.*/


import java.util.concurrent.Semaphore;
class TunnelController {
    private final Semaphore tunnelPermitController = new Semaphore(3, true);
    public void passThroughTunnel(String vehicleIdentifier) {
        try {
            System.out.println(vehicleIdentifier + " is waiting to enter the tunnel");
            tunnelPermitController.acquire();
            System.out.println(vehicleIdentifier + " ENTERED the tunnel");
            Thread.sleep(1000);
            System.out.println(vehicleIdentifier + " EXITED the tunnel");

        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } finally {
            tunnelPermitController.release();
        }
    }
}
public class Eight {
    public static void main(String[] args) {
        TunnelController trafficManager = new TunnelController();
        Runnable vehicleTask = () -> {
            String vehicleName = Thread.currentThread().getName();
            trafficManager.passThroughTunnel(vehicleName);
        };
        for (int vehicleNumber = 1; vehicleNumber <= 3; vehicleNumber++) {
            Thread vehicleThread =
                    new Thread(vehicleTask, "Car-" + vehicleNumber);
            vehicleThread.start();
        }
    }
}
