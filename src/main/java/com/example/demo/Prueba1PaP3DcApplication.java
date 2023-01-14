package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.service.ICuentaBancariaService;

@SpringBootApplication
public class Prueba1PaP3DcApplication implements CommandLineRunner {

	@Autowired
	private ICuentaBancariaService bancariaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaP3DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		CuentaBancaria cuentaOrigen= new CuentaBancaria();
		cuentaOrigen.setCedula("1751457167");
		cuentaOrigen.setNumero("2525");
		cuentaOrigen.setSaldo(new BigDecimal(200));
		cuentaOrigen.setTipo("A");
		//this.bancariaService.asignar(cuentaOrigen);
		
		CuentaBancaria cuentaDestino = new CuentaBancaria();
		cuentaDestino.setCedula("1751457191");
		cuentaDestino.setNumero("1010");
		cuentaDestino.setSaldo(new BigDecimal(300));
		cuentaDestino.setTipo("C");
		this.bancariaService.asignar(cuentaDestino);
		
		
		
	}

}
