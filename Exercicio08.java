import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        
        System.out.print("Informe o primeiro número: ");
        num1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        num2 = scan.nextInt();

        System.out.print("Informe o terceiro número: ");
        num3 = scan.nextInt();

        System.out.print("Informe o quarto número: ");
        num4 = scan.nextInt();

        System.out.print("Informe o quinto número: ");
        num5 = scan.nextInt();
        
        int soma = (num1 + num2 + num3 + num4 + num5);
        int media = (num1 + num2 + num3 + num4 + num5) /5;

        System.out.println("A soma dos números resulta: "+soma);
        System.out.println("A media dos números é: "+media);
        scan.close();
    }
}
