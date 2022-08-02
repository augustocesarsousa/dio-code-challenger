import java.util.Scanner;

/**
 * O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre
 * Arrays, uma estrutura de dados que armazena uma coleção de dados em um bloco
 * de memória.
 * 
 * Você está desenvolvendo um sistema para um local de eventos, neste local, é
 * necessário que a entrada seja permitida apenas para pessoas acima de 18 anos.
 * Faça um programa para ler um número N, a idade de N pessoas. Depois disso,
 * coloque a idade mínima permitida para se entrar no local, conforme exemplo.
 * Retorne às idades de quem não puder entrar.
 */
public class _15_noEntry {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] idade = new int[N];

        for (int i = 0; i < N; i++) {
            idade[i] = scan.nextInt();
        }

        System.out.println("Nao poderao entrar as idades: ");
        for (int i = 0; i < N; i++) {
            if (idade[i] < 18) {
                System.out.println(idade[i]);
            }

        }
        scan.close();
    }
}