package project;

import java.util.Scanner;

public class UsingCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        Boolean end = false;
        int adrink = 15;
        int bdrink = 20;
        while (!end){
            System.out.println("Please put your coin(1/5/10):  Tatol:" + total);
            String s = scanner.next();
            try {
                int num = Integer.parseInt(s);
                switch (num){
                    case 1:
                    case 5:
                    case 10:
                        total = total + num;
                        break;
                    case 0:
                        end = true;
                        break;
                    default:
                        break;
                }
            }
            catch (NumberFormatException e){
                if (total>=adrink){
                    total = total - adrink;
                    System.out.println("DON!");
                }
                if (total>=bdrink){
                    total = total - adrink;
                    System.out.println("DON!");
                }
                else {
                    System.out.println("BEEP!");
                }
            }
            System.out.println("Total:" + total);
        }
    }
}

package project;
import java.util.Scanner;
public class UsingCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        Boolean end = false;
        int aPrice = 15;
        int bPrice = 20;
        int cPrice = 25;
        int[] Prices = {15, 20, 25};
        System.out.println(Prices.length);
        for (int i = 0; i < Prices.length; i++) {
            System.out.println(Prices[i]);
        }
        while (!end){
            System.out.println("Please put your coin(1/5/10):  Tatol:" + total);
            String s = scanner.next();
            switch (s){
                case "1":
                case "5":
                case "10":
                    int n = Integer.parseInt(s);
                    total+=n;
                    break;
                case "a":
                    if (total>=aPrice){
                        System.out.println("DON!");
                        total-=aPrice;
                    }else {
                        System.out.println("BEEP!");
                    }
                    break;
                case "b":
                    if (total>=bPrice){
                        System.out.println("DON!");
                        total-=bPrice;
                    }else {
                        System.out.println("BEEP!");
                    }
                    break;
                case "c":
                    if (total>=cPrice){
                        System.out.println("DON!");
                        total-=cPrice;
                    }else {
                        System.out.println("BEEP!");
                    }
                    break;
            }
        }
    }
}
package project;
import java.util.Scanner;
public class UsingCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        Boolean end = false;
        int[] Prices = {15, 20, 25};
        System.out.println(Prices.length);
        for (int i = 0; i < Prices.length; i++) {
            System.out.println(Prices[i]);
        }
        while (!end){
            System.out.println("Please put your coin(1/5/10):  Tatol:" + total);
            String s = scanner.next();
            switch (s) {
                case "1":
                case "5":
                case "10":
                    int n = Integer.parseInt(s);
                    total += n;
                    break;
                case "e":
                    int index = s.charAt(0) - 101;
                    if (total >= Prices[index]) {
                        System.out.println("DON!");
                        total -= Prices[index];
                        break;
                    } else {
                        System.out.println("BEEP!");
                        break;
                    }
                default:
                    System.out.println("Wrong answer!");
                    break;
            }
        }
    }
}
package Project;

import java.util.Random;

public class DiceCounter {
    public static void main(String[] args) {
        Random random = new Random();
        int[] counters = new int[6];
        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(6)+1;
            System.out.println(n);
            counters[n-1]++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1)+" "+counters[i]+"times");
        }
    }
}
