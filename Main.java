import com.packages.strings.*;
import com.packages.arrays.*;
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
                case "2":
                    menuVectors();
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
        Test test1 = new Test();
        do {
            System.out.println("Menú cadenas de caracteres");
            System.out.println("0. Regresar");
            System.out.println("1. Pruebas de métodos de cadena");
            System.out.println("2. Palíndromo");
            System.out.println("3. Contar palabras");
            System.out.println("4. Mensaje oculto");
            System.out.println("5. Comparar identificaciones");
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
                    System.out.print("Ingrese un texto: ");
                    test1.setText(input.nextLine());
                    System.out.println("Total palabras: " + test1.countWords2());
                    break;
                case "4":
                    System.out.println("Mensaje oculto: " + test1.guessPhrase());
                    break;
                case "5":
                    test1.compareDigits("7188", "7178");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }
    
    
    public static void menuVectors()
    {
        String option;
        Vector objVec = new Vector();
        int position, datum;
        do {
            System.out.println("\nMenú Vectores");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar dato");
            System.out.println("2. Mostrar");
            System.out.println("3. Buscar");
            System.out.println("4. Suma");
            System.out.println("5. Promedio");
            System.out.println("6. Eliminar");
            System.out.println("7. Modificar");
            System.out.println("8. Insertar");
            System.out.println("9. Total datos");
            System.out.print("Ingrese su opción: ");
            option = input.next();
            input.nextLine();
            switch (option) {
                case "0":
                    break;
                case "1":
                    if (objVec.getN() == objVec.getT()) {
                        System.out.println("Vector lleno");
                    } else {
                        System.out.print("Dato: ");
                        datum = input.nextInt();
                        input.nextLine();
                        objVec.addVector(datum);
                    }
                    break;
                case "2":
                    if (objVec.getN() > 0) {
                        Vector.showVector(objVec.getVec(), objVec.getN());
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "3":
                    if (objVec.getN() > 0) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = objVec.searchVector(datum);
                        if (position == -1) {
                            System.out.print(datum + " no se encuentra");
                        } else {
                            System.out.print(datum + " se encuentra en posición " + position);
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "4":
                    if (objVec.getN() > 0) {
                        System.out.println("Suma vector: " + objVec.sumVector());
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "5":
                    if (objVec.getN() > 0) {
                        System.out.println("Promedio vector: " + objVec.averageVector());
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "6":
                    if (objVec.getN() > 0) {
                        System.out.print("Dato a eliminar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = objVec.searchVector(datum);
                        if (position == -1) {
                            System.out.print(datum + " no se encuentra");
                        } else {
                            objVec.deleteVector(position);
                            System.out.println("Dato eliminado correctamente");
                            Vector.showVector(objVec.getVec(), objVec.getN());
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "7":
                    if (objVec.getN() > 0) {
                        System.out.print("Dato a modificar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = objVec.searchVector(datum);
                        if (position == -1) {
                            System.out.print(datum + " no se encuentra");
                        } else {
                            System.out.print("Nuevo dato: ");
                            datum = input.nextInt();
                            input.nextLine();
                            objVec.updateVector(position, datum);
                            System.out.println("Dato actualizado correctamente");
                            Vector.showVector(objVec.getVec(), objVec.getN());
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "8":
                    if (objVec.getN() != objVec.getT()) {
                        System.out.print("Dato de referencia: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = objVec.searchVector(datum);
                        if (position == -1) {
                            System.out.print(datum + " no se encuentra");
                        } else {
                            System.out.print("Dato a insertar: ");
                            datum = input.nextInt();
                            input.nextLine();
                            objVec.insertBeforeVector(position, datum);
                            System.out.println("Dato insertado correctamente");
                            Vector.showVector(objVec.getVec(), objVec.getN());
                        }
                    } else {
                        System.out.println("Vector lleno");
                    }
                    break;
                case "9":
                    System.out.println("Total datos: " + objVec.getN());
                default:
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }
}