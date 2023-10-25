import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        do {

            System.out.println("Introduce un numero (-1 para salir): ");
            numero = scanner.nextInt();

            if (numero != -1) {

                System.out.println("Tabla de multipilar del" + numero + ":");

                for (int i = 1; i <= 10; i++) {

                    int resultado = numero * 1;

                    System.out.println(numero + " x " + i + " = " + resultado);
                }
            }

        } while (numero != -1);
        scanner.close();
    }
}


