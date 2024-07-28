package co.edu.uptc.model;

public class TipoProducto {
   private int idTipoProducto;
   private String nombreTipoProducto;

   
   public TipoProducto() {
	   
   }
   
   public void setIdTipoProducto(int idTipoProducto) {
	   this.idTipoProducto = idTipoProducto;
   }
   
   public int getIdTipoProducto() {
	   return idTipoProducto;
   }
   
   public void setNombreTipoProducto(String nombreTipoProducto) {
	   this.nombreTipoProducto = nombreTipoProducto;
   }
   
   public String getNombreTipoProducto() {
	   return nombreTipoProducto;
   }
   
   
   public String toString() {
	   StringBuilder informacionProducto = new StringBuilder();
	   informacionProducto.append("Id Tipo Producto: ").append(getIdTipoProducto())
	   .append("Nombre Tipo Producto: ").append(getNombreTipoProducto());
	   return informacionProducto.toString();
   }
   
}
