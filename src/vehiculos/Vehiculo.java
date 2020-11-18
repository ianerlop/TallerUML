package vehiculos;

import java.util.Date;

public abstract class Vehiculo {
	private String numRegistro;
	private double capacidadMotor;
	private Date proxFechaPrueba;
	private Fabricante fabricante;
	
	public Vehiculo(String numRegistro, double capacidadMotor, Date proxFechaPrueba, Fabricante fabricante) {		
		this.numRegistro = numRegistro;
		this.capacidadMotor = capacidadMotor;
		this.proxFechaPrueba = proxFechaPrueba;
		this.fabricante=fabricante;
	}

	public String getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(String numRegistro) {
		this.numRegistro = numRegistro;
	}

	public double getCapacidadMotor() {
		return capacidadMotor;
	}		

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setCapacidadMotor(double capacidadMotor) {
		this.capacidadMotor = capacidadMotor;
	}

	public Date getProxFechaPrueba() {
		return proxFechaPrueba;
	}

	public void setProxFechaPrueba(Date proxFechaPrueba) {
		this.proxFechaPrueba = proxFechaPrueba;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
}
