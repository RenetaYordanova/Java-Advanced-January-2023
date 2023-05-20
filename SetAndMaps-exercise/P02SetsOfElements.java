package SetandMapsExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input= scanner.nextLine();
        int sizeOfFirstSet=Integer.parseInt(input.split("\\s+")[0]);
        int sizeOfSecondSet=Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer>firstSet=new LinkedHashSet<>();
        Set<Integer> secondSet=new LinkedHashSet<>();

        for (int number = 1; number <=sizeOfFirstSet ; number++) {
            int value=Integer.parseInt(scanner.nextLine());
            firstSet.add(value);
            
        }

        for (int number = 1; number <=sizeOfSecondSet ; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            secondSet.add(value);
        }

        firstSet.retainAll(secondSet);

       firstSet.forEach(number-> System.out.print(number + " "));


    }
}
