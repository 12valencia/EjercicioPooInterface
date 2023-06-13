public class Main {
    public static void main(String[] args) {

        ReproductorMusica reproductor1 = new ReproductoMp3("Mi reproductor MP3");
        ReproductorMusica reproductor2 = new ReproductorStreaming("Mi reproductor de streaming");

        // Ejemplo de uso de los métodos
        reproductor1.reproducir();
        reproductor1.pausar();
        reproductor1.detener();
        System.out.println("Nombre del reproductor: " + reproductor1.getNombreReproductor());

        reproductor2.reproducir();
        reproductor2.pausar();
        reproductor2.detener();
        System.out.println("Nombre del reproductor: " + reproductor2.getNombreReproductor());
    }
    }
