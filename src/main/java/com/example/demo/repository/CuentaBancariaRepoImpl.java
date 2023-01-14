package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crear(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bancaria);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancaria.class, numero);
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(bancaria);
		
	}

	@Override
	public void borrar(String id) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta = this.buscar(id);
		this.entityManager.remove(cuenta);
	}




	
	
	

}
