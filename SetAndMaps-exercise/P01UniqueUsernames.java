package SetandMapsExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01UniqueUsernames {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        int n=Integer.parseInt(scanner.nextLine());

        Set<String> words=new LinkedHashSet<>();

        for (int countWord = 0; countWord <n ; countWord++) {
            String word= scanner.nextLine();
            words.add(word);

        }
        words.forEach(System.out::println);
    }
}
