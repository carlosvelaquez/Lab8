package lab8;

public class Contacto {
    private String nombre;
    private String numero;
    private String correoElectronico;
    private String direccion;
    private char genero;
    private int edad;

    public Contacto(String nombre, String numero, String correoElectronico, String direccion, char genero, int edad) {
        this.nombre = nombre;
        this.numero = numero;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.genero = genero;
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + "(" + numero + ")";
    }
    
    
}
