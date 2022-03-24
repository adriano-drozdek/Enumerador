package programa;

import java.util.Date;

import entities.Pedido;
import entities.enuns.StatusDoPedido;

public class ProjetoEnum {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(1080, new Date(), StatusDoPedido.AGRARDANDO_PAGAMENTO);
		
		System.out.println(pedido);
	}

}
