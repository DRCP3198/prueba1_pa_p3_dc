package com.example.demo.repocorreccion;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Transferencia;
import com.example.demo.modelocorrecion.Transfer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TransferenciaRepositoryImpl implements ITransferenciaRepo {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Transfer transferencia) {
		this.entityManager.persist(transferencia);
	}

	@Override
	public void actualizar(Transfer transferencia) {
		this.entityManager.merge(transferencia);
	}

	@Override
	public Transfer buscar(Integer id) {
		return this.entityManager.find(Transfer.class, id);
	}

	@Override
	public void borrar(Integer id) {
		Transfer t = this.buscar(id);
		this.entityManager.remove(t);
	}
}
	

	


