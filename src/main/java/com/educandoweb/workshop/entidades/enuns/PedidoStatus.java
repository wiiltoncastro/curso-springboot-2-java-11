package com.educandoweb.workshop.entidades.enuns;

public enum PedidoStatus {

	ESPERANDO_PAGAMENTO(1),
	PAGO(2),
	ENVIADO(3),
	ENTREGUE(4),
	CANCELADO(5);
	
	private int codigo;

	//construtor
	private PedidoStatus(int codigo) {
		this.codigo = codigo;
	}

	//gets
	public int getCodigo() {
		return codigo;
	}
	
	//metodos
	public static PedidoStatus valorDe(int codigo) {
		for(PedidoStatus valor : PedidoStatus.values()) {
			if (valor.getCodigo() == codigo) {
				return valor;
			}
		}
		throw new IllegalArgumentException("Codigo do PedidoStatus inválido");
	}
}
