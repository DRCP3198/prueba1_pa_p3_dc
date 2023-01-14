package com.example.demo.repository;

import com.example.demo.modelo.Transferencia;

public interface ITransferenciaRepo {

	public void crear(Transferencia bancaria);
	public void actualizar(Transferencia bancaria);
	public Transferencia buscar(String numero);
	
}
