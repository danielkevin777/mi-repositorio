package tarea1;
public abstract class Usuario {
    private String nombre;
    private String id;
    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    public abstract void mostrarInfo(); 
    // Método abstracto
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
