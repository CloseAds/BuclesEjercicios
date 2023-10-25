import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = ((int) Math.random() * 100) +1; //Se multiplica por 100 para que el numero sea del 0 al 99 y se suma 1 para que sea del 1 al 100;

        System.out.println(" Introduce un numero del 1 al 100: ");
        int num,CONT=0;

        do {
            num=scanner.nextInt();
            if (num==num1){
                System.out.println("Enhorabuena, has acertado el numero!");
            }else {
                System.out.println("Has fallado");
            }
            CONT++;
        }while (CONT!=10);
        System.out.println("El numero es: " + num1);
    }
}

