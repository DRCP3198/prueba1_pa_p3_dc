package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.modelo.Transferencia;


public interface ITransferenciaService {

	public void crear(Transferencia bancaria);
	public void actualizar(Transferencia bancaria);
	public Transferencia buscar(String numero);
	public void realizarTransferencia(String origen,String destino,BigDecimal monto);
	
}
