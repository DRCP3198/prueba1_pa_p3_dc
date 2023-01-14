package com.example.demo.repository;

import com.example.demo.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {

	public void crear(CuentaBancaria bancaria);
	public void actualizar(CuentaBancaria bancaria);
	public CuentaBancaria buscar(String numero);
	public void borrar(String id);
	
	
	
}
