package servicos;


import java.time.LocalDate;

import entidades.Contrato;
import entidades.Parcela;

public class ServicoContrato {
	private ServicoPagamentoOnline servicoPagamentoOnline ;
	
	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	
	public void processoContrato(Contrato contrato,Integer mes) {
		double valorParcela=contrato.getValorTotal()/mes;
		
		
		for(int i=1;i<=mes;i++) {
			LocalDate vencimento = contrato.getData().plusMonths(i);
			double interese=servicoPagamentoOnline.interese(valorParcela,i);
			double valor=servicoPagamentoOnline.pagamentoTaxa(interese);
			contrato.getParcelas().add(new Parcela(vencimento,valor));
		}
	}
	
}
