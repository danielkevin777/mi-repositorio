package tareaS3s1;
public class persona {
    protected String nombre;
    protected int edad;
    protected String dni;
    void mostrarDatos(){
        System.out.println("Nombre"+getNombre());
        System.out.println("Edad"+getEdad());
        System.out.println("DNI"+getDni());
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;    
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
