/**
 * UPTx - Fundamentos de Programación Orientada a Objetos
 * Práctica No. 3     Grupo: 5H
 * Tema: Obtener datos y conversión de tipos
 * Integrantes: Eder López Villarreal
 * Modificación: 13/ene/2024
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Declaración de variables
        int numint;
        double numdbl,res1, res2, res3, res4, res5, res6;

        //Mensaje de bienvenida
        System.out.printf("Bienvenidos, favor de seguir las instrucciones\n");

        //Documentar: Creación de un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        //Documentar: Solicita y almacena un número entero que ingresa el usuario
        System.out.printf("\nDigite un número entero: ");

        //Documentar: Solicita y almacena un número decimal que ingresa el usuario
        numint = scanner.nextInt();
        System.out.printf("\nDigite un número decimal: ");
        numdbl = scanner.nextDouble();

        //Documentar:Realize operaciones con los números ingresados por el usuario
        // Operación 1: Suma de un número decimal y un número entero
        res1 = numdbl + numint;

        // Operación 2: División de un número entero entre la parte entera de un número decimal
        // Nota: Se puede producir un error si la parte decimal de numdbl es cero, ya que no es posible dividir por cero.
        // Se puede producir un error al realizar la conversión de numdbl a int, la parte decimal se truncará. Esto podría
        // llevar a una pérdida de información si numdbl tiene una parte decimal significativa. La pérdida de información podría
        // afectar la precisión del resultado.
        res2 = numint / (int) numdbl;

        // Operación 3: División de un número entero entre un número decimal
        // Nota: Se puede producir un error si numdbl es cero, ya que no es posible dividir por cero.
        res3 = numint / numdbl;

        // Operación 4: División de un número decimal entre un número entero
        // Nota: Se puede producir un error si numint es cero, ya que no es posible dividir por cero.
        res4 = numdbl / numint;

        // Operación 5: División de la parte entera de un número decimal entre un número entero
        // Nota: Se puede producir un error si numint es cero, ya que no es posible dividir por cero.
        // Se puede producir un error al realizar la conversión de numdbl a int, la parte decimal se truncará. Esto podría
        // llevar a una pérdida de información si numdbl tiene una parte decimal significativa. La pérdida de información podría
        // afectar la precisión del resultado.
        res5 = (int) numdbl / numint;

        // Operación 6: Suma de la parte entera de un número decimal y un número entero
        res6 = (int) numdbl + numint;

        // Muestra los resultados de las operaciones
        System.out.printf("\nEl valor de la operación = " + res1);
        System.out.printf("\nEl valor de la operación = " + res2);
        System.out.printf("\nEl valor de la operación = " + res3);
        System.out.printf("\nEl valor de la operación = " + res4);
        System.out.printf("\nEl valor de la operación = " + res5);
        System.out.printf("\nEl valor de la operación = " + res6);
    }
}