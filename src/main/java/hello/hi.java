package hello;

import java.util.Random;
import java.util.Scanner;

public class hi {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println("Secret:"+secret);
        boolean play = true;
        while (play) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter:");
            String s = scanner.next();
            int num = Integer.parseInt(s);
            if (num > secret) {
                System.out.println("Smaller");
            }
            if (num < secret) {
                System.out.println("Bigger");
            }
            if (num == secret) {
                System.out.println("Bingo");
                break;
            }
        }
    }
}
