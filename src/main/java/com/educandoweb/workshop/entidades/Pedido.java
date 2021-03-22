package com.educandoweb.workshop.entidades;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;

	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant momento;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Usuario cliente;

	//construtores
	public Pedido() {
		super();
	}

	public Pedido(Long id, Instant momento, Usuario cliente) {
		super();
		this.id = id;
		this.momento = momento;
		this.cliente = cliente;
	}

	//gets e sets
	public Long getId() {
		return id;
	}

	public Instant getMomento() {
		return momento;
	}

	public void setMomento(Instant momento) {
		this.momento = momento;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}

	//hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	//toString
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", momento=" + momento + ", cliente=" + cliente + "]";
	}
	
	
}