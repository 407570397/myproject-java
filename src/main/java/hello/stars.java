package hello;

public class stars {
    public static void main(String[] args) {
        for (int i=0 ; i<10 ; i++) {
            for (int j=0 ; j<20; j++) {
                if (j == 1 || j == 19) {
                    System.out.print(" ");
                }
                if (i == 1 || i == 8) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
