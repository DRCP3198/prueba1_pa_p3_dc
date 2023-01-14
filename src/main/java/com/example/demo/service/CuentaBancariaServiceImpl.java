package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.repository.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepo bancariaRepo;
	
	@Override
	public void asignar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepo.crear(bancaria);
	}

	@Override
	public void modificar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepo.actualizar(bancaria);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.bancariaRepo.buscar(numero);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		this.bancariaRepo.borrar(id);
	}

}
