package vehiculos;

import java.util.Date;

import empleados.Permanente;

public class Furgoneta extends VehiculoCarga {
	
	private double pesoSinCarga;
	private double capacidadCarga;
	
	
	public Furgoneta(String numRegistro, double capacidadMotor, Date proxFechaPrueba, double pesoCargado,
			Fabricante fabricante, Permanente asignado, double pesoSinCarga, double capacidadCarga) {
		super(numRegistro, capacidadMotor, proxFechaPrueba, pesoCargado, fabricante, asignado);
		this.pesoSinCarga = pesoSinCarga;
		this.capacidadCarga = capacidadCarga;
	}
	
	public double getPesoSinCarga() {
		return pesoSinCarga;
	}
	
	public void setPesoSinCarga(double pesoSinCarga) {
		this.pesoSinCarga = pesoSinCarga;
	}
	
	public double getCapacidadCarga() {
		return capacidadCarga;
	}
	
	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	
}
