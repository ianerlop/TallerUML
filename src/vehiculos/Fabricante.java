package vehiculos;

public class Fabricante {
	private String nombre;
	private Vehiculo[] vehiculos;
	
	public Fabricante(String nombre, Vehiculo[] vehiculos) {		
		this.nombre = nombre;
		this.vehiculos = vehiculos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}
	
}
