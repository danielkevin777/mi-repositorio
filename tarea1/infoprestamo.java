package tarea1;
public class infoprestamo{
    public static void main(String[] args) {
        // Crear objetos
        Libro libro1 = new Libro("Como entender a las personas", "Daniel Savina", "1234567890");
        Usuario alumno1 = new Alumno("Daniel Savina", "u12345", "Ing.Sistemas");
        // Crear préstamo
        Prestamo prestamo1 = new Prestamo(alumno1, libro1, "01/04/2025", "15/04/2025");
        // Mostrar información del préstamo
        prestamo1.mostrarInfoPrestamo();
    }
}
