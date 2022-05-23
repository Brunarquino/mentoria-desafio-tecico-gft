package desafios;

/*
Jogo de Craps:
Faça um programa que implemente um jogo de Craps. O jogador lança um par de dados, obtendo um valor entre 2 e 12.
Regras:

a) Se, na primeira jogada, você tirar 7 ou 11, você é um "Natural" e ganha;
b) Se você tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "Craps" e você perdeu;
c) Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10, este é seu "Ponto";
d) Seu objetivo agora é continuar jogando os dados até tirar este número novamente;
e) Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente;
 */

import java.util.Random;

public class Craps {

    public static void Craps(){

        int dado1, dado2, soma, ponto = 0;
        do{

            System.out.println("Lançando par de dados...");
            dado1 = lancarDado();
            dado2 = lancarDado();

            System.out.println(dado1);
            System.out.println(dado2);

            soma = dado1 + dado2;
            System.out.println(soma);

            if(ponto == 0){
                if(soma == 7 | soma == 11){
                    System.out.println("Você tirou " + soma);
                    System.out.println("é um natural e Ganhou!!");
                    break;
                } else if(soma == 2 | soma == 3 | soma == 12){
                    System.out.println("Você tirou " + soma);
                    System.out.println("é um Craps e Perdeu!!");
                    break;
                }else if(soma == 4 | soma == 5 | soma == 6 | soma == 8 | soma == 9 | soma == 10){
                    ponto = soma;
                    System.out.println("Ponto: " + ponto);
                    continue;
                }

            }else if(ponto != 0){

                if(soma == 7){
                    System.out.println("Você tirou 7 Perdeu!");
                    break;
                }else if(soma == ponto){
                    System.out.println("Ganhou!! conseguiu fazer o ponto novamente!" );
                    break;
                }else {
                    System.out.println("Jogue o dado novamente!");
                    continue;
                }
            }

        }while (true);

    }

    public static int lancarDado() {
        Random random = new Random();
        int dado;
        do {
            dado = random.nextInt(6);
        }while (dado == 0);

        return dado;
    }


}
