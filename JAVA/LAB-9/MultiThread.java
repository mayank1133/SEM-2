class MultiThread{
    public static void main(String[] args) {
        class GoodMorning implements Runnable {
            public void run() {
                while (true) {
                    System.out.println("Good Morning");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        
        class GoodAfternoon implements Runnable {
            public void run() {
                while (true) {
                    System.out.println("Good Afternoon");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        
        public class MultiThread {
            public static void main(String[] args) {
                GoodMorning gm = new GoodMorning();
                Thread t1 = new Thread(gm);
                t1.start();
        
                GoodAfternoon ga = new GoodAfternoon();
                Thread t2 = new Thread(ga);
                t2.start();
            }
        }
    }
}