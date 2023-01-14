package com.example.demo.service;

import com.example.demo.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public void asignar(CuentaBancaria bancaria);
	public void modificar(CuentaBancaria bancaria);
	public CuentaBancaria buscar(String numero);
	public void eliminar(String id);
	
	
	
}
