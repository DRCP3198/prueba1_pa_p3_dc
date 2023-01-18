package com.example.demo.servicecorreccion;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelocorrecion.Cuenta;
import com.example.demo.modelocorrecion.Transfer;
import com.example.demo.repocorreccion.ICuentaRepo;
import com.example.demo.repocorreccion.ITransferenciaRepo;
@Service

public class TransferenciaServiceImpl implements ITransferenciaService1 {
	@Autowired
	private ICuentaRepo cuentaRepo;

	@Autowired
	private ITransferenciaRepo iTransferenciaRepo;
	
	@Override
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		// Origen:
				Cuenta origen = this.cuentaRepo.buscar(numeroOrigen);
				BigDecimal comision = monto.multiply(new BigDecimal(0.05));
				BigDecimal mondoDebitar = monto.add(comision);
				BigDecimal saldoActualOrigen = origen.getSaldo();

				
				if(saldoActualOrigen.compareTo(mondoDebitar)<0){
					System.out.println("Monto no permitido");
				}else {
					//Se realiza la transferencia:
					origen.setSaldo(saldoActualOrigen.subtract(mondoDebitar));
					this.cuentaRepo.actualizar(origen);
					
					// Destino:
					Cuenta destino = this.cuentaRepo.buscar(numeroDestino);
					BigDecimal saldoActualDestino = destino.getSaldo();
					destino.setSaldo(saldoActualDestino.add(monto));
					this.cuentaRepo.actualizar(destino);
					
					// Transferencia:
					Transfer transfer = new Transfer();
					transfer.setComision(comision);
					transfer.setFecha(LocalDateTime.now());
					transfer.setMonto(monto);
					transfer.setNumeroOrigen(numeroOrigen);
					transfer.setNumeroDestino(numeroDestino);
					
					this.iTransferenciaRepo.insertar(transfer);
					
				}
				
				
				
				
			
	}

}
