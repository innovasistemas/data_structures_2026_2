import com.packages.strings.*;
import java.util.Scanner;

public class Main 
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        String option;
        do {
            System.out.println("Menú de opciones");
            System.out.println("0. Salir");
            System.out.println("1. Cadenas de caracteres");
            System.out.println("2. Vectores");
            System.out.println("3. Matrices");
            System.out.print("Ingrese su opción: ");
            option = input.next();
            switch (option) {
                case "0":
                    System.out.println("Hasta pronto");
                    break;
                case "1":
                    menuStrings();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }

    public static void menuStrings()
    {
        String option;
        StringsChar str = new StringsChar();
        PalindromePhrase palin = new PalindromePhrase();
        do {
            System.out.println("Menú cadenas de caracteres");
            System.out.println("0. Regresar");
            System.out.println("1. Pruebas de métodos de cadena");
            System.out.println("2. Palíndromo");
            System.out.println("3. Contar palabras");
            System.out.print("Ingrese su opción: ");
            option = input.next();
            input.nextLine();
            switch (option) {
                case "0":
                    break;
                case "1":
                    str.testStrings();
                    break;
                case "2":
                    System.out.print("Ingrese un texto: ");
                    palin.setText(input.nextLine());
                    // input.nextLine();
                    if (palin.palindrome()) {
                        System.out.println(palin.getText() + " es palíndromo");
                    } else {
                        System.out.println(palin.getText() + " no es palíndromo");
                    }
                    break;
                case "3":
                    Test test1 = new Test();
                    System.out.print("Ingrese un texto: ");
                    test1.setText(input.nextLine());
                    System.out.println("Total palabras: " + test1.countWords2());
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }
}