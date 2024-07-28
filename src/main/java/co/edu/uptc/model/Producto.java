package co.edu.uptc.model;

public class Producto {
	private String nombreProducto;
	private int precioProducto;
	private String descripcionProducto;
	private int cantidadEnStock;
	
	public Producto() {
		
	}
	
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	public String nombreProducto() {
		return nombreProducto;
	}
	
	public void setPrecioProducto(int precioProducto){
		this.setPrecioProducto(precioProducto);
	}
	
	public int getPrecioProducto() {
		return precioProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
				
	}
	
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	
	public void setCantidadStock(int cantidadEnStock) {
		this.cantidadEnStock = cantidadEnStock;
	}
	
	public int getCantidadEnStock() {
		return cantidadEnStock;
	}
	
	public String toString() {
		StringBuilder informacionProducto = new StringBuilder();
		informacionProducto.append("Nombre Producto: ").append(getPrecioProducto())
		.append("Precio Producto: ").append(getPrecioProducto())
		.append("Descripcion Producto: ").append(getPrecioProducto())
		.append("Cantidad en Stock: ").append(getCantidadEnStock());
		return informacionProducto.toString();
	}
}
 