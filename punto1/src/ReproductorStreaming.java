public class ReproductorStreaming implements ReproductorMusica{
    private String nombreReproductor;

    public ReproductorStreaming(String nombreReproductor) {
        this.nombreReproductor = nombreReproductor;
    }


    public void reproducir() {
        System.out.println("Reproduciendo música en el reproductor de streaming");
    }


    public void pausar() {
        System.out.println("Pausando música en el reproductor de streaming");
    }

    public void detener() {
        System.out.println("Deteniendo música en el reproductor de streaming");
    }


    public String getNombreReproductor() {
        return nombreReproductor;
    }
}
