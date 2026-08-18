import java.util.Scanner;

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

///14
//    String numero;
//    System.out.print("Escriba un numero de tres cifras: ");
//    numero = entrada.nextLine();
//    System.out.println(numero.charAt(0));
//    System.out.println(numero.charAt(1));
//    System.out.println(numero.charAt(2));

///15
//    int n;
//    int x;
//    System.out.print("Ingrese un numero de 5 cifras: ");
//    n = entrada.nextInt();
//    while ((n > 99999) || (n < 10000)){
//        System.out.print("Numero incorrecto, Escriba un numero correcto: ");
//        n = entrada.nextInt();
//    }
//    x= n / 10000;
//    System.out.println( x );
//    n= n - (x*10000);
//    x= n / 1000;
//   // System.out.println( x );
//    n= n - (x*1000);
//    x= n / 100;
//    System.out.println( x );
//    n= n - (x*100);
//    x= n / 10;
//   // System.out.println( x );
//    n= n - (x*10);
//    System.out.println( n);
//
//    //System.out.println("pablo");
//
//}

//17

    int edad;
    String nombre;
    double salario = 0;
    System.out.print("Ingrese su edad: ");
    edad = entrada.nextInt();
    if (edad < 18) {
        System.out.println("No tiene edad para trabaja");
    } else {
        entrada.nextLine();
        System.out.printf("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.printf("Ingrese su Salario: ");
        salario = entrada.nextDouble();
        if (edad >= 18 && edad < 50) {
            salario = salario * 1.05;
        }
    }
    
      System.out.printf("%.2f", salario);
}