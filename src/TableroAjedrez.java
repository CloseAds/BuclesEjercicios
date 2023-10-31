import java.util.Scanner;

public class TableroAjedrez {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar el tamaño de las casillas y el carácter de relleno
            System.out.print("Ingrese el tamaño de las casillas (>=3): ");
            int tamanoCasilla = scanner.nextInt();

            if (tamanoCasilla < 3) {
                System.out.println("El tamaño de las casillas debe ser mayor o igual a 3.");
                return;
            }

            System.out.print("Ingrese el carácter de relleno: ");
            char caracterRelleno = scanner.next().charAt(0);

            // Dibujar el tablero de ajedrez
            for (int fila = 0; fila < 8; fila++) {
                for (int col = 0; col < 8; col++) {
                    boolean casillaNegra = (fila + col) % 2 == 1;

                    for (int i = 0; i < tamanoCasilla; i++) {
                        for (int j = 0; j < tamanoCasilla; j++) {
                            if ((fila == 0 && col == 0) || (casillaNegra && i != 0 && j != 0)) {
                                System.out.print(caracterRelleno);
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                }
                System.out.println(); // Salto de línea para la siguiente fila
            }
        }
    }


