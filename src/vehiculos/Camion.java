package vehiculos;

import java.util.Date;

import empleados.Permanente;

public class Camion extends VehiculoCarga{
	private int numeroRuedas;
	private double capacidadRemolque;
	private String licencia;

	public Camion(String numRegistro, double capacidadMotor, Date proxFechaPrueba, double pesoCargado,
			Fabricante fabricante, Permanente asignado, int numeroRuedas, double capacidadRemolque, String licencia) {
		super(numRegistro, capacidadMotor, proxFechaPrueba, pesoCargado, fabricante, asignado);
		this.numeroRuedas = numeroRuedas;
		this.capacidadRemolque = capacidadRemolque;
		this.licencia = licencia;
	}

	public int getnumeroRuedas() {
		return numeroRuedas;
	}
	
	public double getcapacidadRemolque() {
		return capacidadRemolque;
	}
	
	public String getlicencia() {
		return licencia;
	}

	public void setnumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	
	public void setcapacidadRemolque(double capacidadRemolque) {
		this.capacidadRemolque=capacidadRemolque;
	}
	
	public void setlicencia(String licencia) {
		this.licencia=licencia;
	}
		
}
