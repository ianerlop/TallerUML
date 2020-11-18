package empleados;

import java.util.Date;
import java.time.*;

public class Contratista extends Empleado {
	private String nombreEmpresa;
	private Date fechaInicio;
	private LocalTime duracion;
	
	public Contratista(String nombreDeConductor, Date fechaNacimiento, String direccion, String nombreEmpresa,
			Date fechaInicio, LocalTime duracion) {
		super(nombreDeConductor, fechaNacimiento, direccion);
		this.nombreEmpresa = nombreEmpresa;
		this.fechaInicio = fechaInicio;
		this.duracion = duracion;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalTime getDuracion() {
		return duracion;
	}

	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}
	
	
	
}
