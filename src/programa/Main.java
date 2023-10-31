package programa;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Parcela;
import servicos.ServicoContrato;
import servicos.ServicoPagamento;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.println("Numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.println("Valor de contrato: ");
		double valor = sc.nextDouble();
		Contrato contrato = new Contrato(numero,data,valor);
		System.out.println("Quantas parcelas: ");
		int parcela = sc.nextInt();
		
		ServicoContrato servico = new ServicoContrato(new ServicoPagamento());
		
		servico.processoContrato(contrato, parcela);
		
		System.out.println("Parcelas");
		for(Parcela e : contrato.getParcelas()) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
