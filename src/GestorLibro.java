
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joffre
 */
public class GestorLibro {

    ArrayList<Libro> libros = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    //private ArrayList<Integer>ejemplares=new ArrayList<Integer>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        int numEjemplar = 0;
        for (int i = 0; i < libro.getStock(); i++) {
            libro.ejemplares.add(new Ejemplar(numEjemplar, libro.getIdLibro(), "Bueno"));
            numEjemplar++;
        }
        System.out.println("Libro agregado correctamente");
    }

    public void eliminarLibro(String idLibro) {
        if (!existenLibros()) {
            Libro libro = buscarLibro(idLibro);
            if(libro != null){
                libros.remove(libro);
                System.out.println("Libro eliminado exitosamente");
            }else{
                System.out.println("El libro no se encuentra registrado");
            }
        } else {
            System.out.println("\nNo existen libros registrados\n");
        }
    }
    
    //EXTRACT METHOD
    public boolean existenLibros(){
        return libros.isEmpty();
    }

    public Libro buscarLibro(String idLibro) {
        for (Libro libro : libros) {
            if (libro.getIdLibro().equals(idLibro)) {
                return libro;
            } else {
                return null;
            }
        }
        return null;
    }

}
