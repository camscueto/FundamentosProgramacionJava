
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();

        if (edad < 0) {
            System.out.println("Edad no valida");
        } else if (edad < 18) {
            System.out.println("Es menor de edad");
        } else if (edad < 65) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es adulto mayor");
        }

        entrada.close();
    }

}
