import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        String nombre;
        System.out.print("Por favor introduzca una edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Por favor introduzca una nombre: ");
        nombre = entrada.nextLine();
        System.out.println("El nombre que ingreso: " +nombre);
        System.out.println("La edad es: " +edad);
        entrada.close();
    }
}
