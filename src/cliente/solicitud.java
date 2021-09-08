
package cliente;


import java.util.ArrayList;
import java.util.Date;

public class solicitud {
    private int numero, total;
    private Date fecha;
    private Cliente cliente;
    private ArrayList<productos> productos=new ArrayList<productos>();
    private Date Sysdate;

    public solicitud() {
    }

    public solicitud(int numero, int total, Date fecha, Cliente cliente) {
        this.numero = numero;
        this.total = total;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        if (String.valueOf(fecha)<=Sysdate) {
            this.fecha = fecha;
        } else {
            
        }
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<productos> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Solicitud {" + "numero=" + numero + ", total=" + total + ", fecha=" + fecha + ", cliente=" + cliente + ", productos=" + productos + '}';
    }
    
    // creacion metodo para agregar un producto
    public void agregarProducto(productos prod){
        productos.add(prod);
    }
    // metodo que permite ver el detalle de los productos
    // solicitados por el cliente
    public void listadoProductos(){
        for (productos item : productos) {
            System.out.println("Producto:"+item.toString());
        }
    }
    // metodo que determine el descuento en un % variable
    public float descuento(float porcentaje){
        float desc= total*porcentaje;
        return desc;
    }
}   
    