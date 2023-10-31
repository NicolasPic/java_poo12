package servicos;

public class ServicoPagamento implements ServicoPagamentoOnline {

	public Double pagamentoTaxa(Double valor) {
		return valor+valor*0.02;
	}
	
	public Double interese(Double valor,Integer mes) {
		return valor+valor*0.01*mes;
	}
}
