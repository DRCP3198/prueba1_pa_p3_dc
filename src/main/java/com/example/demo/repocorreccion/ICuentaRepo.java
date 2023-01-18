package com.example.demo.repocorreccion;

import com.example.demo.modelocorrecion.Cuenta;

public interface ICuentaRepo {
	public void insertar(Cuenta cuenta);
	public void actualizar(Cuenta cuenta);
	public Cuenta buscar(String numero);
	public void eliminar(String numero);
}
