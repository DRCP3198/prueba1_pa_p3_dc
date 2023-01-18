package com.example.demo.repocorreccion;

import org.springframework.stereotype.Repository;

import com.example.demo.modelocorrecion.Cuenta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaRepositoryImpl implements ICuentaRepo {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Cuenta cuenta) {
		this.entityManager.persist(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		this.entityManager.merge(cuenta);
	}

	@Override
	public Cuenta buscar(String numero) {
		return this.entityManager.find(Cuenta.class, numero);
	}

	@Override
	public void eliminar(String numero) {
		Cuenta cuenta = this.buscar(numero);
		this.entityManager.remove(cuenta);
	}
}
