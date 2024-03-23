import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);


System.out.println("Informe o seu nome de usuário: ");
String usuario = scan.nextLine();

System.out.println("Informe a sua senha: ");
String senha = scan.nextLine();

while (usuario.equals(senha)) {
    System.out.println("Erro no login\nInforme novamente o seu usuário: ");
    usuario = scan.nextLine();
    System.out.println("Escreva novamente a sua senha: ");
    senha = scan.nextLine();
}
System.out.println("Login realizado com sucesso ");


scan.close();

    }
}
