import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num1, num2, num3, num4, num5;
    
    System.out.print("Informe o primeiro número:");
    num1 = scan.nextInt();

    System.out.print("Informe o segundo número:");
    num2 = scan.nextInt();

    System.out.print("Informe o terceiro número:");
    num3 = scan.nextInt();

    System.out.print("Informe o quarto número:");
    num4 = scan.nextInt();

    System.out.print("Informe o quinto número:");
    num5 = scan.nextInt();

    if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
    System.out.print("O maior número é o: "+num1);
    } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
    System.out.print("O maior número é o: "+num2);
    } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
    System.out.print("O maior número é o: "+num3);
    } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
    System.out.print("O maior número é o: "+num4);
    } else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
        System.out.print("O maior número é o: "+num5);
    }
    scan.close();
    }
}
