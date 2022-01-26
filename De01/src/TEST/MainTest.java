package TEST;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            age = Integer.parseInt(String.valueOf(age));
        } catch (NumberFormatException e) {
            System.out.println("Not integer value...");
        }
    }
}
