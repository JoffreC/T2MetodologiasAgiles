
/**
 *
 * @author Joffre
 */
import java.util.ArrayList;

/**
 *
 * @author Joffre
 */
public class Libro {

    private String idLibro;
    private String titulo;
    private String autor;
    private String isbn;
    private int stock;
    private int paginas;
    ArrayList<Ejemplar> ejemplares = new ArrayList<>();

    public Libro(String idLibro, String titulo, String isbn, String autor, int paginas) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.stock = ejemplares.size();
        this.paginas = paginas;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String ISBN) {
        this.isbn = ISBN;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public ArrayList<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(ArrayList<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString() {
        return """
               Libro
               idLibro: """ + idLibro + "\ntitulo: " + titulo + "\nautor: " 
                + autor + "\nisbn: " + isbn + "\nstock: " + stock + ", paginas=" 
                + paginas;
    }
    
    public void agregarEjemplar(Ejemplar ejemplar){
        ejemplares.add(ejemplar);
        System.out.println("Ejemplar agregado\n");
    }

}
