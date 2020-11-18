package vehiculos;

import java.util.Date;

import empleados.Permanente;

public class VehiculoCarga extends Vehiculo{
	private double pesoCargado;
	private Permanente asignado;

	public VehiculoCarga(String numRegistro, double capacidadMotor, Date proxFechaPrueba, double pesoCargado, Fabricante fabricante, Permanente asignado) {
		super(numRegistro, capacidadMotor, proxFechaPrueba, fabricante);
		this.pesoCargado = pesoCargado;
		this.asignado=asignado;
	}

	public double getPesoCargado() {
		return pesoCargado;
	}
	
	public Permanente getAsignado() {
		return asignado;
	}

	public void setPesoCargado(double pesoCargado) {
		this.pesoCargado = pesoCargado;
	}
	
	public void setAsignado(Permanente asignado) {
		this.asignado=asignado;
	}
		
}
