import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        /*Cargar un array de manera aleatoria con 10 números enteros del -5 al 5. Imprimirlo en
        pantalla y computar cuál es el mayor elemento del vector.*/
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(11) - 5;
            numeros.add(numeroAleatorio);
            if (numeroAleatorio > mayor) {
                mayor = numeroAleatorio;
            }
        }
        System.out.println("El array de números aleatorios es:");
        System.out.println(numeros);
        System.out.println("El número mayor es: " + mayor);

        /*2. Cargar un array de manera aleatoria con 100 números enteros del -30 al 30. Imprimirlo en
        pantalla y computar cuál es el elemento que más veces se repite, y cuáles son los números
        que no están presentes (si es que hay alguno).*/

        numeros.clear(); // Limpiar el ArrayList para cargar nuevos números
        int[] frecuencia = new int[61]; // Array para contar la cantidad de veces que se repite cada número
        for (int i = 0; i < 100; i++) {
            //cargamos los valores aleatorios
            int numeroAleatorio = random.nextInt(61) - 30;
            numeros.add(numeroAleatorio);

            frecuencia[numeroAleatorio + 30]++; // Incrementar la frecuencia del número en 1

        }
        System.out.println("El array de números aleatorios es:");
        System.out.println(numeros);

        // Encontrar el elemento que más veces se repite
        int maxFrecuencia = 0;
        int elementoMasRepetido = Integer.MIN_VALUE;
        for (int i = 0; i < frecuencia.length; i++) {
            if (frecuencia[i] > maxFrecuencia) {
                maxFrecuencia = frecuencia[i];
                elementoMasRepetido = i - 30;
            }
        }
        System.out.println("El elemento que más veces se repite es: " + elementoMasRepetido);

        // Encontrar los números que no están presentes
        System.out.println("Los números que no están presentes son:");
        for (int i = -30; i <= 30; i++) {
            if (frecuencia[i + 30] == 0) {
                System.out.print(i + " ");
            }
        }


        /* Hacer una función que, dada una palabra (String) o frase, diga si la misma es palíndrome o
        no. Una palabra/frase palíndrome es aquella que se lee igual tanto de atrás para adelante,
        como de adelante para atrás. */
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase:");
        String frase = read.nextLine();

        // Eliminar los caracteres especiales y los espacios en blanco
        String cadenaProcesada = frase.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Crear un StringBuilder para revertir la cadena
        StringBuilder stringBuilder = new StringBuilder(cadenaProcesada);
        String fraseRevertida = stringBuilder.reverse().toString();

        // Comprobar si la cadena procesada es igual a la cadena revertida
        if (cadenaProcesada.equals(fraseRevertida)) {
            System.out.println("Es una palabra o frase palíndromo.");
        } else {
            System.out.println("No es una palabra o frase palíndromo.");
        }

        /* Dada una cadena de caracteres (String) de longitud desconocida que tiene solamente dígitos,
        crear un array de N elementos (donde N es el tamaño de la cadena) que tenga cada uno de los
        valores numéricos de los dígitos. */
        System.out.println("Ingrese una cadena de dígitos:");
        String cadena = read.nextLine();

        ArrayList<Integer> vNumeros = new ArrayList<>();

        for (int i = 0; i < cadena.length(); i++) {
            // Convertir el carácter en la posición 'i' a su valor numérico
            int valorNumerico = Character.getNumericValue(cadena.charAt(i));
            vNumeros.add(valorNumerico);
        }

        // Imprimir el ArrayList de números
        System.out.println("Números en la cadena:");
        for (int i = 0; i < vNumeros.size(); i++) {
            System.out.print(vNumeros.get(i) + " ");
        }
    }
}

