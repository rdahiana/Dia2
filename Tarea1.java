import java.util.ArrayList;
import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {

        /*------------------------------------------------------------------------------*/
        /*Declara dos variables numéricas (con el valor que desees), muestra por consola la
        suma, resta, multiplicación, división y módulo (resto de la división).*/
        int valor1, valor2 ;
        valor1 = 10;
        valor2=5;

        System.out.println("Suma " + (valor1+valor2));
        System.out.println("Resta " + (valor1-valor2));
        System.out.println("Multiplicacion " + (valor1*valor2));
        System.out.println("Division " + (valor1/valor2));
        System.out.println("Resto " + (valor1%valor2));
        /*------------------------------------------------------------------------------*/

        /*Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor
         de los dos.Si son iguales indicarlo también. Ves cambiando los valores para
         comprobar que funciona.*/

        if (valor1==valor2){
            System.out.println("Son iguales");
        } else if (valor1>valor2) {
            System.out.println("El numero mayor es " + valor1);
        } else{
            System.out.println("El numero mayor es "+valor2);
        }
        /*------------------------------------------------------------------------------*/

        /*Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida
por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.*/
        /*4. Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir.*/
        Scanner read = new Scanner(System.in);
        String nombre = "Ruth";
        System.out.println("Bienvenido "+nombre);
        System.out.println("Ingrese su nombre ");
        nombre = read.nextLine();
        System.out.println("Bienvenido "+nombre);
        /*------------------------------------------------------------------------------*/

        /*5. Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
        Si no lo es,también debemos indicarlo.*/
        System.out.println("Ingrese un numero");
        int number = read.nextInt();
        if (number%2==0){
            System.out.println("El numero "+number+" ingresado por pantalla es divisible" +
                    " por 2");
        }else{
            System.out.println("El numero "+number+" ingresado por pantalla no es divisible" +
                    " por 2");;
        }
        /*------------------------------------------------------------------------------*/
    /*Lee un número por teclado que pida el precio de un producto (puede tener
    decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del
    10%.*/
        final double IVA = 0.01;

        System.out.println("Ingrese el precio del producto ");
        double precio = read.nextDouble();
        System.out.println("El precio final del producto es "+ (precio + (precio*IVA)));

        /*------------------------------------------------------------------------------*/
        /*Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.*/
        System.out.println("Lista de Numeros divisibles entre 2 y 3 (del 1 al 100   )");
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0 && i%3==0) {
                System.out.println(i);
            }
        }
        /*------------------------------------------------------------------------------*/
    /*8. Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
         si no lo es lo volverá a pedir (do while), después muestra ese número por consola.*/

        number = -1;

        do {
            System.out.println("Ingrese un numero entero ");
            number = read.nextInt();
        } while (number<0);
        /*------------------------------------------------------------------------------*/
    /*9. Escribe una aplicación con un String que contenga una contraseña cualquiera.
    Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes
    ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Correcto!”.
     Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden
     intentos, si no acierta en los 3 intentos mostrar el mensaje “Fallaste jaja!!”).*/
        String contrasenha = "ASF234";
        String contrasenhaIng = "";
        int contador = 1;
        do {
            System.out.println("Ingrese la contrasenha ");
            contrasenhaIng = read.nextLine();
            if (contrasenha.equals(contrasenhaIng)) {
                System.out.println("CORRECTO!");
                break;
            } else if (contador==3) {
                System.out.println("Fallaste jaja!!");
            }
            contador += 1;
        }while (!contrasenha.equals(contrasenhaIng) && (contador<=3));
    /*------------------------------------------------------------------------------
     /*Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia
      laboral o no (“De lunes a viernes consideramos dias laborales”).*/
        ArrayList<String> diasLaborales = new ArrayList<>();
        // Agregar los días de la semana al ArrayList
        diasLaborales.add("lunes");
        diasLaborales.add("martes");
        diasLaborales.add("miércoles");
        diasLaborales.add("jueves");
        diasLaborales.add("viernes");

        System.out.println("Ingrese un día de la semana");
        String diaIngresado = read.nextLine();

        boolean esDiaLaboral = false;
        for (int i = 0; i < diasLaborales.size(); i++) {
            if (diaIngresado.equalsIgnoreCase(diasLaborales.get(i))) {
                esDiaLaboral = true;
                break; // Si ya encontramos que es un día laboral, salimos del bucle
            }
        }

        if (esDiaLaboral) {
            System.out.println("Es un día laboral");
        } else {
            System.out.println("No es un día laboral");
        }
    }
}
