import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int populacaoA = 0, populacaoB = 0, ano = 0;
        double taxaA = 0, taxaB = 0;

        // Validando os dados das populações
        System.out.println("Informe a população do país A, sendo ela menor que a do país B: ");
        populacaoA = scan.nextInt();

        System.out.println("Informe a taxa de crescimento do país A: ");
        taxaA = scan.nextDouble();

        System.out.println("Informe a população do país B, sendo ela maior que a do país A: ");
        populacaoB = scan.nextInt();

        System.out.println("Informe a taxa de crescimento do país B: ");
        taxaB = scan.nextDouble();
        
        //Calculando os dados da população
        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            ano++;
        }
        System.out.println("Levará "+ ano +"ano(s) para a população do país A alcançar a população do país B");
        scan.close();
    }
}
