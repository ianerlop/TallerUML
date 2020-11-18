package empleados;
import java.util.Date;

public abstract class Empleado {
	private String nombreDeConductor;
	private Date fechaNacimiento;
	private String direccion;	
	
	public Empleado(String nombreDeConductor, Date fechaNacimiento, String direccion) {
		super();
		this.nombreDeConductor = nombreDeConductor;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public String getNombreDeConductor() {
		return nombreDeConductor;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void setNombreDeConductor(String nombreDeConductor) {
		this.nombreDeConductor = nombreDeConductor;
	}
}
