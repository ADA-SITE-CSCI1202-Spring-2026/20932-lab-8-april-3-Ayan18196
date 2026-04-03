import java.util.*;

public class Grades {
    public static void main(String[] args) {
        // a.
        String[] names = {"AYAN", "ELI", "LEYLA", "MURAD", "ZAUR"};
        double[] gpas = {3.8, 3.9, 3.5, 3.9, 3.2};
        // b.
        Map<String, Double> studentMap = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            studentMap.put(names[i], gpas[i]);
        }

        double total = 0;
        double max = 0;

        System.out.println("Student Hash Calculation");

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            double gpa = gpas[i];
            
            total += gpa;

            if (gpa > max) {
                max = gpa;
            }

            int l = name.charAt(0) - 'A' + 1; 
            int f = name.charAt(name.length() - 1) - 'A' + 1;
            int hashResult = (l * 26) + f;

            System.out.println(name + " -> Hash: " + hashResult);
        }

        // d. average GPA
        double avg = total / names.length;
        System.out.printf("\nAverage GPA: %.2f\n", avg);

        // c. Max GPA
        System.out.print("Highest GPA (" + max + "): ");
        for (int i = 0; i < names.length; i++) {
            if (gpas[i] == max) {
                System.out.print(names[i] + " ");
            }
        }

        // e. less than average GPA
        int count = 0;
        for (int i = 0; i < gpas.length; i++) {
            if (gpas[i] < avg) {
                count++;
            }
        }
        System.out.println("\nStudents below average: " + count);
    }
}