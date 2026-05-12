import java.util.Scanner;

public class Adding2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + sum);
    }
}
