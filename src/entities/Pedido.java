package entities;

import java.util.Date;

import entities.enuns.StatusDoPedido;

public class Pedido {

	private Integer id;
	private Date momento;
	private StatusDoPedido status;

	public Pedido(Integer id, Date momento, StatusDoPedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Pedido() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}

}
