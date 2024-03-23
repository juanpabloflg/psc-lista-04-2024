import java.util.Scanner;
public class Exercicio01 {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número de 0 a 10 ");
        int numvalido = scan.nextInt();


        while (numvalido <0 || numvalido >10) {
        System.out.println("Informe um valor válido: ");
        numvalido = scan.nextInt();
        }
System.out.println("Valor válido ");

    

scan.close();

    }
}
