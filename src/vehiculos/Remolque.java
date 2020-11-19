package vehiculos;

import java.util.Date;

public class Remolque {
	private String numero;
	private double capacidad;
	private Date ultimoServicio;
	private Camion[] asignado;
	
	public Remolque(String numero, double capacidad, Date ultimoServicio, Camion[] asignado) {		
		this.numero = numero;
		this.capacidad = capacidad;
		this.ultimoServicio = ultimoServicio;
		this.asignado = asignado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public Date getUltimoServicio() {
		return ultimoServicio;
	}

	public void setUltimoServicio(Date ultimoServicio) {
		this.ultimoServicio = ultimoServicio;
	}

	public Camion[] getAsignado() {
		return asignado;
	}

	public void setAsignado(Camion[] asignado) {
		this.asignado = asignado;
	}
		
}
