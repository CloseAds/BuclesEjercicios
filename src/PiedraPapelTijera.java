import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int mínimo = 1;
        int máximo = 3;


        do {
            System.out.println("método 1: "+(int)(Math.random()*(máximo - mínimo +1)+mínimo));
            System.out.println("Escoga una opción para jugar");
            int opción2;

            System.out.println("Elige Piedra pulse (A)");
            System.out.println("Elige Papel pulse (B)");
            System.out.println("Eliga Tijera pulse (C)");

            int opción1 = s.nextLine().charAt(0);

            if (opción1 == 'A' &&  opción2 == 1){
                System.out.println("Empate");
            } else if (opción1 == 'A' &&  opción2== 2) {
                System.out.println("Has perdido");
            } else if (opción1 == 'A'&& opción2 == 3){
                System.out.println("Has ganado");
            }
        }


    }
}