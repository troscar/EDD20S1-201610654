
package MOneda;

/**
 *
 * @author Ozcar
 */
public class Moneda {
    
    String usuario;
    int cantidad;
    int valor;

    public Moneda(String usuario, int cantidad, int valor) {
        this.usuario = usuario;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    /**
     * 
     * @param IMPLEMENTTACION DE LAS FUNCIONES DE UN MONEDERO DE LAS TRANFERENCIAS POR MONEDA 
     * @return 
     */
    Moneda transferencia (int cantidad_transferida){
        if((cantidad - cantidad_transferida)>0){
           return this; 
        }else{
           return this;
        }
    }
    
    Moneda transferenciaFrom (int cantidad_tranferida,String Usuario_destino){
        if((cantidad - cantidad_tranferida)>0){
            this.cantidad = cantidad_tranferida;
            this.usuario = Usuario_destino; 
           return this ; 
        }else{
           return null;
        }
    }
    
}
