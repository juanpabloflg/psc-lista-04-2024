public class Exercicio04 {
    public static void main(String[] args) {
    int populacaoA = 80000;
    int populacaoB = 200000;
    int ano = 0;


    while (populacaoA < populacaoB) {
        populacaoA += populacaoA * 0.03;
        populacaoB += populacaoB * 0.015;
        ano++;
    }
    System.out.println("Demorará " + ano +  " anos para a populacão do país A alcançar a população do país B ");



    }
}
