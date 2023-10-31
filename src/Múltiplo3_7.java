import java.util.Scanner;

public class Múltiplo3_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero1 = 3;
        int numero2 = 7;


            for (int i = 10; i < 1000; i++) {

                if ( i % numero1==0 && i % numero2==0 ){
                    System.out.println(i);
                }

            }
        }
}
