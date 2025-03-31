package tarea1;
public class Docente extends Usuario {
    private String departamento;  
    public Docente(String nombre, String id, String departamento) {
        super(nombre, id);
        this.departamento = departamento;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Docente: " + getNombre() + ", ID: " + getId() + ", Departamento: " + departamento);
    }
}

