public class ReproductoMp3 implements ReproductorMusica{
    private String nombreReproductor;

    public ReproductoMp3(String nombreReproductor) {
        this.nombreReproductor = nombreReproductor;
    }


    public void reproducir() {
        System.out.println("Reproduciendo música en el reproductor MP3");
    }

    public void pausar() {
        System.out.println("Pausando música en el reproductor MP3");
    }


    public void detener() {
        System.out.println("Deteniendo música en el reproductor MP3");
    }


    public String getNombreReproductor() {
        return nombreReproductor;
    }
}
