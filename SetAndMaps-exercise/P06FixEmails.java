package SetandMapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();


        Map<String, String> emailsData = new LinkedHashMap<>();


        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            emailsData.put(name, email);
            name = scanner.nextLine();
        }

        emailsData.entrySet().removeIf(entry ->
                entry.getValue().endsWith("uk")
                        || entry.getValue().endsWith("us")
                        || entry.getValue().endsWith("com"));

        emailsData.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
