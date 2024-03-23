import java.util.Scanner;
import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    int num1, num2, numAleatorio;

    System.out.println("Informe um número: ");
    num1 = scan.nextInt();

    System.out.println("Informe outro número, sendo ele maior que o primeiro informado: ");
    num2 = scan.nextInt();

    int intervalo = num2 - num1;

    numAleatorio = random.nextInt(intervalo+ 1)+ num1;
    System.out.println("O número aleatório gerado no intervalo foi: "+numAleatorio);
    
    scan.close();
    } 
    }

