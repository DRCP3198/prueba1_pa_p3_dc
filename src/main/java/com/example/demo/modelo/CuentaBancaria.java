package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuenta_bancaria")
public class CuentaBancaria {
	
/*@Id	
@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "estu_seq")
//Buena practica el nombre se le coloca el mismo de la secuencia
@SequenceGenerator(name ="estu_seq",sequenceName = "estu_seq",allocationSize = 1)*/ 

	@Id
	@Column(name = "cb_numero")
	private String numero;
	
	@Column(name = "cb_tipo")
	private String tipo;
	
	@Column(name = "cb_saldo")
	private BigDecimal saldo;
	
	@Column(name = "cb_cedula_propietario")
	private String cedula;

	@Override
	public String toString() {
		return "CuentaBancaria [numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo + ", cedula=" + cedula + "]";
	}

	//SET y GET
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
}
