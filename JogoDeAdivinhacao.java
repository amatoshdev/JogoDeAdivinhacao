import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {

    public static void main(String[] args) {

        /* Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número,
         em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

        Dicas:

        Para gerar um número aleatório em Java: new Random().nextInt(100);5050oko50
        Utilize o Scanner para obter os dados do usuário;
        Utilize uma variável para contar as tentativas;
        Utilize um loop para controlar as tentativas; / OK
        Utilize a instrução break; para interromper o loop. */


        // Começo do programa:
        System.out.println("""
                                
                Vamos jogar um jogo!
                                
                Nesse jogo você deve adivinhar o número aleatório sorteado pelo algoritmo que poderá ser qualquer um entre 0 e 100.
                                
                Para isso você terá 5 chances para acertar.
                                
                Se o número que você digitar for maior ou menor do que o sorteado, irei te notificar para que tenha uma ideia se está chegando perto ou não de acertar ;)
                """);


        // Scanner
        Scanner leitor = new Scanner(System.in);


        // Mensagem de confirmação de entendimento das regras e procedimentos:
        System.out.println("DIGITE 'OK' PARA CONTINUAR O PROGRAMA.");


        // Scanner do input do usuário:
        String inputStringOk = leitor.nextLine();


        // Condição para caso o usuário não digite "ok":
        if (!inputStringOk.equalsIgnoreCase("ok")) {

            do {
                System.out.println("Digite 'ok' para prosseguir para o jogo.");
                inputStringOk = leitor.nextLine(); // Atualiza inputStringOk dentro do loop
            } while (!inputStringOk.equalsIgnoreCase("ok"));

        }


        // Variáveis para gerar o número aleatório e para guardar cada iteração do "for":
        int numAleatorio = new Random().nextInt(100);
        int contTent = 0;

        System.out.println("______________________________");

        // Mensagem de início do jogo:
        System.out.println("\nÓtimo! Vamos começar o jogo! \n\nDigite um número:");


        // Estrutura de repetição "for" para dar looping enquanto o usuário não acertar o número. Caso acerte ou acabe as tentativas o programa se encerra.
        for (int contador = 4; contador >= 0; contador--) {

            int leitorNum = leitor.nextInt();
            contTent += contador;


            /* Estabelecimento dos limites 0 e 100. Caso o usuário digite um número menor que 0 ou maior que 100 ele ainda perde uma tentativa como penalização pois está ciente das regras do jogo. */
            if (leitorNum > 100) {

                System.out.println("O limite máximo é 100. Escreva um número menor ou igual a 100.");

            } else if (leitorNum < 0) {

                System.out.println("O limite mínimo é 0. Escreva um número maior ou igual a 0.");
            }


                /* Mensagens exibidas quando o usuário digita um número para
                 que tenha ideia se está perto ou não de acertar, ou se acertou o número aleatório. */
            if (leitorNum < numAleatorio) {

                System.out.println("\nO número que você digitou é MENOR do que o número sorteado pelo algoritmo. Tente novamente!");

            } else if (leitorNum > numAleatorio) {

                System.out.println("\nO número que você digitou é MAIOR do que o número sorteado pelo algoritmo. Tente novamente!");

            } else {


                System.out.printf("""
                                                    
                        Parabéns!! Você acertou!
                                                    
                        O número sorteado pelo algoritmo é %d!
                                                    
                        Sinta-se livre para jogar novamente apertando Ctrl + F5 :D """, numAleatorio);

                        break;
            }


            // Mensagem que exibe as tentativas restantes do usuário.
            System.out.println(contador + " tentativas restantes.");


            // Mensagem exibida caso o usuário não acerte o número aleatório e acabe suas chances.
            if (contador == 0) {

                System.out.printf("""
                                                    
                        Infelizmente suas chances acabaram.
                                                    
                        O número aleatório sorteado pelo algoritmo era %d.
                                                    
                        Reinicie o programa utilizando o comando 'Ctrl + F5' para tentar novamente! Boa sorte ;)!
                                                    
                        """, numAleatorio);
            }
        }
    }
}
