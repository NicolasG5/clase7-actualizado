
package cliente;


public class productos {
    private int codigo,precio;
    private String subcategoria,descripcion,medida;

    public productos() {
    }

    public productos(int codigo, int precio, String subcategoria, String descripcion, String medida) {
        this.codigo = codigo;
        this.precio = precio;
        this.subcategoria = subcategoria;
        this.descripcion = descripcion;
        this.medida = medida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (String.valueOf(codigo).length()==4) {
             this.codigo = codigo;
            
        } else {
            throw new IllegalArgumentException("codigo de largo 4 digitos");
        }
        
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if (precio>0) {
            this.precio = precio;
            
        } else {
            throw new IllegalArgumentException("Precio debe ser mayor a cero");
        }
       
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        if (subcategoria.equalsIgnoreCase("verduras")|| subcategoria.equalsIgnoreCase("frutas")) {
            this.subcategoria = subcategoria;
        } else {
            throw new IllegalArgumentException("Solo frutas o Verduras");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "productos{" + "codigo=" + codigo + ", precio=" + precio + ", suncategoria=" + subcategoria + ", descripcion=" + descripcion + ", medida=" + medida + '}';
    }
    
    
   
    
    
    
}
