package co.edu.uptc.model;

public class Empleado {
	
    private int idEmpleado;  
 	private String nombre;
    private String apellido;
    
    
    public Empleado(){
    	
    }
    
    public void setIdEmpleado(int idEmpleado) {
    	this.idEmpleado = idEmpleado;
    }
    
    public int getTipoEmpleado() {
    	return idEmpleado;
    }
    
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public String getNombre() {
    	return nombre;
    }
    
    public void setApellido(String apellido) {
    	this.apellido = apellido;
    }
    
    public String getApellido() {
    	return apellido;
    }
}
