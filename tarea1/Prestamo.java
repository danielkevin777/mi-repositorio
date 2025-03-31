package tarea1;
public class Prestamo {
    private Usuario usuario;
    private Libro libro;
    private String fechaPrestamo;
    private String fechaDevolucion;
    public Prestamo(Usuario usuario, Libro libro, String fechaPrestamo, String fechaDevolucion) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
    public void mostrarInfoPrestamo() {
        System.out.println("Prestamo a: " + usuario.getNombre() + " (ID: " + usuario.getId() + ")");
        System.out.println("Libro: " + libro.getTitulo() + " - Autor: " + libro.getAutor());
        System.out.println("Fecha de préstamo: " + fechaPrestamo);
        System.out.println("Fecha de devolución: " + fechaDevolucion);
    }
}

