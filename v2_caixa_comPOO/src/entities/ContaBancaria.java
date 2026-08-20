package entities;

import java.util.Scanner;

public class ContaBancaria {

	public String titular;
	public double saldo;
	
Scanner sc = new Scanner(System.in);

public void deposito () {
	
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
	
}
	
public void sacar () {
	
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
	
}

public void mostrarSaldo () {
	System.out.printf("Saldo da conta: R$ %.2f%n",saldo);
}

public void transferencia() {
	
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
	
}


public void pagarConta() {
	
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
	
}



} // fim da classe