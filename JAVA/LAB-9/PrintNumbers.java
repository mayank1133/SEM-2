class OddNumbersThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Number:  " + i);
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenNumbersThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number: " + i);
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class PrintNumbers {
    public static void main(String[] args) {
        OddNumbersThread oddThread = new OddNumbersThread();
        EvenNumbersThread evenThread = new EvenNumbersThread();

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("All threads completed execution.");
    }
}