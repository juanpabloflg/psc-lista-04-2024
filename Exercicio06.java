import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        int numero = 1, opcao;
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma opção abaixo para visualizar os números de 1 a 20.\n1:Visualizar um abaixo do outro\n2:Visualizar um do lado do outro");
        opcao = scan.nextInt();


        // OPÇÃO 1
        if (opcao == 1) {
        while (numero <= 20) {
        System.out.println(numero);
        numero++;
        }
    }
        // OPÇÃO 2
        else if (opcao == 2) {
        while (numero <= 20) {
        System.out.print(numero);
        numero++;
    }
} else {
System.out.print("Opção digitada inválida.");
}
scan.close();
    }
}
