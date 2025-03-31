package tarea1;
public class Alumno extends Usuario {
    private String carrera;
    public Alumno(String nombre, String id, String carrera) {
        super(nombre, id);
        this.carrera = carrera;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Alumno: " + getNombre() + ", ID: " + getId() + ", Carrera: " + carrera);
    }
}
