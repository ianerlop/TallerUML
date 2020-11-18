package empleados;

import java.util.Date;
import java.util.List;

import vehiculos.VehiculoCarga;

public class Permanente extends Empleado{
	private int seguroSocial;
	private double salario;
	private List<String> referencias;
	private VehiculoCarga vehiculo;
	
	public Permanente(String nombreDeConductor, Date fechaNacimiento, String direccion, int seguroSocial,
			double salario, List<String> referencias, VehiculoCarga vehiculo) {
		super(nombreDeConductor, fechaNacimiento, direccion);
		this.seguroSocial = seguroSocial;
		this.salario = salario;
		this.referencias = referencias;
		this.vehiculo=vehiculo;
	}

	public int getSeguroSocial() {
		return seguroSocial;
	}

	public void setSeguroSocial(int seguroSocial) {
		this.seguroSocial = seguroSocial;
	}

	public double getSalario() {
		return salario;
	}
	
	public VehiculoCarga getVehiculo() {
		return vehiculo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public List<String> getReferencias() {
		return referencias;
	}

	public void setReferencias(List<String> referencias) {
		this.referencias = referencias;
	}
	
	public void setVehiculo(VehiculoCarga vehiculo) {
		this.vehiculo=vehiculo;
	}
	
}
