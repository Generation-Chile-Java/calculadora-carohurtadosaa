package CalculadoraPro;
import java.util.Scanner;

        public class NewCalculator {
        public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Ingresa tú primer número");
        double numeroUno =  scanner.nextDouble();

        System.out.println("Ingresa la operacion");
        String operacion =  scanner.next();

        System.out.println("Ingresa tú segundo número");
        double numeroDos = scanner.nextDouble();

        if (operacion.equals("+")) {
        System.out.println("Suma = " + (numeroUno+numeroDos));}

        else if (operacion.equals("-")) {
        System.out.println("Resta = " + (numeroUno-numeroDos));}

        else if (operacion.equals("*")) {
        System.out.println("Multiplicación = " + (numeroUno*numeroDos));}

        else if (operacion.equals("/")) {
        System.out.println("División = " + (numeroUno/numeroDos));}

        else {
        System.out.println("Resto de la división es = " + (numeroUno%numeroDos));}





        }
    }


