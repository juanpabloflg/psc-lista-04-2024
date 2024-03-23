import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String nome;
        int idade, salario, limiteCaracteres = 4;
        char estadoCivil, sexo;

        //Validando o nome do usuário
        System.out.println("Informe o seu nome: ");
        nome = scan.nextLine();
        while (nome.length() < limiteCaracteres) {
            System.out.println("O nome informado é invalido, informe novamente o nome: ");
            nome = scan.nextLine();
        }
        System.out.println("O nome informado é valido ");
        
        //Validando a idade do usuário
        System.out.println("Informe a sua idade: ");
        idade = scan.nextInt();
        while (idade <0 || idade >150) {
            System.out.println("A idade informada é invalida.\nInforme novamente a idade ");
            idade = scan.nextInt();
        }
        System.out.println("A idade informada é valida ");

        //Validando o salário do usuário
        System.out.println("Informe o seu salário: ");
        salario = scan.nextInt();
        while (salario <= 0) {
        System.out.println("Salário informado incorretamente.\nInforme novamente o seu salário ");
        salario = scan.nextInt();
        }
        System.out.println("Salário informado corretamente");

            //Validando o sexo do usuário
            System.out.println("Informe o seu sexo com 'f' para Feminino ou 'm' para Masculino: ");
            sexo = Character.toLowerCase(scan.next().charAt(0));
            while (sexo != 'f' && sexo != 'm') {
                System.out.println("O sexo foi informado incorretamente\nInforme novamente o sexo: ");
                sexo = Character.toLowerCase(scan.next().charAt(0));
            }
            //Informando o sexo do usuário
            if (sexo == 'M' || sexo == 'm') {
                System.out.println("O sexo informado é masculino. ");
            } else {
                System.out.println("O sexo informado é feminino. ");
            }


            //Validando o estado civil do usuário
            System.out.println("Informe o seu estado civil s=solteiro\nc=casado\nv=viúvo\nd=divorciado ");
            estadoCivil = Character.toLowerCase(scan.next().charAt(0));
            while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
                System.out.println("O estado civil informado é inválido.\nInforme novamente o seu estado civil:s=solteiro\nc=casado\nv=viúvo\nd=divorciado ");
                estadoCivil = Character.toLowerCase(scan.next().charAt(0));
            }
            // Informando o estado civil do usuário
            if (estadoCivil == 's') {
                System.out.println("O seu estado civil é solteiro. ");
            } else if (estadoCivil == 'c') {
                System.out.println("O seu estado civil é casado. ");
            } else if (estadoCivil == 'v') {
                System.out.println("O seu estado civil é viuvo");
            } else if (estadoCivil == 'd') {
                System.out.println("O seu estado civil é divorciado. ");
            }

            

            scan.close();



    }
}
