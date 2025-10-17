import operacoes.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do { 
            
            IO.print("Você deseja ir para qual operação? \n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair");
            int escolha = sc.nextInt();

            if (escolha == 5) {
                IO.print("Saindo...");
                sc.close();
                break;
            }

            IO.print("Digite o primeiro número:");
            int n1 = sc.nextInt();
            IO.print("Digite o segundo número:");
            int n2 = sc.nextInt();

            switch (escolha) {
                case 1 -> IO.print("\n\nResultado: " + Adicao.adicao(n1, n2) + "\n");
                case 2 -> IO.print("\n\nResultado: " + Subtracao.subtracao(n1, n2) + "\n");
                case 3 -> IO.print("\n\nResultado: " + Multiplicacao.multiplicacao(n1, n2) + "\n");
                case 4 -> IO.print("\n\nResultado: " + Divisao.divisao(n1, n2) + "\n");
                case 5 -> {
                    IO.print("\n\nSaindo...");
                    sc.close();
                    return;
                }
                default -> IO.print("\n\nOpção inválida. Tente novamente.");
            }


        } while (true);

    }

}
