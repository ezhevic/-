import java.util.concurrent.TimeUnit;

public class MyClock extends Thread {

    @Override
    public void run() {
        Thread cur = Thread.currentThread();
        try {
            while (!cur.isInterrupted()) {
                System.out.println("Tik");
                Thread.sleep(500);
                if (cur.isInterrupted()) {
                    break;
                }
                System.out.println("Tak");
                Thread.sleep(500);
            }
        }
        catch (InterruptedException Throwable) {
            Throwable.printStackTrace();
        }
    }
    public void stopClocking(){

    }
    public static void main(String[] args) throws InterruptedException {
        var clock = new MyClock();
        clock.start();
        Thread.sleep(50000);
        clock.interrupt();
    }
}
