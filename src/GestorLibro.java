
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Joffre
 */
public class GestorLibro {

    int index;
    private ArrayList<Libro> libros = new ArrayList<Libro>();
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
        Iterator<Libro> iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro libro1 = iterator.next();
            if (libro1.getIdLibro().equals(idLibro)) {
                iterator.remove();
                System.out.println("Libro eliminado exitosamente");
                break;
            } else {
                System.out.println("El libro no existe");
            }
        }
    }

    public void buscarLibro(String idLibro) {
        String estado;
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            Libro libro1 = it.next();
            if (libro1.getIdLibro().equals(idLibro)) {
                System.out.print(libro1.toString());
            } else {
                System.out.print("\nEl libro no existe\n");
            }
        }
    }

    public void agregarEjemplar(String idLibro, String estado) {
        Iterator<Libro> iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro libro1 = iterator.next();
            if (libro1.getIdLibro().equals(idLibro)) {
                int index1 = libro1.getStock();
                libro1.ejemplares.add(new Ejemplar(index1++, libro1.getIdLibro(), estado));
                System.out.println("Ejemplar agregado\n");
                libro1.setStock(index1++);
                break;
            } else {
                System.out.println("El libro no existe\n");
            }
        }
    }
}
