package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TransferenciaRepoImpl implements ITransferenciaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crear(Transferencia bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bancaria);
	}

	@Override
	public void actualizar(Transferencia bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(bancaria);
	}

	@Override
	public Transferencia buscar(String numero) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Transferencia.class,numero);
	}

	

}
