package entidades;

import java.time.LocalDate;


public class Parcela {

	private LocalDate vencimento;
	private Double valor;
	
	public LocalDate getVencimento() {
		return vencimento;
	}
	
	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Parcela(LocalDate vencimento, Double valor) {		
		this.vencimento = vencimento;
		this.valor = valor;
	}
	
	public String toString() {
		return vencimento +" - " + valor;
	}
}
