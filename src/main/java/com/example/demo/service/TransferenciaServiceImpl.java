package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.modelo.Transferencia;
import com.example.demo.repository.ICuentaBancariaRepo;
import com.example.demo.repository.ITransferenciaRepo;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService{

	
	@Autowired
	private ITransferenciaRepo iTransferenciaRepo;
	
	@Autowired
	private ICuentaBancariaRepo bancariaRepo;
	
	@Override
	public void crear(Transferencia bancaria) {
		// TODO Auto-generated method stub
		this.iTransferenciaRepo.crear(bancaria);
	}

	@Override
	public void actualizar(Transferencia bancaria) {
		// TODO Auto-generated method stub
		this.iTransferenciaRepo.actualizar(bancaria);
	}

	@Override
	public Transferencia buscar(String numero) {
		// TODO Auto-generated method stub
		return this.iTransferenciaRepo.buscar(numero);
	}

	@Override
	public void realizarTransferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria orige = this.bancariaRepo.buscar(origen);
		if(monto.equals(orige.getSaldo())) {
			//orige.getSaldo()
		}
		
	}
	
	

}
