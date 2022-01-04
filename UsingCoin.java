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
        int max = 0;
        int point = max;
        for (int i = 0; i < 6; i++) {
//            System.out.println((i+1)+" "+counters[i]+"times");
            if (counters[i]>max){
                max = counters[i];
                counters[i] = point;
                point = max;
                System.out.println((i+1)+" "+max+"times");
            }
        }
    }
}
package Project;

public class Sorting {
    public static void main(String[] args) {
        int[] n = {12, 3, 6, 5, 15};
        System.out.println(n.length);
        for (int i = 0; i < n.length-1; i++) {
            System.out.print("i:"+i);
            for (int j = i+1; j <n.length ; j++) {
                System.out.print("  "+j+",");
                if (n[i]<n[j]) {
                    int tmp = n[i];
                    n[i]=n[j];
                    n[j]=tmp;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");
        }
    }
}

//撲克花色
package project;

public class main {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                String tt = "c";
                switch (i){
                    case 1:
                        tt = "d";
                        break;
                    case 2:
                        tt = "h";
                        break;
                    case 3:
                        tt = "s";
                        break;
                }
                System.out.print((j+1)+tt+" ");
            }
            System.out.println();
        }
    }
}
package project;

public class main {
    public static void main(String[] args) {
//        unicode
        int n = 0x00A9;
        System.out.println((char) n);
        char[] types = {'c', 'd', 'h', 's'};
        String tt = "cdhs";
        System.out.println(tt.charAt(1));
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print((j+1) + "" + types[i] + " ");
                }
            System.out.println();
        }
    }
}

//1221

import java.util.Random;

public class Dice {
    int point = 1;
    public void roll(){
//        System.out.println("rolling");
        Random random = new Random();
        point = random.nextInt(6)+1;
    }
    public boolean isMax(){
        if (point == 6){
            return true;
        }else {
            return false;
        }
    }
}
public class Roll {
    public static void main(String[] args) {
        int[] counters = new int[6];
        for (int i = 0; i < 10; i++) {
            Dice dice = new Dice();
            Dice d2 = new Dice();
            dice.roll();
            System.out.print(dice.point);
            String s = dice.isMax() ? "*" : "" ;
            System.out.println(s);
//            if (dice.isMax()){
//                System.out.println("*");
//            }else {
//                System.out.println();
//            }
            counters[dice.point-1]++;
        }
//        int max = 0;
//        int point = max;
//        for (int i = 0; i < 6; i++) {
//            if (counters[i] > max) {
//                max = counters[i];
//                counters[i] = point;
//                point = max;
//                System.out.println((i + 1) + " " + max + "times");
//            }
//        }
    }
}

import java.util.Random;

public class Guess {
    Random random = new Random();
    int secret = random.nextInt(10)+1;
    boolean end = false;
    public int guess(int n){
        return n - secret;
    }
    public boolean bigger(int n){
        if (n == secret){
            end = true;
        }
        if (n > secret){
            return true;
        }else{
            return false;
        }
    }
    public boolean smaller(int n) {
        if (n == secret) {
            end = true;
        }
        return n < secret;
    }
}

import java.util.Scanner;

public class Guess1To10 {
    public static void main(String[] args) {
        Guess guess = new Guess();
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int counter =0;
        while (!guess.end){
            System.out.println("Please Enter");
            String s = scanner.next();
            n = Integer.parseInt(s);
            int diff = guess.guess(n);
            if (diff > 0){
                System.out.println("Samller");
            } else if (diff < 0){
                System.out.println("Bigger");
            } else {
                System.out.println("Bingo");
            }
            counter++;
        }
    }
}
//1228
package ll;
import java.util.Random;
public class Dice {
    int point = 1;

    public Dice(){
        point = new Random().nextInt(6)+1;
    }

    public boolean isMax(){
        if(point==6){
            return true;
        }else {
            return false;
        }
    }
}
package ll;

public class Random {
    public static void main(String[] args) {
        int[] counters = new int[6];
        for (int i = 0; i < 10; i++) {
            Dice dice = new Dice();
            System.out.print(dice.point);
            System.out.println(dice.isMax() ? "*" : " ");
            counters[dice.point - 1]++;
        }
        int max = 0;
        int point = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1) + " " + counters[i]);
            if (counters[i] > max) {
                max = counters[i];
                point = i+1;
            }
        }
    }
}

//0104
public class pp {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (i>0 && i!=4 && j!=0 && j!=5){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class pp {
    public static void main(String[] args) {
        int n = -1;
        Scanner scanner = new Scanner(System.in);
        while (n != 0){
            System.out.println("buy item:");
            System.out.println("1)");
            System.out.println("2)");
            System.out.println("3)");
            System.out.println("4)");
        }
    }
}
//Total 超過多少打折
//件數
