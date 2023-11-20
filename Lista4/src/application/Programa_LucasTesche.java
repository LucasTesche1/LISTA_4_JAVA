package application;
import java.util.Scanner;
import entities.Pessoas;

public class Programa_LucasTesche {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoas[] cadastros = new Pessoas[10];
        int contadorCadastros = 0;

        while (true) {
            System.out.println(">MENU<");
            System.out.println("1 – Cadastro Graduação");
            System.out.println("2 – Cadastro PosGraduação");
            System.out.println("3 – Sair");

            int escolha = scanner.nextInt();

            if (escolha == 1 && contadorCadastros < 10) {
                
            	scanner.nextLine(); 
                System.out.println("Digite o nome completo: ");
                String nome = scanner.nextLine();
                System.out.println("Digite o CPF: ");
                String cpf = scanner.next();
                System.out.println("Digite a matrícula: ");
                String matricula = scanner.next();
                scanner.nextLine(); 
                System.out.println("Digite o curso de graduação: ");
                String cursoGraduacao = scanner.nextLine();

                cadastros[contadorCadastros++] = new Graduacao_LucasTesche(nome, cpf, matricula, cursoGraduacao);
            } else if (escolha == 2 && contadorCadastros < 10) {
            	scanner.nextLine(); 
                System.out.println("Digite o nome completo: ");
                String nome = scanner.nextLine();
                System.out.println("Digite o CPF: ");
                String cpf = scanner.next();
                System.out.println("Digite a matrícula: ");
                String matricula = scanner.next();
                scanner.nextLine(); 
                System.out.println("Digite o curso de pós-graduação: ");
                String cursoPosgraduacao = scanner.nextLine();

                cadastros[contadorCadastros++] = new PosGraduacao_LucasTesche(nome, cpf, matricula, cursoPosgraduacao);
            } else if (escolha == 3) {
                break;
            }
        }

        System.out.println("Todos os cadastros:\n");
        for (Pessoas pessoa : cadastros) {
            if (pessoa != null) {
                System.out.println(pessoa);
            }
        }
        
        scanner.close();
    }
}
