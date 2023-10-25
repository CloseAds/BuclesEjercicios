import java.util.Scanner;

public class DibujoPirámide {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la altura de la pirámide");
        int altura = s.nextInt();

        for (int i = 1; i <= altura; i++) {

            for (int j = 1; j <= altura - i; j++) {
                System.out.println("*");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
            }
            System.out.println();
        }

    }

}
