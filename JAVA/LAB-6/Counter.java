import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;

        while (true) {
            System.out.print("Enter a sentence (or 'quit' to exit): ");
            String sentence = scanner.nextLine();

            if (sentence.equalsIgnoreCase("quit")) {
                break;
            }

            int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

            for (char c : sentence.toLowerCase().toCharArray()) {
                switch (c) {
                    case 'a':
                        countA++;
                        break;
                    case 'e':
                        countE++;
                        break;
                    case 'i':
                        countI++;
                        break;
                    case 'o':
                        countO++;
                        break;
                    case 'u':
                        countU++;
                        break;
                }
            }

            totalA += countA;
            totalE += countE;
            totalI += countI;
            totalO += countO;
            totalU += countU;                   

            System.out.println("Count of 'a': " + countA);
            System.out.println("Count of 'e': " + countE);
            System.out.println("Count of 'i': " + countI);
            System.out.println("Count of 'o': " + countO);
            System.out.println("Count of 'u': " + countU);
        }

        System.out.println("Total count of 'a': " + totalA);
        System.out.println("Total count of 'e': " + totalE);
        System.out.println("Total count of 'i': " + totalI);
        System.out.println("Total count of 'o': " + totalO);
        System.out.println("Total count of 'u': " + totalU);

        scanner.close();
    }
}