// See extends Thread vs implements Runnable
// Implementing Runnable allows your to extend another class as Java does not support mutiple inheritance
public class MyMultithreader implements Runnable {
    int threadNumber;

    public MyMultithreader(int number) {
        this.threadNumber = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println("Thread number " + threadNumber + " outputs " + i);

            if (threadNumber == 3) {
                throw new RuntimeException();
//                Program will continue to run if one thread encounters an Exception
            }
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

}
