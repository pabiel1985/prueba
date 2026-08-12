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
    int n;
    System.out.print("Ingrese un numero de 5 cifras: ");
    n = entrada.nextInt();
    while (n % 100000 == 0){
        System.out.println("Escriba un numero correcto");
        n = entrada.nextInt();
    }
    System.out.println("pablo");

}