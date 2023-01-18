package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.modelocorrecion.Cuenta;
import com.example.demo.service.ICuentaBancariaService;
import com.example.demo.servicecorreccion.ICuentaService1;
import com.example.demo.servicecorreccion.ITransferenciaService1;

@SpringBootApplication
public class Prueba1PaP3DcApplication implements CommandLineRunner {

	/*@Autowired
	private ICuentaBancariaService bancariaService;
	*/
	@Autowired
	private ICuentaService1 cuentaService;
	
	@Autowired
	private ITransferenciaService1 iTransferenciaService2;
	
	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaP3DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*CuentaBancaria cuentaOrigen= new CuentaBancaria();
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
		this.bancariaService.asignar(cuentaDestino);*/
		
		Cuenta cuentaOrigen = new Cuenta();
		cuentaOrigen.setNumero("132");
		cuentaOrigen.setTipo("A");
		cuentaOrigen.setSaldo(new BigDecimal(100));
		cuentaOrigen.setCedulaPropietario("1321651");
		
		this.cuentaService.guardar(cuentaOrigen);

		
		Cuenta cuentaDestino = new Cuenta();
		cuentaDestino.setNumero("133");
		cuentaDestino.setTipo("A");
		cuentaDestino.setSaldo(new BigDecimal(50));
		cuentaDestino.setCedulaPropietario("1321651");
		
		this.cuentaService.guardar(cuentaDestino);
		
		
		this.iTransferenciaService2.realizar("132", "133", new BigDecimal(10));
		
		System.out.println("El saldo actual es: ");
		System.out.println(this.cuentaService.encontrar("132").getSaldo());
		
	}

}
