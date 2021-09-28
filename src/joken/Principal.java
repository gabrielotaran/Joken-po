package joken;

import java.util.Random;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		//1 - Papel; 2 - Pedra; 3 - Tesoura.
		//J(1) C(2) = -1, Jogador venceu
		//J(1) C(3) = -2, Computador Venceu
		//J(2) C(3) = 1, Computador Venceu
		//J(2) C(3) = -1, Jogador Venceu
		//J(3) C(1) = 2, Jogador Venceu
		//J(30 C(2) = 1, Computador Venceu
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite sua jogada entre 1(PAPEL),2(PEDRA),3(TESOURA):");
		
		Random gerador = new Random();
		int numeroJogador;
		int escolhaComputador;
		int pontosJogador = 0;
		int pontosComputador = 0;
		
		for(int i = 0; i < 5; i++) {
			numeroJogador = leitor.nextInt();
			escolhaComputador = gerador.nextInt(3) + 1;
			// imprimir a escolha da CPU
			switch(escolhaComputador) {
			case 1:
				System.out.println("Computador escolheu Papel");
				break;
			case 2:
				System.out.println("Computador escolheu Pedra");
				break;
			case 3:
				System.out.println("O computador escolheu Tesoura");
				break;
			}
			// verificacao do do final da partida
			if(numeroJogador == escolhaComputador) {
				System.out.println("Empate");
			}
			else if(numeroJogador - escolhaComputador == -1 ||
					(numeroJogador - escolhaComputador) == 2){
				System.out.println("Usuario venceu.");
				pontosJogador++;
			}
			else {
				System.out.println("Computador Venceu a partida.");
				pontosComputador = pontosComputador + 1;
			 }
			}
		//verificacao da pontuacao do jogo
		if(pontosJogador > pontosComputador) {
			System.out.println("Usuario venceu O JOGO.");
		}
		else if (pontosJogador < pontosComputador) {
			System.out.println("Computador Venceu O JOGO.");
		}
		else {
			System.out.println("Empate entre jogador e CPU");
		}
		}
	}
