package hello;

public class Starsline {
    public static void main(String[] args) {
        for (int i=0 ; i<11 ; i++) {
            for (int j=0 ; j<20; j++) {
                if (i*2==j){
                    System.out.print("*");
                }
                if (i*2==19-j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}
