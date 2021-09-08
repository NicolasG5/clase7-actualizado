
package cliente;


public class Cliente {
    private String run,nombre,mail,direccion;
    private char dv;
    private int telefono;
   

    public Cliente() {
    }

    public Cliente(String run, String nombre, String mail, String direccion, char dv, int telefono) {
        this.run = run;
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
        this.dv = dv;
        this.telefono = telefono;
    }

    

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if (mail.length()==6) {
            this.mail = mail;
            
        } else {
            throw new IllegalArgumentException("Solo el correo debe tener como minimo 6 caracteres");
        }
        
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        if (String.valueOf(telefono).length()==8) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("Solo el telefono debe tener como minimo 8 caracteres");
            
        }
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "run=" + run + ", nombre=" + nombre + ", mail=" + mail + ", direccion=" + direccion + ", dv=" + dv + ", telefono=" + telefono + '}';
    }
    
    
    
}
