/*
 * Projeto 5 - Caixa Eletrônico
 * 
 * Sistema bancário simples desenvolvido para consolidar
 * fundamentos de programação em Java.
 * 
 * O programa simula autenticação por senha e operações
 * bancárias básicas, como consulta de saldo, saque,
 * depósito, transferência e pagamento de contas.
 * 
 * Conceitos aplicados:
 * - Variáveis e tipos de dados
 * - Entrada e saída com Scanner
 * - Estruturas condicionais (if/else)
 * - Estrutura de seleção (switch/case)
 * - Estruturas de repetição (do-while)
 * - Manipulação de String
 * - Operações aritméticas e validações
 * 
 * Versão: 1.0
 * Data: 18/08/2026
 */
package caixa.eletronico.simples;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Dados de autenticação e controle de tentativas
		int tentativas = 0;
		String senhaDigitada = "";
		
		// Dados primários da conta do usuário
		String usuario = "Gabriel";
		double saldo = 2500.00;
		int menuOpcoes;
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("====================================");
		System.out.println("    BANCO DA REPÚBLICA FEDERATIVA   ");
		System.out.println("    DOS ESTADOS UNIDOS DO BRASIL    ");
		System.out.println("          Reserva Federal        ");
		System.out.println("====================================");
		
		// Autenticação do usuário com limites de tentativas
		do {
			
		System.out.print("Digite sua senha: ");
		senhaDigitada = sc.next();
		
		if (!senhaDigitada.equals("0123")) {
			tentativas++;
			System.out.println("SENHA INVÁLIDA."); 
		} 
				
		
		} while (tentativas < 3 && !senhaDigitada.equals("0123"));
		
		// O acesso será liberado se a autenticação do usuário for válida
		if (senhaDigitada.equals("0123")){
			System.out.println("Bem-vindo, " + usuario + "!");
		
		// O menu permanecerá ativo até o usuário encerrar a sessão.	
		do {
		
		System.out.println("====================================");
		System.out.println("ESCOLHA UMA OPÇÃO PARA CONSULTA: ");
		System.out.println("(1) CONSULTAR SALDO");
		System.out.println("(2) SAQUES");
		System.out.println("(3) DEPÓSITOS");
		System.out.println("(4) TRANSFERÊNCIAS");
		System.out.println("(5) PAGAR BOLETOS");
		System.out.println("(6) SAIR DO MENU");
		System.out.println("====================================");
		menuOpcoes = sc.nextInt();
		
		switch (menuOpcoes) {
		
		case 1:
			
			System.out.printf("Saldo da conta: R$ %.2f%n",saldo);
		
		break;
		
		case 2:
			
			// Valida o valor solicitado e verifica a disponibilidade de saldo
			System.out.println("Realizar saque");
			System.out.print("Valor: R$ ");
			double saque = sc.nextDouble();
			
			if (saque <= 0) {
				System.out.println("OPERAÇÃO INVÁLIDA");
			}
			else if (saque > saldo) {
				System.out.println("SALDO INSUFICIENTE");
			}
			else {
			saldo = saldo - saque;
			}
			
		break;
		
		case 3:
			
			System.out.println("Realizar depósito");
			System.out.print("Valor: R$ ");
			double deposito = sc.nextDouble();
			
			// Aceita somente valores positivos antes de atualizar o saldo
			if (deposito > 0) {
			saldo = saldo + deposito;
			System.out.println("DEPÓSITO REALIZADO COM SUCESSO!");
			}
			else {
				System.out.println("OPERAÇÃO INVÁLIDA. ");
			}
			
		break;
		
		case 4:
			
			System.out.println("Realizar transferência");
			System.out.print("Destinatário: ");
			
			// Consome a quebra de linha pendente antes de ler o nome completo
			sc.nextLine();
			String destinatario = sc.nextLine();
			
			System.out.print("Valor: R$ ");
			double transfSaldo = sc.nextDouble();
			
			if (transfSaldo <= 0){
				System.out.println("VALOR INVÁLIDO");
			}
			else if (transfSaldo > saldo) {
				System.out.println("OPERAÇÃO INVÁLIDA");
			}
			else {
			saldo = saldo - transfSaldo;    // A transferência só é realizada com valor válido e saldo suficiente
			System.out.printf("Transferência realizada no valor de R$ %.2f%n" ,transfSaldo);
			System.out.println("Para: " + destinatario);
			}
			
		break;
		
		case 5:
			
			System.out.println("Pagar conta");
			System.out.print("Descrição: ");
			sc.nextLine();
			String contaPaga = sc.nextLine();
			System.out.print("Valor: R$ ");
			double pagarConta = sc.nextDouble();
			sc.nextLine();
			
			
			if (pagarConta <= 0) {
				System.out.println("VALOR INVÁLIDO");
			}
			else if (pagarConta > saldo) {
				System.out.println("SALDO INSUFICIENTE");
			}
			else {
			saldo = saldo - pagarConta;   // Valida o pagamento antes de descontar o valor da conta
			System.out.printf("BOLETO NO VALOR DE R$ %.2f PAGO COM SUCESSO.%n",pagarConta);
			}
		
		case 6:
			
			
		break;
		
		default:	
			System.out.println("Opção inválida.");
		break;
		}
		
		} while (menuOpcoes != 6);
		
		
		if (menuOpcoes == 6) {
			System.out.println("OPERAÇÃO ENCERRADA COM SUCESSO.");  // Encerra a sessão após a escolha da opção 6
		}
		
		} else {
			System.out.println("ACESSO BLOQUEADO");
			System.out.println("Aguarde 24 horas para retornar."); // Bloqueia o acesso após três tentativas com dados inválidos.
			}
		
		sc.close();
	}
	}
