package Calculadora;
import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Ingresa tú primer número");
        int numeroUno =  scanner.nextInt();
        System.out.println("Elige la operación");
        System.out.println("Ingresa tú segundo número");
        int numeroDos = scanner.nextInt();

    System.out.println("Suma = " + (numeroUno+numeroDos));
    System.out.println("Resta = " + (numeroUno-numeroDos));
    System.out.println("Multiplicación = " + (numeroUno*numeroDos));
    System.out.println("División = " + (numeroUno/numeroDos));
    System.out.println("Resto de la división es = " + (numeroUno%numeroDos));





    }
}
