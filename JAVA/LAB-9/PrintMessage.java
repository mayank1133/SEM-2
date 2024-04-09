class PrintNumbers implements Runnable {

    int start, end, step;

    public PrintNumbers(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public void run() {
        for (int i = start; i <= end; i += step) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TwoThreads {

    public static void main(String[] args) {
        Thread oddNumbers = new Thread(new PrintNumbers(1, 20, 2), "OddNumbers");
        Thread evenNumbers = new Thread(new PrintNumbers(2, 20, 2), "EvenNumbers");

        oddNumbers.start();
        evenNumbers.start();

        try {
            oddNumbers.join();
            evenNumbers.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads finished executing.");
    }
}