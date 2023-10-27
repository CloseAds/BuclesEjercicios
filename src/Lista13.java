import java.util.Scanner;

public class Lista13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;


            do {
                System.out.println(" Introduce un numero menor que 13(-1 = fin del programa): ");
                numero = scanner.nextInt();


                    for (int i = 13 ; i < numero ; i = i+ 13){

                        System.out.println(i);

                    }

            }while ( numero != -1);
        }

}
