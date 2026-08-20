package conta.bancaria;

import java.util.Scanner;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Dados de autenticação e controle de tentativas
		int tentativas = 0;
		String senhaDigitada = "";
				
		
		int menuOpcoes;
		
		ContaBancaria usuarioDados = new ContaBancaria();
		
		// Dados primários da conta do usuário
		usuarioDados.titular = "Gabriel";
		usuarioDados.saldo = 2500.00;
		
		System.out.println("=============================");
		System.out.println("BANCO DA REPÚBLICA FEDERATIVA");
		System.out.println("DOS ESTADOS UNIDOS DO BRASIL");
		System.out.println("        Reserva Federal     ");
		System.out.println("=============================");
		
		do {
			
			System.out.print("Digite sua senha: ");
			senhaDigitada = leia.next();
			
			if (!senhaDigitada.equals("0123")) {
				tentativas++;
				System.out.println("SENHA INVÁLIDA."); }
			
					
			
			} while (tentativas < 3 && !senhaDigitada.equals("0123"));
			
			// O acesso será liberado se a autenticação do usuário for válida
			if (senhaDigitada.equals("0123")) {
				System.out.println("Bem-vindo, " + usuarioDados.titular + "!");
			
			
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
			menuOpcoes = leia.nextInt();
			
			switch (menuOpcoes) {
			
			case 1:
				
				usuarioDados.mostrarSaldo();
			
			break;
			
			case 2:
				
				usuarioDados.sacar();
				
			break;
			
			case 3:
				
				usuarioDados.deposito();
				
			break;
			
			case 4:
				
				usuarioDados.transferencia();
				
			break;
			
			case 5:
				
				usuarioDados.pagarConta();
			
				break;
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
			
			
/* Caso o usuário erre a senha durante três vezes, 
 * seu acesso será bloqueado e portanto o programa não continuará.
 */
			} else {   
				System.out.println("ACESSO BLOQUEADO");
				System.out.println("Aguarde 24 horas para retornar."); // Bloqueia o acesso após três tentativas com dados inválidos.
				}
			
			leia.close();	
			
	}
}