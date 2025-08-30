package POO;
public class cancion {
    
// Atributos

private String titulo;
private String artista;
private int duracionSegundos;
private String genero;

// Constructor

public cancion( String titulo, String artista, int duracionSegundos, String genero) {
 this.titulo = titulo;
 this.artista = artista;
 this.duracionSegundos = duracionSegundos;
 this.genero = genero; 

}

// Get y Set

public String getTitulo() {
    return this.titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getArtista() {
    return this.artista;
}

public void setArtista(String artista) {
    this.artista = artista;
}

public int getDuracionSegundos() {
    return this.duracionSegundos;
}

public void setDuracionSegundos(int duracionSegundos ) {
    this.duracionSegundos = duracionSegundos;
}

public String getGenero() {
    return this.genero;
}

public void setGenero(String genero) {
    this.genero = genero;
}

// Metodos

public void reproducir() {
    System.out.println("Reproduciendo: " + this.titulo + " - " + this.artista);
}

public String obtenerDetalles() {
    return "Título: " + this.titulo 
         + ", Artista: " + this.artista 
         + ", Duración: " + this.duracionSegundos + " segundos"
         + ", Género: " + this.genero;
}

}
