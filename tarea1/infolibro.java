package tarea1;
public class infolibro {
    public static void main(String[] args) {
        Libro libro = new Libro("Como entender a las personas", "Night Wolf", "1234567890");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("ISBN: " + libro.getISBN());
        libro.setPrestado(true);
        System.out.println("¿Está prestado?: " + libro.isPrestado());
    }
}

