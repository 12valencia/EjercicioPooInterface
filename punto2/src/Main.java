public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Gran Gatsby", "F. Scott Fitzgerald", 159.909);
        Libro libro2 = new Libro("1984", "George Orwell", 120.950);

        // Mostrar información de los libros
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        // Obtener precios de los libros
        double precioLibro1 = libro1.obtenerPrecio();
        double precioLibro2 = libro2.obtenerPrecio();

        System.out.println("Precio del libro 1: " + precioLibro1);
        System.out.println("Precio del libro 2: " + precioLibro2);
    }
    }
