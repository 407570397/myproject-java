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
