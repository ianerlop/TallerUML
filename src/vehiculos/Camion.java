package vehiculos;

import java.util.Date;

import empleados.Permanente;

public class Camion extends VehiculoCarga{
	private int numeroRuedas;
	private double capacidadRemolque;
	private String licencia;
	private Remolque[] remolques;

	public Camion(String numRegistro, double capacidadMotor, Date proxFechaPrueba, double pesoCargado,
			Fabricante fabricante, Permanente asignado, int numeroRuedas, double capacidadRemolque, String licencia,
			Remolque[] remolques) {
		super(numRegistro, capacidadMotor, proxFechaPrueba, pesoCargado, fabricante, asignado);
		this.numeroRuedas = numeroRuedas;
		this.capacidadRemolque = capacidadRemolque;
		this.licencia = licencia;
		this.remolques = remolques;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public double getCapacidadRemolque() {
		return capacidadRemolque;
	}

	public void setCapacidadRemolque(double capacidadRemolque) {
		this.capacidadRemolque = capacidadRemolque;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public Remolque[] getRemolques() {
		return remolques;
	}

	public void setRemolques(Remolque[] remolques) {
		this.remolques = remolques;
	}
	
}
