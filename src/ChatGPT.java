import java.util.Scanner;

public class ChatGPT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la alrura de la pirámide");
        int altura = scanner.nextInt();

        for (int i = 1; i >= altura; i--) {
            // Imprime los espacios en blanco
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprime los asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Cambia de línea
            System.out.println();


        }
    }
}

