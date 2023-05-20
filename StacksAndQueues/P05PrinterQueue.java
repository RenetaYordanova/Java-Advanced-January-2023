package StacksandQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String currentInput = scanner.nextLine();

        ArrayDeque<String> printQueue = new ArrayDeque<>();

        while (!currentInput.equals("print")) {
            if (currentInput.equals("cancel")) {
                String firstTask = printQueue.poll();

                if (firstTask == null) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + firstTask);
                }
            } else {
                printQueue.offer(currentInput);
            }
            currentInput = scanner.nextLine();
        }
        while (!printQueue.isEmpty()) {
            System.out.println(printQueue.poll());
        }
    }
}