package com.example.demo.servicecorreccion;

import com.example.demo.modelocorrecion.Cuenta;

public interface ICuentaService1 {
	
	public void guardar(Cuenta cuenta);
	public void modificar(Cuenta cuenta);
	public Cuenta encontrar(String numero);
	public void borrar(String numero);

}
