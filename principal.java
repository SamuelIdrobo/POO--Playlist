import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ---- Canción 1 ----
        System.out.println("=== Canción 1 ===");
        System.out.print("Ingrese el título de la canción: ");
        String titulo1 = sc.nextLine();

        System.out.print("Ingrese el artista: ");
        String artista1 = sc.nextLine();

        System.out.print("Ingrese la duración en segundos: ");
        int duracion1 = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese el género: ");
        String genero1 = sc.nextLine();

        cancion cancion1 = new cancion(titulo1, artista1, duracion1, genero1);


        // ---- Canción 2 ----
        System.out.println("\n=== Canción 2 ===");
        System.out.print("Ingrese el título de la canción: ");
        String titulo2 = sc.nextLine();

        System.out.print("Ingrese el artista: ");
        String artista2 = sc.nextLine();

        System.out.print("Ingrese la duración en segundos: ");
        int duracion2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el género: ");
        String genero2 = sc.nextLine();

        cancion cancion2 = new cancion(titulo2, artista2, duracion2, genero2);


        // ---- Canción 3 ----
        System.out.println("\n=== Canción 3 ===");
        System.out.print("Ingrese el título de la canción: ");
        String titulo3 = sc.nextLine();

        System.out.print("Ingrese el artista: ");
        String artista3 = sc.nextLine();

        System.out.print("Ingrese la duración en segundos: ");
        int duracion3 = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el género: ");
        String genero3 = sc.nextLine();

        cancion cancion3 = new cancion(titulo3, artista3, duracion3, genero3);


        // ---- Usar los métodos ----
        System.out.println("\nReproduciendo canciones...");
        cancion1.reproducir();
        cancion2.reproducir();
        cancion3.reproducir();

        System.out.println("\nDetalles de las canciones:");
        System.out.println(cancion1.obtenerDetalles());
        System.out.println(cancion2.obtenerDetalles());
        System.out.println(cancion3.obtenerDetalles());
        

        sc.close();
    }
}