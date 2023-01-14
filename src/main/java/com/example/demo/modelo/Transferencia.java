package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "transferencia")
public class Transferencia {

	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "trans_sq")
	//Buena practica el nombre se le coloca el mismo de la secuencia
	@SequenceGenerator(name ="trans_sq",sequenceName = "trans_sq",allocationSize = 1)
	@Column(name = "trasf_origen")
	private String cuentaOrigen;

	@Column(name = "trasf_destino")
	private String cuentaDestino;

	@Column(name = "trasf_monto")
	private BigDecimal monto;
	
	
	
	
	@Override
	public String toString() {
		return "Transferencia [cuentaOrigen=" + cuentaOrigen + ", cuentaDestino=" + cuentaDestino + ", monto=" + monto
				+ "]";
	}
	//SET y GET
	public String getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public String getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
	
	
	

}
