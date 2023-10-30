import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i<=30; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 30; i>= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 0; i<=18; i+=3 ) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 10; i>=0; i-=2) {
            System.out.print(i + " ");
        }
    }
}