package com.example.demo.repocorreccion;

import com.example.demo.modelocorrecion.Transfer;

public interface ITransferenciaRepo {
	public void insertar(Transfer transferencia);
	public void actualizar(Transfer transferencia);
	public Transfer buscar(Integer id);
	public void borrar(Integer id);

	
}