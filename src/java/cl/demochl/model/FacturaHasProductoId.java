package cl.demochl.model;
// Generated 05-01-2020 18:15:21 by Hibernate Tools 4.3.1



/**
 * FacturaHasProductoId generated by hbm2java
 */
public class FacturaHasProductoId  implements java.io.Serializable {


     private int numFactura;
     private int idProducto;

    public FacturaHasProductoId() {
    }

    public FacturaHasProductoId(int numFactura, int idProducto) {
       this.numFactura = numFactura;
       this.idProducto = idProducto;
    }
   
    public int getNumFactura() {
        return this.numFactura;
    }
    
    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FacturaHasProductoId) ) return false;
		 FacturaHasProductoId castOther = ( FacturaHasProductoId ) other; 
         
		 return (this.getNumFactura()==castOther.getNumFactura())
 && (this.getIdProducto()==castOther.getIdProducto());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getNumFactura();
         result = 37 * result + this.getIdProducto();
         return result;
   }   


}


